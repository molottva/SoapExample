/**
 * Pmcustomattributevalue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Pmcustomattributevalue  implements java.io.Serializable {
    private int customAttribute;

    private int objectId;

    private java.lang.String stringValue;

    private java.lang.String textValue;

    private java.lang.String passwordValue;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Pmcustomattributevalue() {
    }

    public Pmcustomattributevalue(
           int customAttribute,
           int objectId,
           java.lang.String stringValue,
           java.lang.String textValue,
           java.lang.String passwordValue,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.customAttribute = customAttribute;
           this.objectId = objectId;
           this.stringValue = stringValue;
           this.textValue = textValue;
           this.passwordValue = passwordValue;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the customAttribute value for this Pmcustomattributevalue.
     * 
     * @return customAttribute
     */
    public int getCustomAttribute() {
        return customAttribute;
    }


    /**
     * Sets the customAttribute value for this Pmcustomattributevalue.
     * 
     * @param customAttribute
     */
    public void setCustomAttribute(int customAttribute) {
        this.customAttribute = customAttribute;
    }


    /**
     * Gets the objectId value for this Pmcustomattributevalue.
     * 
     * @return objectId
     */
    public int getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this Pmcustomattributevalue.
     * 
     * @param objectId
     */
    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the stringValue value for this Pmcustomattributevalue.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this Pmcustomattributevalue.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the textValue value for this Pmcustomattributevalue.
     * 
     * @return textValue
     */
    public java.lang.String getTextValue() {
        return textValue;
    }


    /**
     * Sets the textValue value for this Pmcustomattributevalue.
     * 
     * @param textValue
     */
    public void setTextValue(java.lang.String textValue) {
        this.textValue = textValue;
    }


    /**
     * Gets the passwordValue value for this Pmcustomattributevalue.
     * 
     * @return passwordValue
     */
    public java.lang.String getPasswordValue() {
        return passwordValue;
    }


    /**
     * Sets the passwordValue value for this Pmcustomattributevalue.
     * 
     * @param passwordValue
     */
    public void setPasswordValue(java.lang.String passwordValue) {
        this.passwordValue = passwordValue;
    }


    /**
     * Gets the recordCreated value for this Pmcustomattributevalue.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Pmcustomattributevalue.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Pmcustomattributevalue.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Pmcustomattributevalue.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the id value for this Pmcustomattributevalue.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Pmcustomattributevalue.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Pmcustomattributevalue.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Pmcustomattributevalue.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Pmcustomattributevalue.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Pmcustomattributevalue.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Pmcustomattributevalue.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Pmcustomattributevalue.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pmcustomattributevalue)) return false;
        Pmcustomattributevalue other = (Pmcustomattributevalue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.customAttribute == other.getCustomAttribute() &&
            this.objectId == other.getObjectId() &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.textValue==null && other.getTextValue()==null) || 
             (this.textValue!=null &&
              this.textValue.equals(other.getTextValue()))) &&
            ((this.passwordValue==null && other.getPasswordValue()==null) || 
             (this.passwordValue!=null &&
              this.passwordValue.equals(other.getPasswordValue()))) &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
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
        _hashCode += getCustomAttribute();
        _hashCode += getObjectId();
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        if (getTextValue() != null) {
            _hashCode += getTextValue().hashCode();
        }
        if (getPasswordValue() != null) {
            _hashCode += getPasswordValue().hashCode();
        }
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(Pmcustomattributevalue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "pmcustomattributevalue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PasswordValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
