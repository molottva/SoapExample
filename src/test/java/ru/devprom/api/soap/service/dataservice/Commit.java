/**
 * Commit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Commit  implements java.io.Serializable {
    private int project;

    private java.lang.String version;

    private int versionNum;

    private java.lang.String description;

    private java.lang.String author;

    private java.lang.String commitDate;

    private int repository;

    private java.lang.String commitId;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Commit() {
    }

    public Commit(
           int project,
           java.lang.String version,
           int versionNum,
           java.lang.String description,
           java.lang.String author,
           java.lang.String commitDate,
           int repository,
           java.lang.String commitId,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.project = project;
           this.version = version;
           this.versionNum = versionNum;
           this.description = description;
           this.author = author;
           this.commitDate = commitDate;
           this.repository = repository;
           this.commitId = commitId;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the project value for this Commit.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Commit.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the version value for this Commit.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Commit.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the versionNum value for this Commit.
     * 
     * @return versionNum
     */
    public int getVersionNum() {
        return versionNum;
    }


    /**
     * Sets the versionNum value for this Commit.
     * 
     * @param versionNum
     */
    public void setVersionNum(int versionNum) {
        this.versionNum = versionNum;
    }


    /**
     * Gets the description value for this Commit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Commit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the author value for this Commit.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Commit.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the commitDate value for this Commit.
     * 
     * @return commitDate
     */
    public java.lang.String getCommitDate() {
        return commitDate;
    }


    /**
     * Sets the commitDate value for this Commit.
     * 
     * @param commitDate
     */
    public void setCommitDate(java.lang.String commitDate) {
        this.commitDate = commitDate;
    }


    /**
     * Gets the repository value for this Commit.
     * 
     * @return repository
     */
    public int getRepository() {
        return repository;
    }


    /**
     * Sets the repository value for this Commit.
     * 
     * @param repository
     */
    public void setRepository(int repository) {
        this.repository = repository;
    }


    /**
     * Gets the commitId value for this Commit.
     * 
     * @return commitId
     */
    public java.lang.String getCommitId() {
        return commitId;
    }


    /**
     * Sets the commitId value for this Commit.
     * 
     * @param commitId
     */
    public void setCommitId(java.lang.String commitId) {
        this.commitId = commitId;
    }


    /**
     * Gets the recordCreated value for this Commit.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Commit.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Commit.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Commit.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the id value for this Commit.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Commit.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Commit.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Commit.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Commit.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Commit.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Commit.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Commit.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commit)) return false;
        Commit other = (Commit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.project == other.getProject() &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            this.versionNum == other.getVersionNum() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.commitDate==null && other.getCommitDate()==null) || 
             (this.commitDate!=null &&
              this.commitDate.equals(other.getCommitDate()))) &&
            this.repository == other.getRepository() &&
            ((this.commitId==null && other.getCommitId()==null) || 
             (this.commitId!=null &&
              this.commitId.equals(other.getCommitId()))) &&
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
        _hashCode += getProject();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        _hashCode += getVersionNum();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getCommitDate() != null) {
            _hashCode += getCommitDate().hashCode();
        }
        _hashCode += getRepository();
        if (getCommitId() != null) {
            _hashCode += getCommitId().hashCode();
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
        new org.apache.axis.description.TypeDesc(Commit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "commit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VersionNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Repository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommitId"));
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
