/**
 * Tasktype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Tasktype  implements java.io.Serializable {
    private java.lang.String caption;

    private java.lang.String shortCaption;

    private java.lang.String description;

    private java.lang.String relatedColor;

    private int projectRole;

    private java.lang.String isDefault;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int parentTaskType;

    private java.lang.String referenceName;

    private int orderNum;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Tasktype() {
    }

    public Tasktype(
           java.lang.String caption,
           java.lang.String shortCaption,
           java.lang.String description,
           java.lang.String relatedColor,
           int projectRole,
           java.lang.String isDefault,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int parentTaskType,
           java.lang.String referenceName,
           int orderNum,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.shortCaption = shortCaption;
           this.description = description;
           this.relatedColor = relatedColor;
           this.projectRole = projectRole;
           this.isDefault = isDefault;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.parentTaskType = parentTaskType;
           this.referenceName = referenceName;
           this.orderNum = orderNum;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Tasktype.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Tasktype.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the shortCaption value for this Tasktype.
     * 
     * @return shortCaption
     */
    public java.lang.String getShortCaption() {
        return shortCaption;
    }


    /**
     * Sets the shortCaption value for this Tasktype.
     * 
     * @param shortCaption
     */
    public void setShortCaption(java.lang.String shortCaption) {
        this.shortCaption = shortCaption;
    }


    /**
     * Gets the description value for this Tasktype.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Tasktype.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the relatedColor value for this Tasktype.
     * 
     * @return relatedColor
     */
    public java.lang.String getRelatedColor() {
        return relatedColor;
    }


    /**
     * Sets the relatedColor value for this Tasktype.
     * 
     * @param relatedColor
     */
    public void setRelatedColor(java.lang.String relatedColor) {
        this.relatedColor = relatedColor;
    }


    /**
     * Gets the projectRole value for this Tasktype.
     * 
     * @return projectRole
     */
    public int getProjectRole() {
        return projectRole;
    }


    /**
     * Sets the projectRole value for this Tasktype.
     * 
     * @param projectRole
     */
    public void setProjectRole(int projectRole) {
        this.projectRole = projectRole;
    }


    /**
     * Gets the isDefault value for this Tasktype.
     * 
     * @return isDefault
     */
    public java.lang.String getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this Tasktype.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.String isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the recordCreated value for this Tasktype.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Tasktype.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Tasktype.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Tasktype.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the parentTaskType value for this Tasktype.
     * 
     * @return parentTaskType
     */
    public int getParentTaskType() {
        return parentTaskType;
    }


    /**
     * Sets the parentTaskType value for this Tasktype.
     * 
     * @param parentTaskType
     */
    public void setParentTaskType(int parentTaskType) {
        this.parentTaskType = parentTaskType;
    }


    /**
     * Gets the referenceName value for this Tasktype.
     * 
     * @return referenceName
     */
    public java.lang.String getReferenceName() {
        return referenceName;
    }


    /**
     * Sets the referenceName value for this Tasktype.
     * 
     * @param referenceName
     */
    public void setReferenceName(java.lang.String referenceName) {
        this.referenceName = referenceName;
    }


    /**
     * Gets the orderNum value for this Tasktype.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Tasktype.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the id value for this Tasktype.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Tasktype.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Tasktype.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Tasktype.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Tasktype.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Tasktype.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Tasktype.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Tasktype.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tasktype)) return false;
        Tasktype other = (Tasktype) obj;
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
            ((this.shortCaption==null && other.getShortCaption()==null) || 
             (this.shortCaption!=null &&
              this.shortCaption.equals(other.getShortCaption()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.relatedColor==null && other.getRelatedColor()==null) || 
             (this.relatedColor!=null &&
              this.relatedColor.equals(other.getRelatedColor()))) &&
            this.projectRole == other.getProjectRole() &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.parentTaskType == other.getParentTaskType() &&
            ((this.referenceName==null && other.getReferenceName()==null) || 
             (this.referenceName!=null &&
              this.referenceName.equals(other.getReferenceName()))) &&
            this.orderNum == other.getOrderNum() &&
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
        if (getShortCaption() != null) {
            _hashCode += getShortCaption().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRelatedColor() != null) {
            _hashCode += getRelatedColor().hashCode();
        }
        _hashCode += getProjectRole();
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getParentTaskType();
        if (getReferenceName() != null) {
            _hashCode += getReferenceName().hashCode();
        }
        _hashCode += getOrderNum();
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
        new org.apache.axis.description.TypeDesc(Tasktype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "tasktype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortCaption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShortCaption"));
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
        elemField.setFieldName("relatedColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelatedColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProjectRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDefault"));
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
        elemField.setFieldName("parentTaskType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentTaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReferenceName"));
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
