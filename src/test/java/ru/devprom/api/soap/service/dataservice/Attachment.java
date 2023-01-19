/**
 * Attachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Attachment  implements java.io.Serializable {
    private byte[] file;

    private int objectId;

    private java.lang.String objectClass;

    private int fileSize;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int project;

    private java.lang.String fileExt;

    private java.lang.String filePath;

    private java.lang.String fileMime;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Attachment() {
    }

    public Attachment(
           byte[] file,
           int objectId,
           java.lang.String objectClass,
           int fileSize,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int project,
           java.lang.String fileExt,
           java.lang.String filePath,
           java.lang.String fileMime,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.file = file;
           this.objectId = objectId;
           this.objectClass = objectClass;
           this.fileSize = fileSize;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.project = project;
           this.fileExt = fileExt;
           this.filePath = filePath;
           this.fileMime = fileMime;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the file value for this Attachment.
     * 
     * @return file
     */
    public byte[] getFile() {
        return file;
    }


    /**
     * Sets the file value for this Attachment.
     * 
     * @param file
     */
    public void setFile(byte[] file) {
        this.file = file;
    }


    /**
     * Gets the objectId value for this Attachment.
     * 
     * @return objectId
     */
    public int getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this Attachment.
     * 
     * @param objectId
     */
    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectClass value for this Attachment.
     * 
     * @return objectClass
     */
    public java.lang.String getObjectClass() {
        return objectClass;
    }


    /**
     * Sets the objectClass value for this Attachment.
     * 
     * @param objectClass
     */
    public void setObjectClass(java.lang.String objectClass) {
        this.objectClass = objectClass;
    }


    /**
     * Gets the fileSize value for this Attachment.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this Attachment.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the recordCreated value for this Attachment.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Attachment.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Attachment.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Attachment.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the project value for this Attachment.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Attachment.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the fileExt value for this Attachment.
     * 
     * @return fileExt
     */
    public java.lang.String getFileExt() {
        return fileExt;
    }


    /**
     * Sets the fileExt value for this Attachment.
     * 
     * @param fileExt
     */
    public void setFileExt(java.lang.String fileExt) {
        this.fileExt = fileExt;
    }


    /**
     * Gets the filePath value for this Attachment.
     * 
     * @return filePath
     */
    public java.lang.String getFilePath() {
        return filePath;
    }


    /**
     * Sets the filePath value for this Attachment.
     * 
     * @param filePath
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }


    /**
     * Gets the fileMime value for this Attachment.
     * 
     * @return fileMime
     */
    public java.lang.String getFileMime() {
        return fileMime;
    }


    /**
     * Sets the fileMime value for this Attachment.
     * 
     * @param fileMime
     */
    public void setFileMime(java.lang.String fileMime) {
        this.fileMime = fileMime;
    }


    /**
     * Gets the id value for this Attachment.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Attachment.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Attachment.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Attachment.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Attachment.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Attachment.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Attachment.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Attachment.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attachment)) return false;
        Attachment other = (Attachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              java.util.Arrays.equals(this.file, other.getFile()))) &&
            this.objectId == other.getObjectId() &&
            ((this.objectClass==null && other.getObjectClass()==null) || 
             (this.objectClass!=null &&
              this.objectClass.equals(other.getObjectClass()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.project == other.getProject() &&
            ((this.fileExt==null && other.getFileExt()==null) || 
             (this.fileExt!=null &&
              this.fileExt.equals(other.getFileExt()))) &&
            ((this.filePath==null && other.getFilePath()==null) || 
             (this.filePath!=null &&
              this.filePath.equals(other.getFilePath()))) &&
            ((this.fileMime==null && other.getFileMime()==null) || 
             (this.fileMime!=null &&
              this.fileMime.equals(other.getFileMime()))) &&
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
        if (getFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getObjectId();
        if (getObjectClass() != null) {
            _hashCode += getObjectClass().hashCode();
        }
        _hashCode += getFileSize();
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getProject();
        if (getFileExt() != null) {
            _hashCode += getFileExt().hashCode();
        }
        if (getFilePath() != null) {
            _hashCode += getFilePath().hashCode();
        }
        if (getFileMime() != null) {
            _hashCode += getFileMime().hashCode();
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
        new org.apache.axis.description.TypeDesc(Attachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "attachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "File"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileSize"));
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
        elemField.setFieldName("fileExt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileMime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileMime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
