/**
 * TestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.testservice;

public class TestServiceLocator extends org.apache.axis.client.Service implements ru.devprom.api.soap.service.testservice.TestService {

    public TestServiceLocator() {
    }


    public TestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestServicePort
    private java.lang.String TestServicePort_address = "http://SoproMAT-PC/api/testservice";

    public java.lang.String getTestServicePortAddress() {
        return TestServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestServicePortWSDDServiceName = "TestServicePort";

    public java.lang.String getTestServicePortWSDDServiceName() {
        return TestServicePortWSDDServiceName;
    }

    public void setTestServicePortWSDDServiceName(java.lang.String name) {
        TestServicePortWSDDServiceName = name;
    }

    public ru.devprom.api.soap.service.testservice.TestServicePortType getTestServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestServicePort(endpoint);
    }

    public ru.devprom.api.soap.service.testservice.TestServicePortType getTestServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.devprom.api.soap.service.testservice.TestServiceBindingStub _stub = new ru.devprom.api.soap.service.testservice.TestServiceBindingStub(portAddress, this);
            _stub.setPortName(getTestServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestServicePortEndpointAddress(java.lang.String address) {
        TestServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.devprom.api.soap.service.testservice.TestServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.devprom.api.soap.service.testservice.TestServiceBindingStub _stub = new ru.devprom.api.soap.service.testservice.TestServiceBindingStub(new java.net.URL(TestServicePort_address), this);
                _stub.setPortName(getTestServicePortWSDDServiceName());
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
        if ("TestServicePort".equals(inputPortName)) {
            return getTestServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("tns", "TestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("tns", "TestServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestServicePort".equals(portName)) {
            setTestServicePortEndpointAddress(address);
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
