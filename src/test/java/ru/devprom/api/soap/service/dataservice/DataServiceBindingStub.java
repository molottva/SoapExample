/**
 * DataServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class DataServiceBindingStub extends org.apache.axis.client.Stub implements ru.devprom.api.soap.service.dataservice.DataServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[369];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
        _initOperationDesc21();
        _initOperationDesc22();
        _initOperationDesc23();
        _initOperationDesc24();
        _initOperationDesc25();
        _initOperationDesc26();
        _initOperationDesc27();
        _initOperationDesc28();
        _initOperationDesc29();
        _initOperationDesc30();
        _initOperationDesc31();
        _initOperationDesc32();
        _initOperationDesc33();
        _initOperationDesc34();
        _initOperationDesc35();
        _initOperationDesc36();
        _initOperationDesc37();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "build"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Build.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "build"), ru.devprom.api.soap.service.dataservice.Build.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "build"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Build.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "buildArray"), ru.devprom.api.soap.service.dataservice.Build[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "buildArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "build"), ru.devprom.api.soap.service.dataservice.Build.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "buildArray"), ru.devprom.api.soap.service.dataservice.Build[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "buildArray"), ru.devprom.api.soap.service.dataservice.Build[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "buildArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("build.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "build"), ru.devprom.api.soap.service.dataservice.Build.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "buildArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requirement"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requirement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirement"), ru.devprom.api.soap.service.dataservice.Requirement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requirement"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requirement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirementArray"), ru.devprom.api.soap.service.dataservice.Requirement[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requirementArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requirement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirement"), ru.devprom.api.soap.service.dataservice.Requirement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirementArray"), ru.devprom.api.soap.service.dataservice.Requirement[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirementArray"), ru.devprom.api.soap.service.dataservice.Requirement[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requirementArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requirement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirement.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requirement"), ru.devprom.api.soap.service.dataservice.Requirement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requirementArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requirement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commit"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Commit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commit"), ru.devprom.api.soap.service.dataservice.Commit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commit"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Commit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commitArray"), ru.devprom.api.soap.service.dataservice.Commit[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commitArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Commit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commit"), ru.devprom.api.soap.service.dataservice.Commit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commitArray"), ru.devprom.api.soap.service.dataservice.Commit[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commitArray"), ru.devprom.api.soap.service.dataservice.Commit[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commitArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Commit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commit"), ru.devprom.api.soap.service.dataservice.Commit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commitArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Commit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "reviewrequest"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Reviewrequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequest"), ru.devprom.api.soap.service.dataservice.Reviewrequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "reviewrequest"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Reviewrequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequestArray"), ru.devprom.api.soap.service.dataservice.Reviewrequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "reviewrequestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequest"), ru.devprom.api.soap.service.dataservice.Reviewrequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequestArray"), ru.devprom.api.soap.service.dataservice.Reviewrequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequestArray"), ru.devprom.api.soap.service.dataservice.Reviewrequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "reviewrequestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reviewrequest.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "reviewrequest"), ru.devprom.api.soap.service.dataservice.Reviewrequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "reviewrequestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcase"), ru.devprom.api.soap.service.dataservice.Testcase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseArray"), ru.devprom.api.soap.service.dataservice.Testcase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcase"), ru.devprom.api.soap.service.dataservice.Testcase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseArray"), ru.devprom.api.soap.service.dataservice.Testcase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseArray"), ru.devprom.api.soap.service.dataservice.Testcase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcase.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcase"), ru.devprom.api.soap.service.dataservice.Testcase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseexecution"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcaseexecution.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecution"), ru.devprom.api.soap.service.dataservice.Testcaseexecution.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseexecution"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcaseexecution.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecutionArray"), ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseexecutionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecution"), ru.devprom.api.soap.service.dataservice.Testcaseexecution.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecutionArray"), ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecutionArray"), ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseexecutionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testcaseexecution.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testcaseexecution"), ru.devprom.api.soap.service.dataservice.Testcaseexecution.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testcaseexecutionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresult"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testexecutionresult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresult"), ru.devprom.api.soap.service.dataservice.Testexecutionresult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresult"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testexecutionresult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresultArray"), ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresultArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresult"), ru.devprom.api.soap.service.dataservice.Testexecutionresult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresultArray"), ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresultArray"), ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresultArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testexecutionresult.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testexecutionresult"), ru.devprom.api.soap.service.dataservice.Testexecutionresult.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testexecutionresultArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenario"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testscenario.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.dataservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenario"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testscenario.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenarioArray"), ru.devprom.api.soap.service.dataservice.Testscenario[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenarioArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testscenario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.dataservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenarioArray"), ru.devprom.api.soap.service.dataservice.Testscenario[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenarioArray"), ru.devprom.api.soap.service.dataservice.Testscenario[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenarioArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testscenario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testscenario.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "testscenario"), ru.devprom.api.soap.service.dataservice.Testscenario.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "testscenarioArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Testscenario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "helppage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Helppage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppage"), ru.devprom.api.soap.service.dataservice.Helppage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "helppage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Helppage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppageArray"), ru.devprom.api.soap.service.dataservice.Helppage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "helppageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Helppage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppage"), ru.devprom.api.soap.service.dataservice.Helppage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppageArray"), ru.devprom.api.soap.service.dataservice.Helppage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppageArray"), ru.devprom.api.soap.service.dataservice.Helppage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "helppageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Helppage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("helppage.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "helppage"), ru.devprom.api.soap.service.dataservice.Helppage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "helppageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Helppage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "activity"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Activity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activity"), ru.devprom.api.soap.service.dataservice.Activity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "activity"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Activity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activityArray"), ru.devprom.api.soap.service.dataservice.Activity[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "activityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activity"), ru.devprom.api.soap.service.dataservice.Activity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activityArray"), ru.devprom.api.soap.service.dataservice.Activity[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activityArray"), ru.devprom.api.soap.service.dataservice.Activity[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "activityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activity.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "activity"), ru.devprom.api.soap.service.dataservice.Activity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "activityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "attachment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Attachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachment"), ru.devprom.api.soap.service.dataservice.Attachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "attachment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Attachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachmentArray"), ru.devprom.api.soap.service.dataservice.Attachment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "attachmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachment"), ru.devprom.api.soap.service.dataservice.Attachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachmentArray"), ru.devprom.api.soap.service.dataservice.Attachment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachmentArray"), ru.devprom.api.soap.service.dataservice.Attachment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "attachmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachment.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "attachment"), ru.devprom.api.soap.service.dataservice.Attachment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "attachmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Attachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "changelog"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Changelog.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelog"), ru.devprom.api.soap.service.dataservice.Changelog.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "changelog"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Changelog.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelogArray"), ru.devprom.api.soap.service.dataservice.Changelog[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "changelogArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Changelog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelog"), ru.devprom.api.soap.service.dataservice.Changelog.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelogArray"), ru.devprom.api.soap.service.dataservice.Changelog[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelogArray"), ru.devprom.api.soap.service.dataservice.Changelog[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "changelogArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Changelog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changelog.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "changelog"), ru.devprom.api.soap.service.dataservice.Changelog.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "changelogArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Changelog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "comment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Comment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "comment"), ru.devprom.api.soap.service.dataservice.Comment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "comment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Comment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commentArray"), ru.devprom.api.soap.service.dataservice.Comment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Comment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "comment"), ru.devprom.api.soap.service.dataservice.Comment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commentArray"), ru.devprom.api.soap.service.dataservice.Comment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "commentArray"), ru.devprom.api.soap.service.dataservice.Comment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Comment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("comment.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "comment"), ru.devprom.api.soap.service.dataservice.Comment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "commentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Comment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "environment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Environment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environment"), ru.devprom.api.soap.service.dataservice.Environment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "environment"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Environment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environmentArray"), ru.devprom.api.soap.service.dataservice.Environment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "environmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Environment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environment"), ru.devprom.api.soap.service.dataservice.Environment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environmentArray"), ru.devprom.api.soap.service.dataservice.Environment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environmentArray"), ru.devprom.api.soap.service.dataservice.Environment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "environmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Environment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("environment.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "environment"), ru.devprom.api.soap.service.dataservice.Environment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "environmentArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Environment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "iteration"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Iteration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iteration"), ru.devprom.api.soap.service.dataservice.Iteration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "iteration"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Iteration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iterationArray"), ru.devprom.api.soap.service.dataservice.Iteration[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "iterationArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Iteration[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iteration"), ru.devprom.api.soap.service.dataservice.Iteration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iterationArray"), ru.devprom.api.soap.service.dataservice.Iteration[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iterationArray"), ru.devprom.api.soap.service.dataservice.Iteration[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "iterationArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Iteration[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("iteration.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "iteration"), ru.devprom.api.soap.service.dataservice.Iteration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "iterationArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Iteration[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "methodology"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Methodology.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodology"), ru.devprom.api.soap.service.dataservice.Methodology.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "methodology"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Methodology.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodologyArray"), ru.devprom.api.soap.service.dataservice.Methodology[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "methodologyArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Methodology[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodology"), ru.devprom.api.soap.service.dataservice.Methodology.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodologyArray"), ru.devprom.api.soap.service.dataservice.Methodology[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodologyArray"), ru.devprom.api.soap.service.dataservice.Methodology[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "methodologyArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Methodology[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("methodology.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "methodology"), ru.devprom.api.soap.service.dataservice.Methodology.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "methodologyArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Methodology[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "feature"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Feature.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "feature"), ru.devprom.api.soap.service.dataservice.Feature.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "feature"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Feature.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "featureArray"), ru.devprom.api.soap.service.dataservice.Feature[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "featureArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Feature[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "feature"), ru.devprom.api.soap.service.dataservice.Feature.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "featureArray"), ru.devprom.api.soap.service.dataservice.Feature[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "featureArray"), ru.devprom.api.soap.service.dataservice.Feature[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "featureArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Feature[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("feature.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "feature"), ru.devprom.api.soap.service.dataservice.Feature.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "featureArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Feature[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "milestone"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Milestone.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestone"), ru.devprom.api.soap.service.dataservice.Milestone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "milestone"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Milestone.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestoneArray"), ru.devprom.api.soap.service.dataservice.Milestone[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "milestoneArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Milestone[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestone"), ru.devprom.api.soap.service.dataservice.Milestone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestoneArray"), ru.devprom.api.soap.service.dataservice.Milestone[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestoneArray"), ru.devprom.api.soap.service.dataservice.Milestone[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "milestoneArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Milestone[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("milestone.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "milestone"), ru.devprom.api.soap.service.dataservice.Milestone.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "milestoneArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Milestone[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participant"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participant.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participant"), ru.devprom.api.soap.service.dataservice.Participant.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participant"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participant.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantArray"), ru.devprom.api.soap.service.dataservice.Participant[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participant[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participant"), ru.devprom.api.soap.service.dataservice.Participant.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantArray"), ru.devprom.api.soap.service.dataservice.Participant[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantArray"), ru.devprom.api.soap.service.dataservice.Participant[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participant[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participant.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participant"), ru.devprom.api.soap.service.dataservice.Participant.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participant[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantrole"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participantrole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantrole"), ru.devprom.api.soap.service.dataservice.Participantrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantrole"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participantrole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantroleArray"), ru.devprom.api.soap.service.dataservice.Participantrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participantrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantrole"), ru.devprom.api.soap.service.dataservice.Participantrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantroleArray"), ru.devprom.api.soap.service.dataservice.Participantrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantroleArray"), ru.devprom.api.soap.service.dataservice.Participantrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participantrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("participantrole.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "participantrole"), ru.devprom.api.soap.service.dataservice.Participantrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "participantroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Participantrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "priority"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Priority.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priority"), ru.devprom.api.soap.service.dataservice.Priority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "priority"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Priority.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priorityArray"), ru.devprom.api.soap.service.dataservice.Priority[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "priorityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Priority[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priority"), ru.devprom.api.soap.service.dataservice.Priority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priorityArray"), ru.devprom.api.soap.service.dataservice.Priority[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priorityArray"), ru.devprom.api.soap.service.dataservice.Priority[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "priorityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Priority[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priority.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "priority"), ru.devprom.api.soap.service.dataservice.Priority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "priorityArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Priority[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "project"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Project.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "project"), ru.devprom.api.soap.service.dataservice.Project.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "project"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Project.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectArray"), ru.devprom.api.soap.service.dataservice.Project[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Project[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "project"), ru.devprom.api.soap.service.dataservice.Project.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[192] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectArray"), ru.devprom.api.soap.service.dataservice.Project[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[193] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[194] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectArray"), ru.devprom.api.soap.service.dataservice.Project[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[195] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Project[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[196] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("project.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "project"), ru.devprom.api.soap.service.dataservice.Project.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Project[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[197] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectpage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectpage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[198] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpage"), ru.devprom.api.soap.service.dataservice.Projectpage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectpage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectpage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[199] = oper;

    }

    private static void _initOperationDesc21(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpageArray"), ru.devprom.api.soap.service.dataservice.Projectpage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectpageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectpage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[200] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpage"), ru.devprom.api.soap.service.dataservice.Projectpage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[201] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpageArray"), ru.devprom.api.soap.service.dataservice.Projectpage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[202] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[203] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpageArray"), ru.devprom.api.soap.service.dataservice.Projectpage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[204] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectpageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectpage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[205] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectpage.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectpage"), ru.devprom.api.soap.service.dataservice.Projectpage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectpageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectpage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[206] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrole"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[207] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrole"), ru.devprom.api.soap.service.dataservice.Projectrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrole"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[208] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectroleArray"), ru.devprom.api.soap.service.dataservice.Projectrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[209] = oper;

    }

    private static void _initOperationDesc22(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrole"), ru.devprom.api.soap.service.dataservice.Projectrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[210] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectroleArray"), ru.devprom.api.soap.service.dataservice.Projectrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[211] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[212] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectroleArray"), ru.devprom.api.soap.service.dataservice.Projectrole[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[213] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[214] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrole.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrole"), ru.devprom.api.soap.service.dataservice.Projectrole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectroleArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[215] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrolebase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrolebase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[216] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebase"), ru.devprom.api.soap.service.dataservice.Projectrolebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrolebase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrolebase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[217] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebaseArray"), ru.devprom.api.soap.service.dataservice.Projectrolebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrolebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[218] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebase"), ru.devprom.api.soap.service.dataservice.Projectrolebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[219] = oper;

    }

    private static void _initOperationDesc23(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebaseArray"), ru.devprom.api.soap.service.dataservice.Projectrolebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[220] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[221] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebaseArray"), ru.devprom.api.soap.service.dataservice.Projectrolebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[222] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrolebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[223] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("projectrolebase.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "projectrolebase"), ru.devprom.api.soap.service.dataservice.Projectrolebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "projectrolebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[224] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "question"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Question.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[225] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "question"), ru.devprom.api.soap.service.dataservice.Question.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "question"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Question.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[226] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "questionArray"), ru.devprom.api.soap.service.dataservice.Question[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "questionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Question[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[227] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "question"), ru.devprom.api.soap.service.dataservice.Question.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[228] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "questionArray"), ru.devprom.api.soap.service.dataservice.Question[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[229] = oper;

    }

    private static void _initOperationDesc24(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[230] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "questionArray"), ru.devprom.api.soap.service.dataservice.Question[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[231] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "questionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Question[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[232] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("question.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "question"), ru.devprom.api.soap.service.dataservice.Question.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "questionArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Question[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[233] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "release"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Release.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[234] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "release"), ru.devprom.api.soap.service.dataservice.Release.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "release"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Release.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[235] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "releaseArray"), ru.devprom.api.soap.service.dataservice.Release[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "releaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Release[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[236] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "release"), ru.devprom.api.soap.service.dataservice.Release.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[237] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "releaseArray"), ru.devprom.api.soap.service.dataservice.Release[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[238] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[239] = oper;

    }

    private static void _initOperationDesc25(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "releaseArray"), ru.devprom.api.soap.service.dataservice.Release[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[240] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "releaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Release[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[241] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("release.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "release"), ru.devprom.api.soap.service.dataservice.Release.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "releaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Release[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[242] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "request"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[243] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "request"), ru.devprom.api.soap.service.dataservice.Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "request"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[244] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestArray"), ru.devprom.api.soap.service.dataservice.Request[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[245] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "request"), ru.devprom.api.soap.service.dataservice.Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[246] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestArray"), ru.devprom.api.soap.service.dataservice.Request[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[247] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[248] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestArray"), ru.devprom.api.soap.service.dataservice.Request[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[249] = oper;

    }

    private static void _initOperationDesc26(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[250] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("request.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "request"), ru.devprom.api.soap.service.dataservice.Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Request[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[251] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestlink"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requestlink.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[252] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlink"), ru.devprom.api.soap.service.dataservice.Requestlink.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestlink"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requestlink.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[253] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlinkArray"), ru.devprom.api.soap.service.dataservice.Requestlink[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestlinkArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requestlink[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[254] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlink"), ru.devprom.api.soap.service.dataservice.Requestlink.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[255] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlinkArray"), ru.devprom.api.soap.service.dataservice.Requestlink[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[256] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[257] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlinkArray"), ru.devprom.api.soap.service.dataservice.Requestlink[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[258] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestlinkArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requestlink[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[259] = oper;

    }

    private static void _initOperationDesc27(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestlink.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requestlink"), ru.devprom.api.soap.service.dataservice.Requestlink.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requestlinkArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requestlink[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[260] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requesttype"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requesttype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[261] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttype"), ru.devprom.api.soap.service.dataservice.Requesttype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requesttype"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requesttype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[262] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttypeArray"), ru.devprom.api.soap.service.dataservice.Requesttype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requesttypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requesttype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[263] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttype"), ru.devprom.api.soap.service.dataservice.Requesttype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[264] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttypeArray"), ru.devprom.api.soap.service.dataservice.Requesttype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[265] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[266] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttypeArray"), ru.devprom.api.soap.service.dataservice.Requesttype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[267] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requesttypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requesttype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[268] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requesttype.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "requesttype"), ru.devprom.api.soap.service.dataservice.Requesttype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "requesttypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Requesttype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[269] = oper;

    }

    private static void _initOperationDesc28(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "task"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Task.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[270] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "task"), ru.devprom.api.soap.service.dataservice.Task.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "task"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Task.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[271] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "taskArray"), ru.devprom.api.soap.service.dataservice.Task[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "taskArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Task[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[272] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "task"), ru.devprom.api.soap.service.dataservice.Task.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[273] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "taskArray"), ru.devprom.api.soap.service.dataservice.Task[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[274] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[275] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "taskArray"), ru.devprom.api.soap.service.dataservice.Task[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[276] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "taskArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Task[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[277] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("task.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "task"), ru.devprom.api.soap.service.dataservice.Task.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "taskArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Task[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[278] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "tasktype"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Tasktype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[279] = oper;

    }

    private static void _initOperationDesc29(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktype"), ru.devprom.api.soap.service.dataservice.Tasktype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "tasktype"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Tasktype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[280] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktypeArray"), ru.devprom.api.soap.service.dataservice.Tasktype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "tasktypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Tasktype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[281] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktype"), ru.devprom.api.soap.service.dataservice.Tasktype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[282] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktypeArray"), ru.devprom.api.soap.service.dataservice.Tasktype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[283] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[284] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktypeArray"), ru.devprom.api.soap.service.dataservice.Tasktype[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[285] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "tasktypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Tasktype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[286] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tasktype.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "tasktype"), ru.devprom.api.soap.service.dataservice.Tasktype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "tasktypeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Tasktype[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[287] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "user"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.User.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[288] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "user"), ru.devprom.api.soap.service.dataservice.User.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "user"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.User.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[289] = oper;

    }

    private static void _initOperationDesc30(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "userArray"), ru.devprom.api.soap.service.dataservice.User[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "userArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[290] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "user"), ru.devprom.api.soap.service.dataservice.User.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[291] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "userArray"), ru.devprom.api.soap.service.dataservice.User[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[292] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[293] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "userArray"), ru.devprom.api.soap.service.dataservice.User[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[294] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "userArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[295] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "user"), ru.devprom.api.soap.service.dataservice.User.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "userArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[296] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[297] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipage"), ru.devprom.api.soap.service.dataservice.Wikipage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipage"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[298] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipageArray"), ru.devprom.api.soap.service.dataservice.Wikipage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[299] = oper;

    }

    private static void _initOperationDesc31(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipage"), ru.devprom.api.soap.service.dataservice.Wikipage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[300] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipageArray"), ru.devprom.api.soap.service.dataservice.Wikipage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[301] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[302] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipageArray"), ru.devprom.api.soap.service.dataservice.Wikipage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[303] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[304] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipage.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipage"), ru.devprom.api.soap.service.dataservice.Wikipage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipageArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[305] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipagefile"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipagefile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[306] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefile"), ru.devprom.api.soap.service.dataservice.Wikipagefile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipagefile"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipagefile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[307] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefileArray"), ru.devprom.api.soap.service.dataservice.Wikipagefile[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipagefileArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[308] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefile"), ru.devprom.api.soap.service.dataservice.Wikipagefile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[309] = oper;

    }

    private static void _initOperationDesc32(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefileArray"), ru.devprom.api.soap.service.dataservice.Wikipagefile[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[310] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[311] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefileArray"), ru.devprom.api.soap.service.dataservice.Wikipagefile[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[312] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipagefileArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[313] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wikipagefile.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "wikipagefile"), ru.devprom.api.soap.service.dataservice.Wikipagefile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "wikipagefileArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[314] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "snapshot"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Snapshot.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[315] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshot"), ru.devprom.api.soap.service.dataservice.Snapshot.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "snapshot"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Snapshot.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[316] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshotArray"), ru.devprom.api.soap.service.dataservice.Snapshot[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "snapshotArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Snapshot[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[317] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshot"), ru.devprom.api.soap.service.dataservice.Snapshot.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[318] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshotArray"), ru.devprom.api.soap.service.dataservice.Snapshot[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[319] = oper;

    }

    private static void _initOperationDesc33(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[320] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshotArray"), ru.devprom.api.soap.service.dataservice.Snapshot[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[321] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "snapshotArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Snapshot[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[322] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("snapshot.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "snapshot"), ru.devprom.api.soap.service.dataservice.Snapshot.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "snapshotArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Snapshot[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[323] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "statebase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Statebase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[324] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebase"), ru.devprom.api.soap.service.dataservice.Statebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "statebase"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Statebase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[325] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebaseArray"), ru.devprom.api.soap.service.dataservice.Statebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "statebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Statebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[326] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebase"), ru.devprom.api.soap.service.dataservice.Statebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[327] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebaseArray"), ru.devprom.api.soap.service.dataservice.Statebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[328] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[329] = oper;

    }

    private static void _initOperationDesc34(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebaseArray"), ru.devprom.api.soap.service.dataservice.Statebase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[330] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "statebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Statebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[331] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("statebase.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "statebase"), ru.devprom.api.soap.service.dataservice.Statebase.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "statebaseArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Statebase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[332] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "watcher"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Watcher.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[333] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcher"), ru.devprom.api.soap.service.dataservice.Watcher.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "watcher"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Watcher.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[334] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcherArray"), ru.devprom.api.soap.service.dataservice.Watcher[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "watcherArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Watcher[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[335] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcher"), ru.devprom.api.soap.service.dataservice.Watcher.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[336] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcherArray"), ru.devprom.api.soap.service.dataservice.Watcher[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[337] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[338] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcherArray"), ru.devprom.api.soap.service.dataservice.Watcher[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[339] = oper;

    }

    private static void _initOperationDesc35(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "watcherArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Watcher[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[340] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watcher.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "watcher"), ru.devprom.api.soap.service.dataservice.Watcher.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "watcherArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Watcher[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[341] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "customer"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Customer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[342] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customer"), ru.devprom.api.soap.service.dataservice.Customer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "customer"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Customer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[343] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customerArray"), ru.devprom.api.soap.service.dataservice.Customer[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "customerArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Customer[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[344] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customer"), ru.devprom.api.soap.service.dataservice.Customer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[345] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customerArray"), ru.devprom.api.soap.service.dataservice.Customer[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[346] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[347] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customerArray"), ru.devprom.api.soap.service.dataservice.Customer[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[348] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "customerArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Customer[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[349] = oper;

    }

    private static void _initOperationDesc36(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customer.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "customer"), ru.devprom.api.soap.service.dataservice.Customer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "customerArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Customer[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[350] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattribute"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[351] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattribute"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattribute"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[352] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributeArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[353] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattribute"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[354] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributeArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[355] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[356] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributeArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[357] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[358] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattribute.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattribute"), ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributeArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[359] = oper;

    }

    private static void _initOperationDesc37(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributevalue"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[360] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalue"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributevalue"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[361] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteAddBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[362] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteStore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalue"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[363] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteStoreBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[364] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[365] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteDeleteBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[366] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteGetAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[367] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pmcustomattributevalue.RemoteFind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("tns", "pmcustomattributevalue"), ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray"));
        oper.setReturnClass(ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[368] = oper;

    }

    public DataServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DataServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DataServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("tns", "activity");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "activityArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "activity");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "attachment");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "attachmentArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "attachment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "build");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Build.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "buildArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Build[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "build");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "changelog");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Changelog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "changelogArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Changelog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "changelog");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "comment");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Comment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "commentArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Comment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "comment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "commit");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Commit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "commitArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Commit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "commit");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "customer");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "customerArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Customer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "customer");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "environment");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Environment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "environmentArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Environment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "environment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "feature");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Feature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "featureArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Feature[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "feature");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "helppage");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Helppage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "helppageArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Helppage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "helppage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "iteration");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Iteration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "iterationArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Iteration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "iteration");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "methodology");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Methodology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "methodologyArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Methodology[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "methodology");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "milestone");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Milestone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "milestoneArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Milestone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "milestone");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "participant");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Participant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "participantArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Participant[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "participant");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "participantrole");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Participantrole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "participantroleArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Participantrole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "participantrole");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "pmcustomattribute");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "pmcustomattributeArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "pmcustomattribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "pmcustomattributevalue");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "pmcustomattributevalueArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "pmcustomattributevalue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "priority");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Priority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "priorityArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Priority[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "priority");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "project");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "projectArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Project[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "project");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "projectpage");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectpage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "projectpageArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectpage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "projectpage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "projectrole");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectrole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "projectroleArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectrole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "projectrole");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "projectrolebase");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectrolebase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "projectrolebaseArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Projectrolebase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "projectrolebase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "question");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Question.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "questionArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Question[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "question");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "release");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Release.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "releaseArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Release[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "release");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "request");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "requestArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Request[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "request");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "requestlink");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requestlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "requestlinkArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requestlink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "requestlink");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "requesttype");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requesttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "requesttypeArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requesttype[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "requesttype");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "requirement");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "requirementArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Requirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "requirement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "reviewrequest");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Reviewrequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "reviewrequestArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Reviewrequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "reviewrequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "snapshot");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Snapshot.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "snapshotArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Snapshot[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "snapshot");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "statebase");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Statebase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "statebaseArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Statebase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "statebase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "task");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "taskArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Task[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "task");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "tasktype");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Tasktype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "tasktypeArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Tasktype[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "tasktype");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "testcase");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testcase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testcaseArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testcase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "testcase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "testcaseexecution");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testcaseexecution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testcaseexecutionArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "testcaseexecution");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "testexecutionresult");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testexecutionresult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testexecutionresultArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "testexecutionresult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "testscenario");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testscenario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "testscenarioArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Testscenario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "testscenario");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "user");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "userArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "user");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "watcher");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Watcher.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "watcherArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Watcher[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "watcher");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "wikipage");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Wikipage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "wikipageArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Wikipage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "wikipage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("tns", "wikipagefile");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Wikipagefile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("tns", "wikipagefileArray");
            cachedSerQNames.add(qName);
            cls = ru.devprom.api.soap.service.dataservice.Wikipagefile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("tns", "wikipagefile");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public ru.devprom.api.soap.service.dataservice.Build buildRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Build) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Build) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Build.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Build buildRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Build) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Build) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Build.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int buildRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storebuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void buildRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void buildRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletebuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void buildRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Build[] buildRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Build parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findbuild");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "build.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requirement) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requirement) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requirement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requirement requirementRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requirement) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requirement) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requirement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requirement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int requirementRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storerequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requirementRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requirementRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleterequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requirementRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requirement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requirement[] requirementRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requirement parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findrequirement");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requirement.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requirement[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requirement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Commit commitRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Commit) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Commit) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Commit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Commit commitRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Commit) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Commit) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Commit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Commit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int commitRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storecommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commitRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commitRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletecommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commitRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Commit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Commit[] commitRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Commit parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findcommit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "commit.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Commit[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Commit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Reviewrequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Reviewrequest reviewrequestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Reviewrequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reviewrequestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storereviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reviewrequestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reviewrequestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletereviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reviewrequestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Reviewrequest[] reviewrequestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Reviewrequest parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findreviewrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reviewrequest.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Reviewrequest[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Reviewrequest[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcase testcaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testcaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcase[] testcaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtestcase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcase.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcaseexecution.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcaseexecution testcaseexecutionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcaseexecution.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testcaseexecutionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseexecutionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseexecutionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testcaseexecutionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testcaseexecution[] testcaseexecutionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testcaseexecution parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtestcaseexecution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testcaseexecution.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testcaseexecution[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testcaseexecution[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testexecutionresult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testexecutionresult testexecutionresultRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testexecutionresult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testexecutionresultRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testexecutionresultRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testexecutionresultRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testexecutionresultRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testexecutionresult[] testexecutionresultRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testexecutionresult parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtestexecutionresult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testexecutionresult.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testexecutionresult[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testexecutionresult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testscenario) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testscenario) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testscenario.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testscenario testscenarioRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testscenario) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testscenario) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testscenario.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testscenario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int testscenarioRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testscenarioRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testscenarioRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void testscenarioRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testscenario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Testscenario[] testscenarioRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Testscenario parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtestscenario");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "testscenario.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Testscenario[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Testscenario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Helppage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Helppage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Helppage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Helppage helppageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Helppage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Helppage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Helppage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Helppage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int helppageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storehelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void helppageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void helppageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletehelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void helppageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Helppage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Helppage[] helppageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Helppage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findhelppage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "helppage.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Helppage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Helppage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Activity activityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Activity) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Activity) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Activity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Activity activityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Activity) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Activity) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Activity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int activityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void activityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void activityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void activityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Activity[] activityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Activity parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findactivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activity.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Attachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Attachment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Attachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Attachment attachmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Attachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Attachment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Attachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int attachmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void attachmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void attachmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void attachmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Attachment[] attachmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Attachment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findattachment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachment.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Attachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Attachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Changelog) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Changelog) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Changelog.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Changelog changelogRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Changelog) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Changelog) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Changelog.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Changelog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changelogRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storechangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changelogRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changelogRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletechangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void changelogRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Changelog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Changelog[] changelogRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Changelog parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findchangelog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changelog.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Changelog[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Changelog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Comment commentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Comment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Comment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Comment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Comment commentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Comment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Comment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Comment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Comment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int commentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storecomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletecomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void commentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Comment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Comment[] commentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Comment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findcomment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "comment.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Comment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Comment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Environment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Environment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Environment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Environment environmentRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Environment) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Environment) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Environment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Environment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int environmentRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void environmentRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void environmentRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void environmentRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Environment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Environment[] environmentRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Environment parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findenvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "environment.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Environment[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Environment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loaditeration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Iteration) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Iteration) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Iteration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Iteration iterationRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Additeration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Iteration) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Iteration) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Iteration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchiteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Iteration[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int iterationRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeiteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void iterationRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchiteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void iterationRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteiteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void iterationRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchiteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlliteration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Iteration[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Iteration[] iterationRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Iteration parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Finditeration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "iteration.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Iteration[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Iteration[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Methodology) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Methodology) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Methodology.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Methodology methodologyRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Methodology) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Methodology) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Methodology.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Methodology[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int methodologyRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storemethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void methodologyRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void methodologyRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletemethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void methodologyRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Methodology[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Methodology[] methodologyRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Methodology parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findmethodology");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "methodology.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Methodology[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Methodology[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Feature featureRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Feature) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Feature) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Feature.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Feature featureRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Feature) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Feature) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Feature.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Feature[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int featureRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storefeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void featureRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void featureRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletefeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void featureRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Feature[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Feature[] featureRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Feature parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findfeature");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "feature.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Feature[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Feature[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Milestone) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Milestone) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Milestone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Milestone milestoneRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Milestone) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Milestone) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Milestone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Milestone[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int milestoneRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storemilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void milestoneRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void milestoneRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletemilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void milestoneRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Milestone[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Milestone[] milestoneRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Milestone parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findmilestone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "milestone.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Milestone[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Milestone[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participant participantRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participant) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participant) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participant.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participant participantRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participant) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participant) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participant.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participant[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int participantRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participant[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participant[] participantRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participant parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findparticipant");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participant.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participant[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participant[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participantrole) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participantrole) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participantrole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participantrole participantroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participantrole) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participantrole) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participantrole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participantrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int participantroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void participantroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participantrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Participantrole[] participantroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Participantrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findparticipantrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "participantrole.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Participantrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Participantrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Priority) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Priority) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Priority.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Priority priorityRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Priority) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Priority) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Priority.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Priority[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int priorityRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storepriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void priorityRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void priorityRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletepriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void priorityRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Priority[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Priority[] priorityRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Priority parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findpriority");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "priority.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Priority[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Priority[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Project projectRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Project) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Project) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Project.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Project projectRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Project) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Project) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Project.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Project[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Project[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Project[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int projectRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[193]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[194]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[195]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[196]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Project[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Project[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Project[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Project[] projectRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Project parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[197]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findproject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "project.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Project[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Project[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Project[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[198]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectpage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectpage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectpage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectpage projectpageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[199]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectpage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectpage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectpage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[200]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectpage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int projectpageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[201]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectpageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[202]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectpageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[203]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectpageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[204]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[205]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectpage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectpage[] projectpageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectpage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[206]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findprojectpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectpage.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectpage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectpage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[207]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrole) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrole) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrole projectroleRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[208]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrole) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrole) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[209]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int projectroleRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[210]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectroleRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[211]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectroleRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[212]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectroleRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[213]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[214]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrole[] projectroleRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrole parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[215]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findprojectrole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrole.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrole[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[216]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrolebase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrolebase projectrolebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[217]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrolebase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[218]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int projectrolebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[219]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectrolebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[220]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectrolebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[221]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void projectrolebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[222]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[223]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Projectrolebase[] projectrolebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Projectrolebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[224]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findprojectrolebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "projectrolebase.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Projectrolebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Projectrolebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Question questionRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[225]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Question) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Question) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Question.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Question questionRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[226]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Question) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Question) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Question.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[227]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Question[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Question[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Question[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int questionRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[228]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storequestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void questionRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[229]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void questionRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[230]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletequestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void questionRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[231]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[232]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Question[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Question[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Question[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Question[] questionRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Question parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[233]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findquestion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "question.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Question[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Question[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Question[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Release releaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[234]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Release) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Release) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Release.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Release releaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[235]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Release) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Release) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Release.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[236]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Release[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Release[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Release[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int releaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[237]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storerelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void releaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[238]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void releaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[239]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleterelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void releaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[240]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[241]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Release[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Release[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Release[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Release[] releaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Release parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[242]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findrelease");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "release.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Release[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Release[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Release[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Request requestRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[243]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Request) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Request requestRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[244]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Request) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[245]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int requestRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[246]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storerequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[247]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[248]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleterequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[249]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[250]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Request[] requestRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Request parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[251]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findrequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "request.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Request[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Request[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Request[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[252]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requestlink) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requestlink) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requestlink.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requestlink requestlinkRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[253]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requestlink) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requestlink) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requestlink.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[254]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requestlink[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int requestlinkRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[255]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storerequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestlinkRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[256]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestlinkRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[257]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleterequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requestlinkRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[258]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[259]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requestlink[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requestlink[] requestlinkRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requestlink parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[260]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findrequestlink");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestlink.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requestlink[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requestlink[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[261]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requesttype) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requesttype) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requesttype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requesttype requesttypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[262]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requesttype) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requesttype) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requesttype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[263]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requesttype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int requesttypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[264]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storerequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requesttypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[265]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requesttypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[266]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleterequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requesttypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[267]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[268]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requesttype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Requesttype[] requesttypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Requesttype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[269]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findrequesttype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requesttype.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Requesttype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Requesttype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Task taskRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[270]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Task) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Task) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Task.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Task taskRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[271]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Task) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Task) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Task.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[272]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Task[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Task[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Task[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int taskRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[273]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void taskRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[274]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void taskRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[275]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void taskRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[276]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[277]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Task[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Task[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Task[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Task[] taskRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Task parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[278]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtask");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "task.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Task[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Task[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Task[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[279]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Tasktype) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Tasktype) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Tasktype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Tasktype tasktypeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[280]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Tasktype) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Tasktype) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Tasktype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[281]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Tasktype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int tasktypeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[282]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storetasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void tasktypeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[283]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void tasktypeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[284]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletetasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void tasktypeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[285]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[286]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlltasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Tasktype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Tasktype[] tasktypeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Tasktype parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[287]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findtasktype");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tasktype.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Tasktype[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Tasktype[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.User userRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[288]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loaduser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.User) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.User) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.User.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.User userRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[289]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Adduser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.User) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.User) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.User.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.User[] userRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[290]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int userRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[291]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storeuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void userRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[292]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void userRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[293]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deleteuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void userRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.User[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[294]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.User[] userRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[295]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAlluser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.User[] userRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.User parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[296]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Finduser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "user.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[297]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipage wikipageRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[298]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipage) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipage) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[299]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int wikipageRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[300]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storewikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipageRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[301]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipageRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[302]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletewikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipageRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[303]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[304]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipage[] wikipageRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipage parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[305]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findwikipage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipage.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipage[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[306]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipagefile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipagefile wikipagefileRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[307]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipagefile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[308]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int wikipagefileRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[309]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storewikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipagefileRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[310]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipagefileRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[311]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletewikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void wikipagefileRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[312]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[313]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Wikipagefile[] wikipagefileRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Wikipagefile parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[314]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findwikipagefile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "wikipagefile.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Wikipagefile[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Wikipagefile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[315]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Snapshot) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Snapshot) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Snapshot.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Snapshot snapshotRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[316]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Snapshot) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Snapshot) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Snapshot.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[317]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Snapshot[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int snapshotRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[318]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storesnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void snapshotRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[319]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void snapshotRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[320]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletesnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void snapshotRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[321]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[322]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Snapshot[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Snapshot[] snapshotRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Snapshot parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[323]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findsnapshot");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "snapshot.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Snapshot[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Snapshot[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[324]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Statebase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Statebase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Statebase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Statebase statebaseRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[325]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Statebase) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Statebase) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Statebase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[326]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Statebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int statebaseRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[327]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storestatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void statebaseRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[328]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void statebaseRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[329]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletestatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void statebaseRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[330]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[331]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Statebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Statebase[] statebaseRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Statebase parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[332]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findstatebase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "statebase.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Statebase[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Statebase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[333]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Watcher) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Watcher) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Watcher.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Watcher watcherRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[334]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Watcher) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Watcher) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Watcher.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[335]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Watcher[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int watcherRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[336]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storewatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void watcherRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[337]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void watcherRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[338]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletewatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void watcherRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[339]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[340]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Watcher[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Watcher[] watcherRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Watcher parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[341]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findwatcher");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "watcher.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Watcher[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Watcher[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Customer customerRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[342]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Customer) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Customer) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Customer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Customer customerRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[343]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Customer) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Customer) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Customer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[344]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Customer[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int customerRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[345]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storecustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void customerRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[346]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void customerRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[347]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletecustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void customerRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[348]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[349]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Customer[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Customer[] customerRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Customer parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[350]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findcustomer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "customer.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Customer[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Customer[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[351]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute pmcustomattributeRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[352]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattribute.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[353]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int pmcustomattributeRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[354]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storepmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributeRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[355]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributeRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[356]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletepmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributeRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[357]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[358]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattribute[] pmcustomattributeRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattribute parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[359]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findpmcustomattribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattribute.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteLoad(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[360]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Loadpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue pmcustomattributevalueRemoteAdd(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[361]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Addpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteAddBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[362]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#AddBatchpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteAddBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int pmcustomattributevalueRemoteStore(java.lang.String token, int id, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[363]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Storepmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteStore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id), parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributevalueRemoteStoreBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[364]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#StoreBatchpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteStoreBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributevalueRemoteDelete(java.lang.String token, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[365]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Deletepmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void pmcustomattributevalueRemoteDeleteBatch(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[366]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#DeleteBatchpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteDeleteBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteGetAll(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[367]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#GetAllpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteGetAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[] pmcustomattributevalueRemoteFind(java.lang.String token, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue parms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[368]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tns#Findpmcustomattributevalue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pmcustomattributevalue.RemoteFind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, parms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[]) org.apache.axis.utils.JavaUtils.convert(_resp, ru.devprom.api.soap.service.dataservice.Pmcustomattributevalue[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
