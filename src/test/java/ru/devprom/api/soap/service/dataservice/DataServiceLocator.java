/**
 * DataServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class DataServiceLocator extends org.apache.axis.client.Service implements ru.devprom.api.soap.service.dataservice.DataService {

    public DataServiceLocator() {
    }


    public DataServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DataServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DataServicePort
    private java.lang.String DataServicePort_address = "http://SoproMAT-PC/api/dataservice";

    public java.lang.String getDataServicePortAddress() {
        return DataServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DataServicePortWSDDServiceName = "DataServicePort";

    public java.lang.String getDataServicePortWSDDServiceName() {
        return DataServicePortWSDDServiceName;
    }

    public void setDataServicePortWSDDServiceName(java.lang.String name) {
        DataServicePortWSDDServiceName = name;
    }

    public ru.devprom.api.soap.service.dataservice.DataServicePortType getDataServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DataServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDataServicePort(endpoint);
    }

    public ru.devprom.api.soap.service.dataservice.DataServicePortType getDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.devprom.api.soap.service.dataservice.DataServiceBindingStub _stub = new ru.devprom.api.soap.service.dataservice.DataServiceBindingStub(portAddress, this);
            _stub.setPortName(getDataServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDataServicePortEndpointAddress(java.lang.String address) {
        DataServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.devprom.api.soap.service.dataservice.DataServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.devprom.api.soap.service.dataservice.DataServiceBindingStub _stub = new ru.devprom.api.soap.service.dataservice.DataServiceBindingStub(new java.net.URL(DataServicePort_address), this);
                _stub.setPortName(getDataServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DataServicePort".equals(inputPortName)) {
            return getDataServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("tns", "DataService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("tns", "DataServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DataServicePort".equals(portName)) {
            setDataServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
