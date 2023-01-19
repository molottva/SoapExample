/**
 * Release.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Release  implements java.io.Serializable {
    private java.lang.String caption;

    private java.util.Date startDate;

    private java.util.Date finishDate;

    private int project;

    private java.lang.String isClosed;

    private java.lang.String description;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private java.util.Calendar estimatedStartDate;

    private java.util.Calendar estimatedFinishDate;

    private float plannedDurationInWorkingDays;

    private float leftDurationInWorkingDays;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Release() {
    }

    public Release(
           java.lang.String caption,
           java.util.Date startDate,
           java.util.Date finishDate,
           int project,
           java.lang.String isClosed,
           java.lang.String description,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           java.util.Calendar estimatedStartDate,
           java.util.Calendar estimatedFinishDate,
           float plannedDurationInWorkingDays,
           float leftDurationInWorkingDays,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.startDate = startDate;
           this.finishDate = finishDate;
           this.project = project;
           this.isClosed = isClosed;
           this.description = description;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.estimatedStartDate = estimatedStartDate;
           this.estimatedFinishDate = estimatedFinishDate;
           this.plannedDurationInWorkingDays = plannedDurationInWorkingDays;
           this.leftDurationInWorkingDays = leftDurationInWorkingDays;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Release.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Release.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the startDate value for this Release.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Release.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the finishDate value for this Release.
     * 
     * @return finishDate
     */
    public java.util.Date getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this Release.
     * 
     * @param finishDate
     */
    public void setFinishDate(java.util.Date finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the project value for this Release.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Release.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the isClosed value for this Release.
     * 
     * @return isClosed
     */
    public java.lang.String getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Release.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.String isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the description value for this Release.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Release.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the orderNum value for this Release.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Release.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Release.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Release.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Release.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Release.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the estimatedStartDate value for this Release.
     * 
     * @return estimatedStartDate
     */
    public java.util.Calendar getEstimatedStartDate() {
        return estimatedStartDate;
    }


    /**
     * Sets the estimatedStartDate value for this Release.
     * 
     * @param estimatedStartDate
     */
    public void setEstimatedStartDate(java.util.Calendar estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }


    /**
     * Gets the estimatedFinishDate value for this Release.
     * 
     * @return estimatedFinishDate
     */
    public java.util.Calendar getEstimatedFinishDate() {
        return estimatedFinishDate;
    }


    /**
     * Sets the estimatedFinishDate value for this Release.
     * 
     * @param estimatedFinishDate
     */
    public void setEstimatedFinishDate(java.util.Calendar estimatedFinishDate) {
        this.estimatedFinishDate = estimatedFinishDate;
    }


    /**
     * Gets the plannedDurationInWorkingDays value for this Release.
     * 
     * @return plannedDurationInWorkingDays
     */
    public float getPlannedDurationInWorkingDays() {
        return plannedDurationInWorkingDays;
    }


    /**
     * Sets the plannedDurationInWorkingDays value for this Release.
     * 
     * @param plannedDurationInWorkingDays
     */
    public void setPlannedDurationInWorkingDays(float plannedDurationInWorkingDays) {
        this.plannedDurationInWorkingDays = plannedDurationInWorkingDays;
    }


    /**
     * Gets the leftDurationInWorkingDays value for this Release.
     * 
     * @return leftDurationInWorkingDays
     */
    public float getLeftDurationInWorkingDays() {
        return leftDurationInWorkingDays;
    }


    /**
     * Sets the leftDurationInWorkingDays value for this Release.
     * 
     * @param leftDurationInWorkingDays
     */
    public void setLeftDurationInWorkingDays(float leftDurationInWorkingDays) {
        this.leftDurationInWorkingDays = leftDurationInWorkingDays;
    }


    /**
     * Gets the id value for this Release.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Release.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Release.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Release.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Release.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Release.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Release.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Release.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Release)) return false;
        Release other = (Release) obj;
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            this.project == other.getProject() &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.orderNum == other.getOrderNum() &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            ((this.estimatedStartDate==null && other.getEstimatedStartDate()==null) || 
             (this.estimatedStartDate!=null &&
              this.estimatedStartDate.equals(other.getEstimatedStartDate()))) &&
            ((this.estimatedFinishDate==null && other.getEstimatedFinishDate()==null) || 
             (this.estimatedFinishDate!=null &&
              this.estimatedFinishDate.equals(other.getEstimatedFinishDate()))) &&
            this.plannedDurationInWorkingDays == other.getPlannedDurationInWorkingDays() &&
            this.leftDurationInWorkingDays == other.getLeftDurationInWorkingDays() &&
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        _hashCode += getProject();
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getOrderNum();
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        if (getEstimatedStartDate() != null) {
            _hashCode += getEstimatedStartDate().hashCode();
        }
        if (getEstimatedFinishDate() != null) {
            _hashCode += getEstimatedFinishDate().hashCode();
        }
        _hashCode += new Float(getPlannedDurationInWorkingDays()).hashCode();
        _hashCode += new Float(getLeftDurationInWorkingDays()).hashCode();
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
        new org.apache.axis.description.TypeDesc(Release.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "release"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
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
        elemField.setFieldName("estimatedStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstimatedStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedFinishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstimatedFinishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDurationInWorkingDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlannedDurationInWorkingDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftDurationInWorkingDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LeftDurationInWorkingDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
