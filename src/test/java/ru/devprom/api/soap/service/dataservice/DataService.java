/**
 * DataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public interface DataService extends javax.xml.rpc.Service {
    public java.lang.String getDataServicePortAddress();

    public ru.devprom.api.soap.service.dataservice.DataServicePortType getDataServicePort() throws javax.xml.rpc.ServiceException;

    public ru.devprom.api.soap.service.dataservice.DataServicePortType getDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
