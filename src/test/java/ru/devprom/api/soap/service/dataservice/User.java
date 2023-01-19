/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class User  implements java.io.Serializable {
    private byte[] photo;

    private java.lang.String caption;

    private java.lang.String email;

    private java.lang.String login;

    private int language;

    private java.lang.String phone;

    private java.lang.String password;

    private java.lang.String askChangePassword;

    private java.lang.String isAdmin;

    private int isReadonly;

    private int groupId;

    private java.lang.String notificationTrackingType;

    private java.lang.String notificationEmailType;

    private int projects;

    private java.lang.String description;

    private java.lang.String LDAPUID;

    private java.lang.String sendDeadlinesReport;

    private float rate;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public User() {
    }

    public User(
           byte[] photo,
           java.lang.String caption,
           java.lang.String email,
           java.lang.String login,
           int language,
           java.lang.String phone,
           java.lang.String password,
           java.lang.String askChangePassword,
           java.lang.String isAdmin,
           int isReadonly,
           int groupId,
           java.lang.String notificationTrackingType,
           java.lang.String notificationEmailType,
           int projects,
           java.lang.String description,
           java.lang.String LDAPUID,
           java.lang.String sendDeadlinesReport,
           float rate,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.photo = photo;
           this.caption = caption;
           this.email = email;
           this.login = login;
           this.language = language;
           this.phone = phone;
           this.password = password;
           this.askChangePassword = askChangePassword;
           this.isAdmin = isAdmin;
           this.isReadonly = isReadonly;
           this.groupId = groupId;
           this.notificationTrackingType = notificationTrackingType;
           this.notificationEmailType = notificationEmailType;
           this.projects = projects;
           this.description = description;
           this.LDAPUID = LDAPUID;
           this.sendDeadlinesReport = sendDeadlinesReport;
           this.rate = rate;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the photo value for this User.
     * 
     * @return photo
     */
    public byte[] getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this User.
     * 
     * @param photo
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }


    /**
     * Gets the caption value for this User.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this User.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the login value for this User.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this User.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the language value for this User.
     * 
     * @return language
     */
    public int getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this User.
     * 
     * @param language
     */
    public void setLanguage(int language) {
        this.language = language;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the askChangePassword value for this User.
     * 
     * @return askChangePassword
     */
    public java.lang.String getAskChangePassword() {
        return askChangePassword;
    }


    /**
     * Sets the askChangePassword value for this User.
     * 
     * @param askChangePassword
     */
    public void setAskChangePassword(java.lang.String askChangePassword) {
        this.askChangePassword = askChangePassword;
    }


    /**
     * Gets the isAdmin value for this User.
     * 
     * @return isAdmin
     */
    public java.lang.String getIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this User.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(java.lang.String isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the isReadonly value for this User.
     * 
     * @return isReadonly
     */
    public int getIsReadonly() {
        return isReadonly;
    }


    /**
     * Sets the isReadonly value for this User.
     * 
     * @param isReadonly
     */
    public void setIsReadonly(int isReadonly) {
        this.isReadonly = isReadonly;
    }


    /**
     * Gets the groupId value for this User.
     * 
     * @return groupId
     */
    public int getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this User.
     * 
     * @param groupId
     */
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the notificationTrackingType value for this User.
     * 
     * @return notificationTrackingType
     */
    public java.lang.String getNotificationTrackingType() {
        return notificationTrackingType;
    }


    /**
     * Sets the notificationTrackingType value for this User.
     * 
     * @param notificationTrackingType
     */
    public void setNotificationTrackingType(java.lang.String notificationTrackingType) {
        this.notificationTrackingType = notificationTrackingType;
    }


    /**
     * Gets the notificationEmailType value for this User.
     * 
     * @return notificationEmailType
     */
    public java.lang.String getNotificationEmailType() {
        return notificationEmailType;
    }


    /**
     * Sets the notificationEmailType value for this User.
     * 
     * @param notificationEmailType
     */
    public void setNotificationEmailType(java.lang.String notificationEmailType) {
        this.notificationEmailType = notificationEmailType;
    }


    /**
     * Gets the projects value for this User.
     * 
     * @return projects
     */
    public int getProjects() {
        return projects;
    }


    /**
     * Sets the projects value for this User.
     * 
     * @param projects
     */
    public void setProjects(int projects) {
        this.projects = projects;
    }


    /**
     * Gets the description value for this User.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this User.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the LDAPUID value for this User.
     * 
     * @return LDAPUID
     */
    public java.lang.String getLDAPUID() {
        return LDAPUID;
    }


    /**
     * Sets the LDAPUID value for this User.
     * 
     * @param LDAPUID
     */
    public void setLDAPUID(java.lang.String LDAPUID) {
        this.LDAPUID = LDAPUID;
    }


    /**
     * Gets the sendDeadlinesReport value for this User.
     * 
     * @return sendDeadlinesReport
     */
    public java.lang.String getSendDeadlinesReport() {
        return sendDeadlinesReport;
    }


    /**
     * Sets the sendDeadlinesReport value for this User.
     * 
     * @param sendDeadlinesReport
     */
    public void setSendDeadlinesReport(java.lang.String sendDeadlinesReport) {
        this.sendDeadlinesReport = sendDeadlinesReport;
    }


    /**
     * Gets the rate value for this User.
     * 
     * @return rate
     */
    public float getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this User.
     * 
     * @param rate
     */
    public void setRate(float rate) {
        this.rate = rate;
    }


    /**
     * Gets the orderNum value for this User.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this User.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this User.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this User.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this User.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this User.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this User.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this User.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this User.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this User.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this User.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this User.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              java.util.Arrays.equals(this.photo, other.getPhoto()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            this.language == other.getLanguage() &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.askChangePassword==null && other.getAskChangePassword()==null) || 
             (this.askChangePassword!=null &&
              this.askChangePassword.equals(other.getAskChangePassword()))) &&
            ((this.isAdmin==null && other.getIsAdmin()==null) || 
             (this.isAdmin!=null &&
              this.isAdmin.equals(other.getIsAdmin()))) &&
            this.isReadonly == other.getIsReadonly() &&
            this.groupId == other.getGroupId() &&
            ((this.notificationTrackingType==null && other.getNotificationTrackingType()==null) || 
             (this.notificationTrackingType!=null &&
              this.notificationTrackingType.equals(other.getNotificationTrackingType()))) &&
            ((this.notificationEmailType==null && other.getNotificationEmailType()==null) || 
             (this.notificationEmailType!=null &&
              this.notificationEmailType.equals(other.getNotificationEmailType()))) &&
            this.projects == other.getProjects() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.LDAPUID==null && other.getLDAPUID()==null) || 
             (this.LDAPUID!=null &&
              this.LDAPUID.equals(other.getLDAPUID()))) &&
            ((this.sendDeadlinesReport==null && other.getSendDeadlinesReport()==null) || 
             (this.sendDeadlinesReport!=null &&
              this.sendDeadlinesReport.equals(other.getSendDeadlinesReport()))) &&
            this.rate == other.getRate() &&
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
        if (getPhoto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        _hashCode += getLanguage();
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getAskChangePassword() != null) {
            _hashCode += getAskChangePassword().hashCode();
        }
        if (getIsAdmin() != null) {
            _hashCode += getIsAdmin().hashCode();
        }
        _hashCode += getIsReadonly();
        _hashCode += getGroupId();
        if (getNotificationTrackingType() != null) {
            _hashCode += getNotificationTrackingType().hashCode();
        }
        if (getNotificationEmailType() != null) {
            _hashCode += getNotificationEmailType().hashCode();
        }
        _hashCode += getProjects();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLDAPUID() != null) {
            _hashCode += getLDAPUID().hashCode();
        }
        if (getSendDeadlinesReport() != null) {
            _hashCode += getSendDeadlinesReport().hashCode();
        }
        _hashCode += new Float(getRate()).hashCode();
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("askChangePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AskChangePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadonly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsReadonly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationTrackingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotificationTrackingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmailType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotificationEmailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Projects"));
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
        elemField.setFieldName("LDAPUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LDAPUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDeadlinesReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendDeadlinesReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
