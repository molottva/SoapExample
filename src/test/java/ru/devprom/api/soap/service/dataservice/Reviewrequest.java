/**
 * Reviewrequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Reviewrequest  implements java.io.Serializable {
    private java.lang.String caption;

    private java.lang.String description;

    private java.lang.String state;

    private int commit;

    private int author;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int project;

    private int repository;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Reviewrequest() {
    }

    public Reviewrequest(
           java.lang.String caption,
           java.lang.String description,
           java.lang.String state,
           int commit,
           int author,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int project,
           int repository,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.description = description;
           this.state = state;
           this.commit = commit;
           this.author = author;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.project = project;
           this.repository = repository;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Reviewrequest.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Reviewrequest.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the description value for this Reviewrequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Reviewrequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this Reviewrequest.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Reviewrequest.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the commit value for this Reviewrequest.
     * 
     * @return commit
     */
    public int getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this Reviewrequest.
     * 
     * @param commit
     */
    public void setCommit(int commit) {
        this.commit = commit;
    }


    /**
     * Gets the author value for this Reviewrequest.
     * 
     * @return author
     */
    public int getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Reviewrequest.
     * 
     * @param author
     */
    public void setAuthor(int author) {
        this.author = author;
    }


    /**
     * Gets the recordCreated value for this Reviewrequest.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Reviewrequest.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Reviewrequest.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Reviewrequest.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the project value for this Reviewrequest.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Reviewrequest.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the repository value for this Reviewrequest.
     * 
     * @return repository
     */
    public int getRepository() {
        return repository;
    }


    /**
     * Sets the repository value for this Reviewrequest.
     * 
     * @param repository
     */
    public void setRepository(int repository) {
        this.repository = repository;
    }


    /**
     * Gets the id value for this Reviewrequest.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Reviewrequest.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Reviewrequest.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Reviewrequest.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Reviewrequest.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Reviewrequest.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Reviewrequest.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Reviewrequest.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reviewrequest)) return false;
        Reviewrequest other = (Reviewrequest) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.commit == other.getCommit() &&
            this.author == other.getAuthor() &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.project == other.getProject() &&
            this.repository == other.getRepository() &&
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getCommit();
        _hashCode += getAuthor();
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getProject();
        _hashCode += getRepository();
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
        new org.apache.axis.description.TypeDesc(Reviewrequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "reviewrequest"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
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
        elemField.setFieldName("repository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Repository"));
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
