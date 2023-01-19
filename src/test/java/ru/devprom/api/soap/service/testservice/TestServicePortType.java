/**
 * TestServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.testservice;

public interface TestServicePortType extends java.rmi.Remote {
    public ru.devprom.api.soap.service.testservice.Testscenario create(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException;
    public ru.devprom.api.soap.service.testservice.Testscenario find(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException;
    public ru.devprom.api.soap.service.testservice.Testscenario append(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario parent, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException;
    public ru.devprom.api.soap.service.testservice.Testexecution run(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object, java.lang.String version, ru.devprom.api.soap.service.testservice.Environment environment) throws java.rmi.RemoteException;
    public void reportResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Testexecutionresult result, java.lang.String description) throws java.rmi.RemoteException;
    public ru.devprom.api.soap.service.testservice.Request reportIssue(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Request issue) throws java.rmi.RemoteException;
    public void reportFile(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Attachment file) throws java.rmi.RemoteException;
    public ru.devprom.api.soap.service.testservice.Testexecutionresult getResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution) throws java.rmi.RemoteException;
}
