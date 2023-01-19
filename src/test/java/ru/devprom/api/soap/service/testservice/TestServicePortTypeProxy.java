package ru.devprom.api.soap.service.testservice;

public class TestServicePortTypeProxy implements ru.devprom.api.soap.service.testservice.TestServicePortType {
  private String _endpoint = null;
  private ru.devprom.api.soap.service.testservice.TestServicePortType testServicePortType = null;
  
  public TestServicePortTypeProxy() {
    _initTestServicePortTypeProxy();
  }
  
  public TestServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestServicePortTypeProxy();
  }
  
  private void _initTestServicePortTypeProxy() {
    try {
      testServicePortType = (new ru.devprom.api.soap.service.testservice.TestServiceLocator()).getTestServicePort();
      if (testServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testServicePortType != null)
      ((javax.xml.rpc.Stub)testServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ru.devprom.api.soap.service.testservice.TestServicePortType getTestServicePortType() {
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType;
  }
  
  public ru.devprom.api.soap.service.testservice.Testscenario create(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.create(token, object);
  }
  
  public ru.devprom.api.soap.service.testservice.Testscenario find(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.find(token, object);
  }
  
  public ru.devprom.api.soap.service.testservice.Testscenario append(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario parent, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.append(token, parent, object);
  }
  
  public ru.devprom.api.soap.service.testservice.Testexecution run(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object, java.lang.String version, ru.devprom.api.soap.service.testservice.Environment environment) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.run(token, object, version, environment);
  }
  
  public void reportResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Testexecutionresult result, java.lang.String description) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    testServicePortType.reportResult(token, execution, test, result, description);
  }
  
  public ru.devprom.api.soap.service.testservice.Request reportIssue(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Request issue) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.reportIssue(token, execution, test, issue);
  }
  
  public void reportFile(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Attachment file) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    testServicePortType.reportFile(token, execution, test, file);
  }
  
  public ru.devprom.api.soap.service.testservice.Testexecutionresult getResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution) throws java.rmi.RemoteException{
    if (testServicePortType == null)
      _initTestServicePortTypeProxy();
    return testServicePortType.getResult(token, execution);
  }
  
  
}