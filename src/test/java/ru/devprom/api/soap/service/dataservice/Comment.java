/**
 * Comment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Comment  implements java.io.Serializable {
    private java.lang.String caption;

    private int authorId;

    private int objectId;

    private java.lang.String objectClass;

    private int prevComment;

    private java.lang.String externalAuthor;

    private java.lang.String externalEmail;

    private java.lang.String isPrivate;

    private int annotationLength;

    private java.lang.String annotationText;

    private java.lang.String closed;

    private int annotationStart;

    private java.lang.String annotationPath;

    private java.lang.String emailMessageId;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int project;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Comment() {
    }

    public Comment(
           java.lang.String caption,
           int authorId,
           int objectId,
           java.lang.String objectClass,
           int prevComment,
           java.lang.String externalAuthor,
           java.lang.String externalEmail,
           java.lang.String isPrivate,
           int annotationLength,
           java.lang.String annotationText,
           java.lang.String closed,
           int annotationStart,
           java.lang.String annotationPath,
           java.lang.String emailMessageId,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int project,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.authorId = authorId;
           this.objectId = objectId;
           this.objectClass = objectClass;
           this.prevComment = prevComment;
           this.externalAuthor = externalAuthor;
           this.externalEmail = externalEmail;
           this.isPrivate = isPrivate;
           this.annotationLength = annotationLength;
           this.annotationText = annotationText;
           this.closed = closed;
           this.annotationStart = annotationStart;
           this.annotationPath = annotationPath;
           this.emailMessageId = emailMessageId;
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
     * Gets the caption value for this Comment.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Comment.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the authorId value for this Comment.
     * 
     * @return authorId
     */
    public int getAuthorId() {
        return authorId;
    }


    /**
     * Sets the authorId value for this Comment.
     * 
     * @param authorId
     */
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }


    /**
     * Gets the objectId value for this Comment.
     * 
     * @return objectId
     */
    public int getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this Comment.
     * 
     * @param objectId
     */
    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectClass value for this Comment.
     * 
     * @return objectClass
     */
    public java.lang.String getObjectClass() {
        return objectClass;
    }


    /**
     * Sets the objectClass value for this Comment.
     * 
     * @param objectClass
     */
    public void setObjectClass(java.lang.String objectClass) {
        this.objectClass = objectClass;
    }


    /**
     * Gets the prevComment value for this Comment.
     * 
     * @return prevComment
     */
    public int getPrevComment() {
        return prevComment;
    }


    /**
     * Sets the prevComment value for this Comment.
     * 
     * @param prevComment
     */
    public void setPrevComment(int prevComment) {
        this.prevComment = prevComment;
    }


    /**
     * Gets the externalAuthor value for this Comment.
     * 
     * @return externalAuthor
     */
    public java.lang.String getExternalAuthor() {
        return externalAuthor;
    }


    /**
     * Sets the externalAuthor value for this Comment.
     * 
     * @param externalAuthor
     */
    public void setExternalAuthor(java.lang.String externalAuthor) {
        this.externalAuthor = externalAuthor;
    }


    /**
     * Gets the externalEmail value for this Comment.
     * 
     * @return externalEmail
     */
    public java.lang.String getExternalEmail() {
        return externalEmail;
    }


    /**
     * Sets the externalEmail value for this Comment.
     * 
     * @param externalEmail
     */
    public void setExternalEmail(java.lang.String externalEmail) {
        this.externalEmail = externalEmail;
    }


    /**
     * Gets the isPrivate value for this Comment.
     * 
     * @return isPrivate
     */
    public java.lang.String getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this Comment.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.String isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the annotationLength value for this Comment.
     * 
     * @return annotationLength
     */
    public int getAnnotationLength() {
        return annotationLength;
    }


    /**
     * Sets the annotationLength value for this Comment.
     * 
     * @param annotationLength
     */
    public void setAnnotationLength(int annotationLength) {
        this.annotationLength = annotationLength;
    }


    /**
     * Gets the annotationText value for this Comment.
     * 
     * @return annotationText
     */
    public java.lang.String getAnnotationText() {
        return annotationText;
    }


    /**
     * Sets the annotationText value for this Comment.
     * 
     * @param annotationText
     */
    public void setAnnotationText(java.lang.String annotationText) {
        this.annotationText = annotationText;
    }


    /**
     * Gets the closed value for this Comment.
     * 
     * @return closed
     */
    public java.lang.String getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this Comment.
     * 
     * @param closed
     */
    public void setClosed(java.lang.String closed) {
        this.closed = closed;
    }


    /**
     * Gets the annotationStart value for this Comment.
     * 
     * @return annotationStart
     */
    public int getAnnotationStart() {
        return annotationStart;
    }


    /**
     * Sets the annotationStart value for this Comment.
     * 
     * @param annotationStart
     */
    public void setAnnotationStart(int annotationStart) {
        this.annotationStart = annotationStart;
    }


    /**
     * Gets the annotationPath value for this Comment.
     * 
     * @return annotationPath
     */
    public java.lang.String getAnnotationPath() {
        return annotationPath;
    }


    /**
     * Sets the annotationPath value for this Comment.
     * 
     * @param annotationPath
     */
    public void setAnnotationPath(java.lang.String annotationPath) {
        this.annotationPath = annotationPath;
    }


    /**
     * Gets the emailMessageId value for this Comment.
     * 
     * @return emailMessageId
     */
    public java.lang.String getEmailMessageId() {
        return emailMessageId;
    }


    /**
     * Sets the emailMessageId value for this Comment.
     * 
     * @param emailMessageId
     */
    public void setEmailMessageId(java.lang.String emailMessageId) {
        this.emailMessageId = emailMessageId;
    }


    /**
     * Gets the orderNum value for this Comment.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Comment.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Comment.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Comment.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Comment.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Comment.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the project value for this Comment.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Comment.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the id value for this Comment.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Comment.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Comment.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Comment.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Comment.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Comment.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Comment.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Comment.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comment)) return false;
        Comment other = (Comment) obj;
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
            this.authorId == other.getAuthorId() &&
            this.objectId == other.getObjectId() &&
            ((this.objectClass==null && other.getObjectClass()==null) || 
             (this.objectClass!=null &&
              this.objectClass.equals(other.getObjectClass()))) &&
            this.prevComment == other.getPrevComment() &&
            ((this.externalAuthor==null && other.getExternalAuthor()==null) || 
             (this.externalAuthor!=null &&
              this.externalAuthor.equals(other.getExternalAuthor()))) &&
            ((this.externalEmail==null && other.getExternalEmail()==null) || 
             (this.externalEmail!=null &&
              this.externalEmail.equals(other.getExternalEmail()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            this.annotationLength == other.getAnnotationLength() &&
            ((this.annotationText==null && other.getAnnotationText()==null) || 
             (this.annotationText!=null &&
              this.annotationText.equals(other.getAnnotationText()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            this.annotationStart == other.getAnnotationStart() &&
            ((this.annotationPath==null && other.getAnnotationPath()==null) || 
             (this.annotationPath!=null &&
              this.annotationPath.equals(other.getAnnotationPath()))) &&
            ((this.emailMessageId==null && other.getEmailMessageId()==null) || 
             (this.emailMessageId!=null &&
              this.emailMessageId.equals(other.getEmailMessageId()))) &&
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
        _hashCode += getAuthorId();
        _hashCode += getObjectId();
        if (getObjectClass() != null) {
            _hashCode += getObjectClass().hashCode();
        }
        _hashCode += getPrevComment();
        if (getExternalAuthor() != null) {
            _hashCode += getExternalAuthor().hashCode();
        }
        if (getExternalEmail() != null) {
            _hashCode += getExternalEmail().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        _hashCode += getAnnotationLength();
        if (getAnnotationText() != null) {
            _hashCode += getAnnotationText().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        _hashCode += getAnnotationStart();
        if (getAnnotationPath() != null) {
            _hashCode += getAnnotationPath().hashCode();
        }
        if (getEmailMessageId() != null) {
            _hashCode += getEmailMessageId().hashCode();
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
        new org.apache.axis.description.TypeDesc(Comment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "comment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthorId"));
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
        elemField.setFieldName("objectClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrevComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnotationLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnotationText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnotationStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotationPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnotationPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailMessageId"));
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
