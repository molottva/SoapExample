/**
 * TestServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.testservice;

public class TestServiceBindingStub extends org.apache.axis.client.Stub implements ru.devprom.api.soap.service.testservice.TestServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "object"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenario"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Testscenario.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Find");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "object"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenario"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Testscenario.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Append");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "object"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenario"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Testscenario.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Run");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "object"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "environment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environment"), ru.devprom.api.soap.service.testservice.Environment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecution"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Testexecution.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecution"), ru.devprom.api.soap.service.testservice.Testexecution.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "test"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "result"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresult"), ru.devprom.api.soap.service.testservice.Testexecutionresult.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportIssue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecution"), ru.devprom.api.soap.service.testservice.Testexecution.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "test"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "issue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "request"), ru.devprom.api.soap.service.testservice.Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "request"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecution"), ru.devprom.api.soap.service.testservice.Testexecution.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "test"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.testservice.Testscenario.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachment"), ru.devprom.api.soap.service.testservice.Attachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecution"), ru.devprom.api.soap.service.testservice.Testexecution.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresult"));
        oper.setReturnClass(ru.devprom.api.soap.service.testservice.Testexecutionresult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

    }

    public TestServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TestServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TestServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("tns", "attachment");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "environment");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Environment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "request");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testexecution");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Testexecution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testexecutionresult");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Testexecutionresult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testscenario");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.testservice.Testscenario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ru.devprom.api.soap.service.testservice.Testscenario create(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.Create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, object});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Testscenario) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Testscenario) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Testscenario.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.testservice.Testscenario find(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.Find");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Find"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, object});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Testscenario) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Testscenario) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Testscenario.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.testservice.Testscenario append(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario parent, ru.devprom.api.soap.service.testservice.Testscenario object) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.Append");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Append"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parent, object});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Testscenario) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Testscenario) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Testscenario.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.testservice.Testexecution run(java.lang.String token, ru.devprom.api.soap.service.testservice.Testscenario object, java.lang.String version, ru.devprom.api.soap.service.testservice.Environment environment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.Run");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Run"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, object, version, environment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Testexecution) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Testexecution) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Testexecution.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reportResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Testexecutionresult result, java.lang.String description) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.ReportResult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReportResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, execution, test, result, description});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.testservice.Request reportIssue(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Request issue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.ReportIssue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReportIssue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, execution, test, issue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Request) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reportFile(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution, ru.devprom.api.soap.service.testservice.Testscenario test, ru.devprom.api.soap.service.testservice.Attachment file) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.ReportFile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReportFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, execution, test, file});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.testservice.Testexecutionresult getResult(java.lang.String token, ru.devprom.api.soap.service.testservice.Testexecution execution) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns.GetResult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, execution});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.testservice.Testexecutionresult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.testservice.Testexecutionresult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.testservice.Testexecutionresult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
