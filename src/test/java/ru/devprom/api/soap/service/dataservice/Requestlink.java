/**
 * Requestlink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Requestlink  implements java.io.Serializable {
    private int sourceRequest;

    private int targetRequest;

    private int linkType;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int project;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Requestlink() {
    }

    public Requestlink(
           int sourceRequest,
           int targetRequest,
           int linkType,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int project,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.sourceRequest = sourceRequest;
           this.targetRequest = targetRequest;
           this.linkType = linkType;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.project = project;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the sourceRequest value for this Requestlink.
     * 
     * @return sourceRequest
     */
    public int getSourceRequest() {
        return sourceRequest;
    }


    /**
     * Sets the sourceRequest value for this Requestlink.
     * 
     * @param sourceRequest
     */
    public void setSourceRequest(int sourceRequest) {
        this.sourceRequest = sourceRequest;
    }


    /**
     * Gets the targetRequest value for this Requestlink.
     * 
     * @return targetRequest
     */
    public int getTargetRequest() {
        return targetRequest;
    }


    /**
     * Sets the targetRequest value for this Requestlink.
     * 
     * @param targetRequest
     */
    public void setTargetRequest(int targetRequest) {
        this.targetRequest = targetRequest;
    }


    /**
     * Gets the linkType value for this Requestlink.
     * 
     * @return linkType
     */
    public int getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this Requestlink.
     * 
     * @param linkType
     */
    public void setLinkType(int linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the orderNum value for this Requestlink.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Requestlink.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Requestlink.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Requestlink.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Requestlink.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Requestlink.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the project value for this Requestlink.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Requestlink.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the id value for this Requestlink.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Requestlink.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Requestlink.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Requestlink.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Requestlink.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Requestlink.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Requestlink.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Requestlink.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Requestlink)) return false;
        Requestlink other = (Requestlink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sourceRequest == other.getSourceRequest() &&
            this.targetRequest == other.getTargetRequest() &&
            this.linkType == other.getLinkType() &&
            this.orderNum == other.getOrderNum() &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.project == other.getProject() &&
            this.id == other.getId() &&
            ((this.className==null && other.getClassName()==null) || 
             (this.className!=null &&
              this.className.equals(other.getClassName()))) &&
            this.recordVersion == other.getRecordVersion() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getSourceRequest();
        _hashCode += getTargetRequest();
        _hashCode += getLinkType();
        _hashCode += getOrderNum();
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getProject();
        _hashCode += getId();
        if (getClassName() != null) {
            _hashCode += getClassName().hashCode();
        }
        _hashCode += getRecordVersion();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Requestlink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "requestlink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordModified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("className");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecordVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
