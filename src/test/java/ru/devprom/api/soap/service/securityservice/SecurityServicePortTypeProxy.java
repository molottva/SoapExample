package ru.devprom.api.soap.service.securityservice;

public class SecurityServicePortTypeProxy implements ru.devprom.api.soap.service.securityservice.SecurityServicePortType {
  private String _endpoint = null;
  private ru.devprom.api.soap.service.securityservice.SecurityServicePortType securityServicePortType = null;
  
  public SecurityServicePortTypeProxy() {
    _initSecurityServicePortTypeProxy();
  }
  
  public SecurityServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSecurityServicePortTypeProxy();
  }
  
  private void _initSecurityServicePortTypeProxy() {
    try {
      securityServicePortType = (new ru.devprom.api.soap.service.securityservice.SecurityServiceLocator()).getSecurityServicePort();
      if (securityServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)securityServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)securityServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (securityServicePortType != null)
      ((javax.xml.rpc.Stub)securityServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ru.devprom.api.soap.service.securityservice.SecurityServicePortType getSecurityServicePortType() {
    if (securityServicePortType == null)
      _initSecurityServicePortTypeProxy();
    return securityServicePortType;
  }
  
  public ru.devprom.api.soap.service.securityservice.Token login(java.lang.String username, java.lang.String userpass, java.lang.String project) throws java.rmi.RemoteException{
    if (securityServicePortType == null)
      _initSecurityServicePortTypeProxy();
    return securityServicePortType.login(username, userpass, project);
  }
  
  
}