/**
 * Statebase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Statebase  implements java.io.Serializable {
    private java.lang.String caption;

    private java.lang.String description;

    private java.lang.String referenceName;

    private java.lang.String objectClass;

    private java.lang.String relatedColor;

    private java.lang.String isTerminal;

    private int queueLength;

    private java.lang.String excludeLeadTime;

    private java.lang.String skipEmailNotification;

    private java.lang.String isNewArtifacts;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int project;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Statebase() {
    }

    public Statebase(
           java.lang.String caption,
           java.lang.String description,
           java.lang.String referenceName,
           java.lang.String objectClass,
           java.lang.String relatedColor,
           java.lang.String isTerminal,
           int queueLength,
           java.lang.String excludeLeadTime,
           java.lang.String skipEmailNotification,
           java.lang.String isNewArtifacts,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int project,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.description = description;
           this.referenceName = referenceName;
           this.objectClass = objectClass;
           this.relatedColor = relatedColor;
           this.isTerminal = isTerminal;
           this.queueLength = queueLength;
           this.excludeLeadTime = excludeLeadTime;
           this.skipEmailNotification = skipEmailNotification;
           this.isNewArtifacts = isNewArtifacts;
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
     * Gets the caption value for this Statebase.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Statebase.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the description value for this Statebase.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Statebase.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the referenceName value for this Statebase.
     * 
     * @return referenceName
     */
    public java.lang.String getReferenceName() {
        return referenceName;
    }


    /**
     * Sets the referenceName value for this Statebase.
     * 
     * @param referenceName
     */
    public void setReferenceName(java.lang.String referenceName) {
        this.referenceName = referenceName;
    }


    /**
     * Gets the objectClass value for this Statebase.
     * 
     * @return objectClass
     */
    public java.lang.String getObjectClass() {
        return objectClass;
    }


    /**
     * Sets the objectClass value for this Statebase.
     * 
     * @param objectClass
     */
    public void setObjectClass(java.lang.String objectClass) {
        this.objectClass = objectClass;
    }


    /**
     * Gets the relatedColor value for this Statebase.
     * 
     * @return relatedColor
     */
    public java.lang.String getRelatedColor() {
        return relatedColor;
    }


    /**
     * Sets the relatedColor value for this Statebase.
     * 
     * @param relatedColor
     */
    public void setRelatedColor(java.lang.String relatedColor) {
        this.relatedColor = relatedColor;
    }


    /**
     * Gets the isTerminal value for this Statebase.
     * 
     * @return isTerminal
     */
    public java.lang.String getIsTerminal() {
        return isTerminal;
    }


    /**
     * Sets the isTerminal value for this Statebase.
     * 
     * @param isTerminal
     */
    public void setIsTerminal(java.lang.String isTerminal) {
        this.isTerminal = isTerminal;
    }


    /**
     * Gets the queueLength value for this Statebase.
     * 
     * @return queueLength
     */
    public int getQueueLength() {
        return queueLength;
    }


    /**
     * Sets the queueLength value for this Statebase.
     * 
     * @param queueLength
     */
    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }


    /**
     * Gets the excludeLeadTime value for this Statebase.
     * 
     * @return excludeLeadTime
     */
    public java.lang.String getExcludeLeadTime() {
        return excludeLeadTime;
    }


    /**
     * Sets the excludeLeadTime value for this Statebase.
     * 
     * @param excludeLeadTime
     */
    public void setExcludeLeadTime(java.lang.String excludeLeadTime) {
        this.excludeLeadTime = excludeLeadTime;
    }


    /**
     * Gets the skipEmailNotification value for this Statebase.
     * 
     * @return skipEmailNotification
     */
    public java.lang.String getSkipEmailNotification() {
        return skipEmailNotification;
    }


    /**
     * Sets the skipEmailNotification value for this Statebase.
     * 
     * @param skipEmailNotification
     */
    public void setSkipEmailNotification(java.lang.String skipEmailNotification) {
        this.skipEmailNotification = skipEmailNotification;
    }


    /**
     * Gets the isNewArtifacts value for this Statebase.
     * 
     * @return isNewArtifacts
     */
    public java.lang.String getIsNewArtifacts() {
        return isNewArtifacts;
    }


    /**
     * Sets the isNewArtifacts value for this Statebase.
     * 
     * @param isNewArtifacts
     */
    public void setIsNewArtifacts(java.lang.String isNewArtifacts) {
        this.isNewArtifacts = isNewArtifacts;
    }


    /**
     * Gets the orderNum value for this Statebase.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Statebase.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Statebase.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Statebase.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Statebase.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Statebase.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the project value for this Statebase.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Statebase.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the id value for this Statebase.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Statebase.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Statebase.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Statebase.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Statebase.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Statebase.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Statebase.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Statebase.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statebase)) return false;
        Statebase other = (Statebase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.referenceName==null && other.getReferenceName()==null) || 
             (this.referenceName!=null &&
              this.referenceName.equals(other.getReferenceName()))) &&
            ((this.objectClass==null && other.getObjectClass()==null) || 
             (this.objectClass!=null &&
              this.objectClass.equals(other.getObjectClass()))) &&
            ((this.relatedColor==null && other.getRelatedColor()==null) || 
             (this.relatedColor!=null &&
              this.relatedColor.equals(other.getRelatedColor()))) &&
            ((this.isTerminal==null && other.getIsTerminal()==null) || 
             (this.isTerminal!=null &&
              this.isTerminal.equals(other.getIsTerminal()))) &&
            this.queueLength == other.getQueueLength() &&
            ((this.excludeLeadTime==null && other.getExcludeLeadTime()==null) || 
             (this.excludeLeadTime!=null &&
              this.excludeLeadTime.equals(other.getExcludeLeadTime()))) &&
            ((this.skipEmailNotification==null && other.getSkipEmailNotification()==null) || 
             (this.skipEmailNotification!=null &&
              this.skipEmailNotification.equals(other.getSkipEmailNotification()))) &&
            ((this.isNewArtifacts==null && other.getIsNewArtifacts()==null) || 
             (this.isNewArtifacts!=null &&
              this.isNewArtifacts.equals(other.getIsNewArtifacts()))) &&
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
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getReferenceName() != null) {
            _hashCode += getReferenceName().hashCode();
        }
        if (getObjectClass() != null) {
            _hashCode += getObjectClass().hashCode();
        }
        if (getRelatedColor() != null) {
            _hashCode += getRelatedColor().hashCode();
        }
        if (getIsTerminal() != null) {
            _hashCode += getIsTerminal().hashCode();
        }
        _hashCode += getQueueLength();
        if (getExcludeLeadTime() != null) {
            _hashCode += getExcludeLeadTime().hashCode();
        }
        if (getSkipEmailNotification() != null) {
            _hashCode += getSkipEmailNotification().hashCode();
        }
        if (getIsNewArtifacts() != null) {
            _hashCode += getIsNewArtifacts().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(Statebase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "statebase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReferenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelatedColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTerminal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTerminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcludeLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipEmailNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SkipEmailNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewArtifacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsNewArtifacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
