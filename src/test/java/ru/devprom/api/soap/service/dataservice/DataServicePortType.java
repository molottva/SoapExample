/**
 * DataServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public interface DataServicePortType extends java.rmi.Remote {

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Build buildRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Build buildRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int buildRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void buildRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void buildRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void buildRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int requirementRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void requirementRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void requirementRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void requirementRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Commit commitRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Commit commitRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int commitRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void commitRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void commitRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void commitRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int reviewrequestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void reviewrequestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void reviewrequestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void reviewrequestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int testcaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void testcaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void testcaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void testcaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int testcaseexecutionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void testcaseexecutionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void testcaseexecutionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void testcaseexecutionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int testexecutionresultRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void testexecutionresultRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void testexecutionresultRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void testexecutionresultRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int testscenarioRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void testscenarioRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void testscenarioRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void testscenarioRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int helppageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void helppageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void helppageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void helppageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Activity activityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Activity activityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int activityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void activityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void activityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void activityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int attachmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void attachmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void attachmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void attachmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int changelogRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void changelogRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void changelogRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void changelogRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Comment commentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Comment commentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int commentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void commentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void commentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void commentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int environmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void environmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void environmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void environmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int iterationRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void iterationRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void iterationRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void iterationRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int methodologyRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void methodologyRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void methodologyRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void methodologyRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Feature featureRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Feature featureRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int featureRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void featureRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void featureRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void featureRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int milestoneRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void milestoneRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void milestoneRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void milestoneRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Participant participantRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Participant participantRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int participantRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void participantRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void participantRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void participantRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int participantroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void participantroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void participantroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void participantroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int priorityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void priorityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void priorityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void priorityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Project projectRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Project projectRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int projectRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void projectRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void projectRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void projectRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int projectpageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void projectpageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void projectpageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void projectpageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int projectroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void projectroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void projectroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void projectroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int projectrolebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void projectrolebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void projectrolebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void projectrolebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Question questionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Question questionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int questionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void questionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void questionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void questionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Release releaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Release releaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int releaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void releaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void releaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void releaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Request requestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Request requestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int requestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void requestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void requestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void requestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int requestlinkRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void requestlinkRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void requestlinkRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void requestlinkRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int requesttypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void requesttypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void requesttypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void requesttypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Task taskRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Task taskRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int taskRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void taskRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void taskRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void taskRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int tasktypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void tasktypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void tasktypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void tasktypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.User userRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.User userRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.User[] userRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int userRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void userRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void userRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void userRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.User[] userRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.User[] userRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int wikipageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void wikipageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void wikipageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void wikipageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int wikipagefileRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void wikipagefileRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void wikipagefileRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void wikipagefileRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int snapshotRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void snapshotRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void snapshotRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void snapshotRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int statebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void statebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void statebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void statebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int watcherRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void watcherRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void watcherRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void watcherRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Customer customerRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Customer customerRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int customerRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void customerRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void customerRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void customerRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int pmcustomattributeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void pmcustomattributeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void pmcustomattributeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void pmcustomattributeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException;

    /**
     * Load object data using the given ID
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Appends new object with the given parms
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException;

    /**
     * Appends array of given objects
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public int pmcustomattributevalueRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException;

    /**
     * Stores array of objects
     */
    public void pmcustomattributevalueRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException;

    /**
     * Stores modified object with the given id and parms
     */
    public void pmcustomattributevalueRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException;

    /**
     * Removes array of objects
     */
    public void pmcustomattributevalueRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException;

    /**
     * Returns all records of the given type
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Searches for records of the given type using field value
     */
    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException;
}
