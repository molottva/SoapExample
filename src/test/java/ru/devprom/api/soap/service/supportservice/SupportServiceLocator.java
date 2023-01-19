/**
 * SupportServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.supportservice;

public class SupportServiceLocator extends org.apache.axis.client.Service implements ru.devprom.api.soap.service.supportservice.SupportService {

    public SupportServiceLocator() {
    }


    public SupportServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SupportServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SupportServicePort
    private java.lang.String SupportServicePort_address = "http://SoproMAT-PC/api/supportservice";

    public java.lang.String getSupportServicePortAddress() {
        return SupportServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SupportServicePortWSDDServiceName = "SupportServicePort";

    public java.lang.String getSupportServicePortWSDDServiceName() {
        return SupportServicePortWSDDServiceName;
    }

    public void setSupportServicePortWSDDServiceName(java.lang.String name) {
        SupportServicePortWSDDServiceName = name;
    }

    public ru.devprom.api.soap.service.supportservice.SupportServicePortType getSupportServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SupportServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSupportServicePort(endpoint);
    }

    public ru.devprom.api.soap.service.supportservice.SupportServicePortType getSupportServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.devprom.api.soap.service.supportservice.SupportServiceBindingStub _stub = new ru.devprom.api.soap.service.supportservice.SupportServiceBindingStub(portAddress, this);
            _stub.setPortName(getSupportServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSupportServicePortEndpointAddress(java.lang.String address) {
        SupportServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.devprom.api.soap.service.supportservice.SupportServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.devprom.api.soap.service.supportservice.SupportServiceBindingStub _stub = new ru.devprom.api.soap.service.supportservice.SupportServiceBindingStub(new java.net.URL(SupportServicePort_address), this);
                _stub.setPortName(getSupportServicePortWSDDServiceName());
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
        if ("SupportServicePort".equals(inputPortName)) {
            return getSupportServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("tns", "SupportService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("tns", "SupportServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SupportServicePort".equals(portName)) {
            setSupportServicePortEndpointAddress(address);
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
