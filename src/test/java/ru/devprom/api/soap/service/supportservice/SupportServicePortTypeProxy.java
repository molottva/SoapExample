package ru.devprom.api.soap.service.supportservice;

public class SupportServicePortTypeProxy implements ru.devprom.api.soap.service.supportservice.SupportServicePortType {
  private String _endpoint = null;
  private ru.devprom.api.soap.service.supportservice.SupportServicePortType supportServicePortType = null;
  
  public SupportServicePortTypeProxy() {
    _initSupportServicePortTypeProxy();
  }
  
  public SupportServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSupportServicePortTypeProxy();
  }
  
  private void _initSupportServicePortTypeProxy() {
    try {
      supportServicePortType = (new ru.devprom.api.soap.service.supportservice.SupportServiceLocator()).getSupportServicePort();
      if (supportServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)supportServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)supportServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (supportServicePortType != null)
      ((javax.xml.rpc.Stub)supportServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ru.devprom.api.soap.service.supportservice.SupportServicePortType getSupportServicePortType() {
    if (supportServicePortType == null)
      _initSupportServicePortTypeProxy();
    return supportServicePortType;
  }
  
  public ru.devprom.api.soap.service.supportservice.Request raiseIssue(java.lang.String token, ru.devprom.api.soap.service.supportservice.Request issue) throws java.rmi.RemoteException{
    if (supportServicePortType == null)
      _initSupportServicePortTypeProxy();
    return supportServicePortType.raiseIssue(token, issue);
  }
  
  public void attachFile(java.lang.String token, ru.devprom.api.soap.service.supportservice.Request issue, ru.devprom.api.soap.service.supportservice.Attachment file) throws java.rmi.RemoteException{
    if (supportServicePortType == null)
      _initSupportServicePortTypeProxy();
    supportServicePortType.attachFile(token, issue, file);
  }
  
  
}