package ru.devprom.api.soap.service.dataservice;

public class DataServicePortTypeProxy implements ru.devprom.api.soap.service.dataservice.DataServicePortType {
  private String _endpoint = null;
  private ru.devprom.api.soap.service.dataservice.DataServicePortType dataServicePortType = null;
  
  public DataServicePortTypeProxy() {
    _initDataServicePortTypeProxy();
  }
  
  public DataServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initDataServicePortTypeProxy();
  }
  
  private void _initDataServicePortTypeProxy() {
    try {
      dataServicePortType = (new ru.devprom.api.soap.service.dataservice.DataServiceLocator()).getDataServicePort();
      if (dataServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dataServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dataServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dataServicePortType != null)
      ((javax.xml.rpc.Stub)dataServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ru.devprom.api.soap.service.dataservice.DataServicePortType getDataServicePortType() {
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType;
  }
  
  public ru.devprom.api.soap.service.dataservice.Build buildRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Build buildRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteAddBatch(token, parms);
  }
  
  public int buildRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteStore(token, id, parms);
  }
  
  public void buildRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.buildRemoteStoreBatch(token, parms);
  }
  
  public void buildRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.buildRemoteDelete(token, id);
  }
  
  public void buildRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.buildRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.buildRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteAddBatch(token, parms);
  }
  
  public int requirementRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteStore(token, id, parms);
  }
  
  public void requirementRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requirementRemoteStoreBatch(token, parms);
  }
  
  public void requirementRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requirementRemoteDelete(token, id);
  }
  
  public void requirementRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requirementRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requirementRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Commit commitRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Commit commitRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteAddBatch(token, parms);
  }
  
  public int commitRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteStore(token, id, parms);
  }
  
  public void commitRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commitRemoteStoreBatch(token, parms);
  }
  
  public void commitRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commitRemoteDelete(token, id);
  }
  
  public void commitRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commitRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commitRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteAddBatch(token, parms);
  }
  
  public int reviewrequestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteStore(token, id, parms);
  }
  
  public void reviewrequestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.reviewrequestRemoteStoreBatch(token, parms);
  }
  
  public void reviewrequestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.reviewrequestRemoteDelete(token, id);
  }
  
  public void reviewrequestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.reviewrequestRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.reviewrequestRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteAddBatch(token, parms);
  }
  
  public int testcaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteStore(token, id, parms);
  }
  
  public void testcaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseRemoteStoreBatch(token, parms);
  }
  
  public void testcaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseRemoteDelete(token, id);
  }
  
  public void testcaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteAddBatch(token, parms);
  }
  
  public int testcaseexecutionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteStore(token, id, parms);
  }
  
  public void testcaseexecutionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseexecutionRemoteStoreBatch(token, parms);
  }
  
  public void testcaseexecutionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseexecutionRemoteDelete(token, id);
  }
  
  public void testcaseexecutionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testcaseexecutionRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testcaseexecutionRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteAddBatch(token, parms);
  }
  
  public int testexecutionresultRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteStore(token, id, parms);
  }
  
  public void testexecutionresultRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testexecutionresultRemoteStoreBatch(token, parms);
  }
  
  public void testexecutionresultRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testexecutionresultRemoteDelete(token, id);
  }
  
  public void testexecutionresultRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testexecutionresultRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testexecutionresultRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteAddBatch(token, parms);
  }
  
  public int testscenarioRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteStore(token, id, parms);
  }
  
  public void testscenarioRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testscenarioRemoteStoreBatch(token, parms);
  }
  
  public void testscenarioRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testscenarioRemoteDelete(token, id);
  }
  
  public void testscenarioRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.testscenarioRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.testscenarioRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteAddBatch(token, parms);
  }
  
  public int helppageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteStore(token, id, parms);
  }
  
  public void helppageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.helppageRemoteStoreBatch(token, parms);
  }
  
  public void helppageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.helppageRemoteDelete(token, id);
  }
  
  public void helppageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.helppageRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.helppageRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Activity activityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Activity activityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteAddBatch(token, parms);
  }
  
  public int activityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteStore(token, id, parms);
  }
  
  public void activityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.activityRemoteStoreBatch(token, parms);
  }
  
  public void activityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.activityRemoteDelete(token, id);
  }
  
  public void activityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.activityRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.activityRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteAddBatch(token, parms);
  }
  
  public int attachmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteStore(token, id, parms);
  }
  
  public void attachmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.attachmentRemoteStoreBatch(token, parms);
  }
  
  public void attachmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.attachmentRemoteDelete(token, id);
  }
  
  public void attachmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.attachmentRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.attachmentRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteAddBatch(token, parms);
  }
  
  public int changelogRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteStore(token, id, parms);
  }
  
  public void changelogRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.changelogRemoteStoreBatch(token, parms);
  }
  
  public void changelogRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.changelogRemoteDelete(token, id);
  }
  
  public void changelogRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.changelogRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.changelogRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Comment commentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Comment commentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteAddBatch(token, parms);
  }
  
  public int commentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteStore(token, id, parms);
  }
  
  public void commentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commentRemoteStoreBatch(token, parms);
  }
  
  public void commentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commentRemoteDelete(token, id);
  }
  
  public void commentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.commentRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.commentRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteAddBatch(token, parms);
  }
  
  public int environmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteStore(token, id, parms);
  }
  
  public void environmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.environmentRemoteStoreBatch(token, parms);
  }
  
  public void environmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.environmentRemoteDelete(token, id);
  }
  
  public void environmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.environmentRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.environmentRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteAddBatch(token, parms);
  }
  
  public int iterationRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteStore(token, id, parms);
  }
  
  public void iterationRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.iterationRemoteStoreBatch(token, parms);
  }
  
  public void iterationRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.iterationRemoteDelete(token, id);
  }
  
  public void iterationRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.iterationRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.iterationRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteAddBatch(token, parms);
  }
  
  public int methodologyRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteStore(token, id, parms);
  }
  
  public void methodologyRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.methodologyRemoteStoreBatch(token, parms);
  }
  
  public void methodologyRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.methodologyRemoteDelete(token, id);
  }
  
  public void methodologyRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.methodologyRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.methodologyRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Feature featureRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Feature featureRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteAddBatch(token, parms);
  }
  
  public int featureRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteStore(token, id, parms);
  }
  
  public void featureRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.featureRemoteStoreBatch(token, parms);
  }
  
  public void featureRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.featureRemoteDelete(token, id);
  }
  
  public void featureRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.featureRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.featureRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteAddBatch(token, parms);
  }
  
  public int milestoneRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteStore(token, id, parms);
  }
  
  public void milestoneRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.milestoneRemoteStoreBatch(token, parms);
  }
  
  public void milestoneRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.milestoneRemoteDelete(token, id);
  }
  
  public void milestoneRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.milestoneRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.milestoneRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participant participantRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participant participantRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteAddBatch(token, parms);
  }
  
  public int participantRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteStore(token, id, parms);
  }
  
  public void participantRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantRemoteStoreBatch(token, parms);
  }
  
  public void participantRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantRemoteDelete(token, id);
  }
  
  public void participantRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteAddBatch(token, parms);
  }
  
  public int participantroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteStore(token, id, parms);
  }
  
  public void participantroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantroleRemoteStoreBatch(token, parms);
  }
  
  public void participantroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantroleRemoteDelete(token, id);
  }
  
  public void participantroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.participantroleRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.participantroleRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteAddBatch(token, parms);
  }
  
  public int priorityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteStore(token, id, parms);
  }
  
  public void priorityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.priorityRemoteStoreBatch(token, parms);
  }
  
  public void priorityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.priorityRemoteDelete(token, id);
  }
  
  public void priorityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.priorityRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.priorityRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Project projectRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Project projectRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteAddBatch(token, parms);
  }
  
  public int projectRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteStore(token, id, parms);
  }
  
  public void projectRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectRemoteStoreBatch(token, parms);
  }
  
  public void projectRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectRemoteDelete(token, id);
  }
  
  public void projectRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteAddBatch(token, parms);
  }
  
  public int projectpageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteStore(token, id, parms);
  }
  
  public void projectpageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectpageRemoteStoreBatch(token, parms);
  }
  
  public void projectpageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectpageRemoteDelete(token, id);
  }
  
  public void projectpageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectpageRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectpageRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteAddBatch(token, parms);
  }
  
  public int projectroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteStore(token, id, parms);
  }
  
  public void projectroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectroleRemoteStoreBatch(token, parms);
  }
  
  public void projectroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectroleRemoteDelete(token, id);
  }
  
  public void projectroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectroleRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectroleRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteAddBatch(token, parms);
  }
  
  public int projectrolebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteStore(token, id, parms);
  }
  
  public void projectrolebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectrolebaseRemoteStoreBatch(token, parms);
  }
  
  public void projectrolebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectrolebaseRemoteDelete(token, id);
  }
  
  public void projectrolebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.projectrolebaseRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.projectrolebaseRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Question questionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Question questionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteAddBatch(token, parms);
  }
  
  public int questionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteStore(token, id, parms);
  }
  
  public void questionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.questionRemoteStoreBatch(token, parms);
  }
  
  public void questionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.questionRemoteDelete(token, id);
  }
  
  public void questionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.questionRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.questionRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Release releaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Release releaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteAddBatch(token, parms);
  }
  
  public int releaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteStore(token, id, parms);
  }
  
  public void releaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.releaseRemoteStoreBatch(token, parms);
  }
  
  public void releaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.releaseRemoteDelete(token, id);
  }
  
  public void releaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.releaseRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.releaseRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Request requestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Request requestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteAddBatch(token, parms);
  }
  
  public int requestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteStore(token, id, parms);
  }
  
  public void requestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestRemoteStoreBatch(token, parms);
  }
  
  public void requestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestRemoteDelete(token, id);
  }
  
  public void requestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteAddBatch(token, parms);
  }
  
  public int requestlinkRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteStore(token, id, parms);
  }
  
  public void requestlinkRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestlinkRemoteStoreBatch(token, parms);
  }
  
  public void requestlinkRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestlinkRemoteDelete(token, id);
  }
  
  public void requestlinkRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requestlinkRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requestlinkRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteAddBatch(token, parms);
  }
  
  public int requesttypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteStore(token, id, parms);
  }
  
  public void requesttypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requesttypeRemoteStoreBatch(token, parms);
  }
  
  public void requesttypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requesttypeRemoteDelete(token, id);
  }
  
  public void requesttypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.requesttypeRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.requesttypeRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Task taskRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Task taskRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteAddBatch(token, parms);
  }
  
  public int taskRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteStore(token, id, parms);
  }
  
  public void taskRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.taskRemoteStoreBatch(token, parms);
  }
  
  public void taskRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.taskRemoteDelete(token, id);
  }
  
  public void taskRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.taskRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.taskRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteAddBatch(token, parms);
  }
  
  public int tasktypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteStore(token, id, parms);
  }
  
  public void tasktypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.tasktypeRemoteStoreBatch(token, parms);
  }
  
  public void tasktypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.tasktypeRemoteDelete(token, id);
  }
  
  public void tasktypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.tasktypeRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.tasktypeRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.User userRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.User userRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.User[] userRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteAddBatch(token, parms);
  }
  
  public int userRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteStore(token, id, parms);
  }
  
  public void userRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.userRemoteStoreBatch(token, parms);
  }
  
  public void userRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.userRemoteDelete(token, id);
  }
  
  public void userRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.userRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.User[] userRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.User[] userRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.userRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteAddBatch(token, parms);
  }
  
  public int wikipageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteStore(token, id, parms);
  }
  
  public void wikipageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipageRemoteStoreBatch(token, parms);
  }
  
  public void wikipageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipageRemoteDelete(token, id);
  }
  
  public void wikipageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipageRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipageRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteAddBatch(token, parms);
  }
  
  public int wikipagefileRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteStore(token, id, parms);
  }
  
  public void wikipagefileRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipagefileRemoteStoreBatch(token, parms);
  }
  
  public void wikipagefileRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipagefileRemoteDelete(token, id);
  }
  
  public void wikipagefileRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.wikipagefileRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.wikipagefileRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteAddBatch(token, parms);
  }
  
  public int snapshotRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteStore(token, id, parms);
  }
  
  public void snapshotRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.snapshotRemoteStoreBatch(token, parms);
  }
  
  public void snapshotRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.snapshotRemoteDelete(token, id);
  }
  
  public void snapshotRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.snapshotRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.snapshotRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteAddBatch(token, parms);
  }
  
  public int statebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteStore(token, id, parms);
  }
  
  public void statebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.statebaseRemoteStoreBatch(token, parms);
  }
  
  public void statebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.statebaseRemoteDelete(token, id);
  }
  
  public void statebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.statebaseRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.statebaseRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteAddBatch(token, parms);
  }
  
  public int watcherRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteStore(token, id, parms);
  }
  
  public void watcherRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.watcherRemoteStoreBatch(token, parms);
  }
  
  public void watcherRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.watcherRemoteDelete(token, id);
  }
  
  public void watcherRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.watcherRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.watcherRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Customer customerRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Customer customerRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteAddBatch(token, parms);
  }
  
  public int customerRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteStore(token, id, parms);
  }
  
  public void customerRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.customerRemoteStoreBatch(token, parms);
  }
  
  public void customerRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.customerRemoteDelete(token, id);
  }
  
  public void customerRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.customerRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.customerRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteAddBatch(token, parms);
  }
  
  public int pmcustomattributeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteStore(token, id, parms);
  }
  
  public void pmcustomattributeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributeRemoteStoreBatch(token, parms);
  }
  
  public void pmcustomattributeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributeRemoteDelete(token, id);
  }
  
  public void pmcustomattributeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributeRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributeRemoteFind(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteLoad(token, id);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteAdd(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteAddBatch(token, parms);
  }
  
  public int pmcustomattributevalueRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteStore(token, id, parms);
  }
  
  public void pmcustomattributevalueRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributevalueRemoteStoreBatch(token, parms);
  }
  
  public void pmcustomattributevalueRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributevalueRemoteDelete(token, id);
  }
  
  public void pmcustomattributevalueRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    dataServicePortType.pmcustomattributevalueRemoteDeleteBatch(token, parms);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteGetAll(token);
  }
  
  public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException{
    if (dataServicePortType == null)
      _initDataServicePortTypeProxy();
    return dataServicePortType.pmcustomattributevalueRemoteFind(token, parms);
  }
  
  
}