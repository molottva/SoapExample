/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Customer  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String name;

    private java.lang.String email;

    private int company;

    private java.lang.String description;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int enabled;

    private int issues;

    private float fact;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Customer() {
    }

    public Customer(
           java.lang.String username,
           java.lang.String name,
           java.lang.String email,
           int company,
           java.lang.String description,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int enabled,
           int issues,
           float fact,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.username = username;
           this.name = name;
           this.email = email;
           this.company = company;
           this.description = description;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.enabled = enabled;
           this.issues = issues;
           this.fact = fact;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the username value for this Customer.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Customer.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the name value for this Customer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Customer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the email value for this Customer.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Customer.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the company value for this Customer.
     * 
     * @return company
     */
    public int getCompany() {
        return company;
    }


    /**
     * Sets the company value for this Customer.
     * 
     * @param company
     */
    public void setCompany(int company) {
        this.company = company;
    }


    /**
     * Gets the description value for this Customer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Customer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the recordCreated value for this Customer.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Customer.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Customer.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Customer.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the enabled value for this Customer.
     * 
     * @return enabled
     */
    public int getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this Customer.
     * 
     * @param enabled
     */
    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the issues value for this Customer.
     * 
     * @return issues
     */
    public int getIssues() {
        return issues;
    }


    /**
     * Sets the issues value for this Customer.
     * 
     * @param issues
     */
    public void setIssues(int issues) {
        this.issues = issues;
    }


    /**
     * Gets the fact value for this Customer.
     * 
     * @return fact
     */
    public float getFact() {
        return fact;
    }


    /**
     * Sets the fact value for this Customer.
     * 
     * @param fact
     */
    public void setFact(float fact) {
        this.fact = fact;
    }


    /**
     * Gets the id value for this Customer.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Customer.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Customer.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Customer.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Customer.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Customer.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Customer.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Customer.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.company == other.getCompany() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.enabled == other.getEnabled() &&
            this.issues == other.getIssues() &&
            this.fact == other.getFact() &&
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getCompany();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getEnabled();
        _hashCode += getIssues();
        _hashCode += new Float(getFact()).hashCode();
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
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Company"));
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
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fact"));
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
