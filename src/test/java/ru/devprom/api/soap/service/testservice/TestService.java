/**
 * TestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.testservice;

public interface TestService extends javax.xml.rpc.Service {
    public java.lang.String getTestServicePortAddress();

    public ru.devprom.api.soap.service.testservice.TestServicePortType getTestServicePort() throws javax.xml.rpc.ServiceException;

    public ru.devprom.api.soap.service.testservice.TestServicePortType getTestServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
