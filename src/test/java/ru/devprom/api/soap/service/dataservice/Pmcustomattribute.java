/**
 * Pmcustomattribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Pmcustomattribute  implements java.io.Serializable {
    private java.lang.String caption;

    private java.lang.String referenceName;

    private java.lang.String entityReferenceName;

    private int attributeType;

    private java.lang.String isMultiple;

    private java.lang.String valueRange;

    private java.lang.String defaultValue;

    private java.lang.String description;

    private java.lang.String isVisible;

    private java.lang.String isReadonly;

    private java.lang.String showMainTab;

    private java.lang.String isRequired;

    private java.lang.String isUnique;

    private java.lang.String isNotificationVisible;

    private java.lang.String groups;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Pmcustomattribute() {
    }

    public Pmcustomattribute(
           java.lang.String caption,
           java.lang.String referenceName,
           java.lang.String entityReferenceName,
           int attributeType,
           java.lang.String isMultiple,
           java.lang.String valueRange,
           java.lang.String defaultValue,
           java.lang.String description,
           java.lang.String isVisible,
           java.lang.String isReadonly,
           java.lang.String showMainTab,
           java.lang.String isRequired,
           java.lang.String isUnique,
           java.lang.String isNotificationVisible,
           java.lang.String groups,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.referenceName = referenceName;
           this.entityReferenceName = entityReferenceName;
           this.attributeType = attributeType;
           this.isMultiple = isMultiple;
           this.valueRange = valueRange;
           this.defaultValue = defaultValue;
           this.description = description;
           this.isVisible = isVisible;
           this.isReadonly = isReadonly;
           this.showMainTab = showMainTab;
           this.isRequired = isRequired;
           this.isUnique = isUnique;
           this.isNotificationVisible = isNotificationVisible;
           this.groups = groups;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Pmcustomattribute.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Pmcustomattribute.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the referenceName value for this Pmcustomattribute.
     * 
     * @return referenceName
     */
    public java.lang.String getReferenceName() {
        return referenceName;
    }


    /**
     * Sets the referenceName value for this Pmcustomattribute.
     * 
     * @param referenceName
     */
    public void setReferenceName(java.lang.String referenceName) {
        this.referenceName = referenceName;
    }


    /**
     * Gets the entityReferenceName value for this Pmcustomattribute.
     * 
     * @return entityReferenceName
     */
    public java.lang.String getEntityReferenceName() {
        return entityReferenceName;
    }


    /**
     * Sets the entityReferenceName value for this Pmcustomattribute.
     * 
     * @param entityReferenceName
     */
    public void setEntityReferenceName(java.lang.String entityReferenceName) {
        this.entityReferenceName = entityReferenceName;
    }


    /**
     * Gets the attributeType value for this Pmcustomattribute.
     * 
     * @return attributeType
     */
    public int getAttributeType() {
        return attributeType;
    }


    /**
     * Sets the attributeType value for this Pmcustomattribute.
     * 
     * @param attributeType
     */
    public void setAttributeType(int attributeType) {
        this.attributeType = attributeType;
    }


    /**
     * Gets the isMultiple value for this Pmcustomattribute.
     * 
     * @return isMultiple
     */
    public java.lang.String getIsMultiple() {
        return isMultiple;
    }


    /**
     * Sets the isMultiple value for this Pmcustomattribute.
     * 
     * @param isMultiple
     */
    public void setIsMultiple(java.lang.String isMultiple) {
        this.isMultiple = isMultiple;
    }


    /**
     * Gets the valueRange value for this Pmcustomattribute.
     * 
     * @return valueRange
     */
    public java.lang.String getValueRange() {
        return valueRange;
    }


    /**
     * Sets the valueRange value for this Pmcustomattribute.
     * 
     * @param valueRange
     */
    public void setValueRange(java.lang.String valueRange) {
        this.valueRange = valueRange;
    }


    /**
     * Gets the defaultValue value for this Pmcustomattribute.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this Pmcustomattribute.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the description value for this Pmcustomattribute.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Pmcustomattribute.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isVisible value for this Pmcustomattribute.
     * 
     * @return isVisible
     */
    public java.lang.String getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this Pmcustomattribute.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.String isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isReadonly value for this Pmcustomattribute.
     * 
     * @return isReadonly
     */
    public java.lang.String getIsReadonly() {
        return isReadonly;
    }


    /**
     * Sets the isReadonly value for this Pmcustomattribute.
     * 
     * @param isReadonly
     */
    public void setIsReadonly(java.lang.String isReadonly) {
        this.isReadonly = isReadonly;
    }


    /**
     * Gets the showMainTab value for this Pmcustomattribute.
     * 
     * @return showMainTab
     */
    public java.lang.String getShowMainTab() {
        return showMainTab;
    }


    /**
     * Sets the showMainTab value for this Pmcustomattribute.
     * 
     * @param showMainTab
     */
    public void setShowMainTab(java.lang.String showMainTab) {
        this.showMainTab = showMainTab;
    }


    /**
     * Gets the isRequired value for this Pmcustomattribute.
     * 
     * @return isRequired
     */
    public java.lang.String getIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this Pmcustomattribute.
     * 
     * @param isRequired
     */
    public void setIsRequired(java.lang.String isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the isUnique value for this Pmcustomattribute.
     * 
     * @return isUnique
     */
    public java.lang.String getIsUnique() {
        return isUnique;
    }


    /**
     * Sets the isUnique value for this Pmcustomattribute.
     * 
     * @param isUnique
     */
    public void setIsUnique(java.lang.String isUnique) {
        this.isUnique = isUnique;
    }


    /**
     * Gets the isNotificationVisible value for this Pmcustomattribute.
     * 
     * @return isNotificationVisible
     */
    public java.lang.String getIsNotificationVisible() {
        return isNotificationVisible;
    }


    /**
     * Sets the isNotificationVisible value for this Pmcustomattribute.
     * 
     * @param isNotificationVisible
     */
    public void setIsNotificationVisible(java.lang.String isNotificationVisible) {
        this.isNotificationVisible = isNotificationVisible;
    }


    /**
     * Gets the groups value for this Pmcustomattribute.
     * 
     * @return groups
     */
    public java.lang.String getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this Pmcustomattribute.
     * 
     * @param groups
     */
    public void setGroups(java.lang.String groups) {
        this.groups = groups;
    }


    /**
     * Gets the orderNum value for this Pmcustomattribute.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Pmcustomattribute.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Pmcustomattribute.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Pmcustomattribute.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Pmcustomattribute.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Pmcustomattribute.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the id value for this Pmcustomattribute.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Pmcustomattribute.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Pmcustomattribute.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Pmcustomattribute.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Pmcustomattribute.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Pmcustomattribute.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Pmcustomattribute.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Pmcustomattribute.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pmcustomattribute)) return false;
        Pmcustomattribute other = (Pmcustomattribute) obj;
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
            ((this.referenceName==null && other.getReferenceName()==null) || 
             (this.referenceName!=null &&
              this.referenceName.equals(other.getReferenceName()))) &&
            ((this.entityReferenceName==null && other.getEntityReferenceName()==null) || 
             (this.entityReferenceName!=null &&
              this.entityReferenceName.equals(other.getEntityReferenceName()))) &&
            this.attributeType == other.getAttributeType() &&
            ((this.isMultiple==null && other.getIsMultiple()==null) || 
             (this.isMultiple!=null &&
              this.isMultiple.equals(other.getIsMultiple()))) &&
            ((this.valueRange==null && other.getValueRange()==null) || 
             (this.valueRange!=null &&
              this.valueRange.equals(other.getValueRange()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.isReadonly==null && other.getIsReadonly()==null) || 
             (this.isReadonly!=null &&
              this.isReadonly.equals(other.getIsReadonly()))) &&
            ((this.showMainTab==null && other.getShowMainTab()==null) || 
             (this.showMainTab!=null &&
              this.showMainTab.equals(other.getShowMainTab()))) &&
            ((this.isRequired==null && other.getIsRequired()==null) || 
             (this.isRequired!=null &&
              this.isRequired.equals(other.getIsRequired()))) &&
            ((this.isUnique==null && other.getIsUnique()==null) || 
             (this.isUnique!=null &&
              this.isUnique.equals(other.getIsUnique()))) &&
            ((this.isNotificationVisible==null && other.getIsNotificationVisible()==null) || 
             (this.isNotificationVisible!=null &&
              this.isNotificationVisible.equals(other.getIsNotificationVisible()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              this.groups.equals(other.getGroups()))) &&
            this.orderNum == other.getOrderNum() &&
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
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getReferenceName() != null) {
            _hashCode += getReferenceName().hashCode();
        }
        if (getEntityReferenceName() != null) {
            _hashCode += getEntityReferenceName().hashCode();
        }
        _hashCode += getAttributeType();
        if (getIsMultiple() != null) {
            _hashCode += getIsMultiple().hashCode();
        }
        if (getValueRange() != null) {
            _hashCode += getValueRange().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getIsReadonly() != null) {
            _hashCode += getIsReadonly().hashCode();
        }
        if (getShowMainTab() != null) {
            _hashCode += getShowMainTab().hashCode();
        }
        if (getIsRequired() != null) {
            _hashCode += getIsRequired().hashCode();
        }
        if (getIsUnique() != null) {
            _hashCode += getIsUnique().hashCode();
        }
        if (getIsNotificationVisible() != null) {
            _hashCode += getIsNotificationVisible().hashCode();
        }
        if (getGroups() != null) {
            _hashCode += getGroups().hashCode();
        }
        _hashCode += getOrderNum();
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
        new org.apache.axis.description.TypeDesc(Pmcustomattribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "pmcustomattribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
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
        elemField.setFieldName("entityReferenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityReferenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValueRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultValue"));
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
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadonly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsReadonly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showMainTab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShowMainTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUnique");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsUnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNotificationVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsNotificationVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Groups"));
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
