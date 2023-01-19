/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Project  implements java.io.Serializable {
    private java.lang.String caption;

    private java.lang.String codeName;

    private java.lang.String description;

    private int importance;

    private int language;

    private java.util.Date startDate;

    private java.util.Date finishDate;

    private java.lang.String isClosed;

    private java.lang.String wikiEditorClass;

    private int daysInWeek;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private java.util.Date estimatedStartDate;

    private java.util.Date estimatedFinishDate;

    private int groupId;

    private int project;

    private int linkedProject;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Project() {
    }

    public Project(
           java.lang.String caption,
           java.lang.String codeName,
           java.lang.String description,
           int importance,
           int language,
           java.util.Date startDate,
           java.util.Date finishDate,
           java.lang.String isClosed,
           java.lang.String wikiEditorClass,
           int daysInWeek,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           java.util.Date estimatedStartDate,
           java.util.Date estimatedFinishDate,
           int groupId,
           int project,
           int linkedProject,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.codeName = codeName;
           this.description = description;
           this.importance = importance;
           this.language = language;
           this.startDate = startDate;
           this.finishDate = finishDate;
           this.isClosed = isClosed;
           this.wikiEditorClass = wikiEditorClass;
           this.daysInWeek = daysInWeek;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.estimatedStartDate = estimatedStartDate;
           this.estimatedFinishDate = estimatedFinishDate;
           this.groupId = groupId;
           this.project = project;
           this.linkedProject = linkedProject;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Project.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Project.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the codeName value for this Project.
     * 
     * @return codeName
     */
    public java.lang.String getCodeName() {
        return codeName;
    }


    /**
     * Sets the codeName value for this Project.
     * 
     * @param codeName
     */
    public void setCodeName(java.lang.String codeName) {
        this.codeName = codeName;
    }


    /**
     * Gets the description value for this Project.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Project.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the importance value for this Project.
     * 
     * @return importance
     */
    public int getImportance() {
        return importance;
    }


    /**
     * Sets the importance value for this Project.
     * 
     * @param importance
     */
    public void setImportance(int importance) {
        this.importance = importance;
    }


    /**
     * Gets the language value for this Project.
     * 
     * @return language
     */
    public int getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Project.
     * 
     * @param language
     */
    public void setLanguage(int language) {
        this.language = language;
    }


    /**
     * Gets the startDate value for this Project.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Project.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the finishDate value for this Project.
     * 
     * @return finishDate
     */
    public java.util.Date getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this Project.
     * 
     * @param finishDate
     */
    public void setFinishDate(java.util.Date finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the isClosed value for this Project.
     * 
     * @return isClosed
     */
    public java.lang.String getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Project.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.String isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the wikiEditorClass value for this Project.
     * 
     * @return wikiEditorClass
     */
    public java.lang.String getWikiEditorClass() {
        return wikiEditorClass;
    }


    /**
     * Sets the wikiEditorClass value for this Project.
     * 
     * @param wikiEditorClass
     */
    public void setWikiEditorClass(java.lang.String wikiEditorClass) {
        this.wikiEditorClass = wikiEditorClass;
    }


    /**
     * Gets the daysInWeek value for this Project.
     * 
     * @return daysInWeek
     */
    public int getDaysInWeek() {
        return daysInWeek;
    }


    /**
     * Sets the daysInWeek value for this Project.
     * 
     * @param daysInWeek
     */
    public void setDaysInWeek(int daysInWeek) {
        this.daysInWeek = daysInWeek;
    }


    /**
     * Gets the orderNum value for this Project.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Project.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Project.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Project.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Project.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Project.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the estimatedStartDate value for this Project.
     * 
     * @return estimatedStartDate
     */
    public java.util.Date getEstimatedStartDate() {
        return estimatedStartDate;
    }


    /**
     * Sets the estimatedStartDate value for this Project.
     * 
     * @param estimatedStartDate
     */
    public void setEstimatedStartDate(java.util.Date estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }


    /**
     * Gets the estimatedFinishDate value for this Project.
     * 
     * @return estimatedFinishDate
     */
    public java.util.Date getEstimatedFinishDate() {
        return estimatedFinishDate;
    }


    /**
     * Sets the estimatedFinishDate value for this Project.
     * 
     * @param estimatedFinishDate
     */
    public void setEstimatedFinishDate(java.util.Date estimatedFinishDate) {
        this.estimatedFinishDate = estimatedFinishDate;
    }


    /**
     * Gets the groupId value for this Project.
     * 
     * @return groupId
     */
    public int getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this Project.
     * 
     * @param groupId
     */
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the project value for this Project.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Project.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the linkedProject value for this Project.
     * 
     * @return linkedProject
     */
    public int getLinkedProject() {
        return linkedProject;
    }


    /**
     * Sets the linkedProject value for this Project.
     * 
     * @param linkedProject
     */
    public void setLinkedProject(int linkedProject) {
        this.linkedProject = linkedProject;
    }


    /**
     * Gets the id value for this Project.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Project.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Project.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Project.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Project.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Project.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Project.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Project.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
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
            ((this.codeName==null && other.getCodeName()==null) || 
             (this.codeName!=null &&
              this.codeName.equals(other.getCodeName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.importance == other.getImportance() &&
            this.language == other.getLanguage() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.wikiEditorClass==null && other.getWikiEditorClass()==null) || 
             (this.wikiEditorClass!=null &&
              this.wikiEditorClass.equals(other.getWikiEditorClass()))) &&
            this.daysInWeek == other.getDaysInWeek() &&
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
            this.groupId == other.getGroupId() &&
            this.project == other.getProject() &&
            this.linkedProject == other.getLinkedProject() &&
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
        if (getCodeName() != null) {
            _hashCode += getCodeName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getImportance();
        _hashCode += getLanguage();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getWikiEditorClass() != null) {
            _hashCode += getWikiEditorClass().hashCode();
        }
        _hashCode += getDaysInWeek();
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
        _hashCode += getGroupId();
        _hashCode += getProject();
        _hashCode += getLinkedProject();
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
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodeName"));
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
        elemField.setFieldName("importance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Importance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wikiEditorClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WikiEditorClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysInWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DaysInWeek"));
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
        elemField.setFieldName("estimatedStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstimatedStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedFinishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EstimatedFinishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedProject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkedProject"));
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
