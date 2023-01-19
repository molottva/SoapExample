/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Request  implements java.io.Serializable {
    private java.lang.String description;

    private int priority;

    private java.lang.String caption;

    private int type;

    private java.lang.String state;

    private float estimation;

    private float fact;

    private int function;

    private int tags;

    private int owner;

    private int project;

    private int plannedRelease;

    private int iteration;

    private int lifecycleDuration;

    private int deadlines;

    private java.util.Date startDate;

    private java.util.Calendar finishDate;

    private java.util.Date deliveryDate;

    private int tasks;

    private int openTasks;

    private int environment;

    private int submittedVersion;

    private int closedInVersion;

    private float factToday;

    private int author;

    private java.util.Calendar estimatedStartDate;

    private java.util.Calendar estimatedFinishDate;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int attachment;

    private int question;

    private int dueWeeks;

    private int watchers;

    private int links;

    private java.lang.String recentComment;

    private java.lang.String externalId;

    private int components;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Request() {
    }

    public Request(
           java.lang.String description,
           int priority,
           java.lang.String caption,
           int type,
           java.lang.String state,
           float estimation,
           float fact,
           int function,
           int tags,
           int owner,
           int project,
           int plannedRelease,
           int iteration,
           int lifecycleDuration,
           int deadlines,
           java.util.Date startDate,
           java.util.Calendar finishDate,
           java.util.Date deliveryDate,
           int tasks,
           int openTasks,
           int environment,
           int submittedVersion,
           int closedInVersion,
           float factToday,
           int author,
           java.util.Calendar estimatedStartDate,
           java.util.Calendar estimatedFinishDate,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int attachment,
           int question,
           int dueWeeks,
           int watchers,
           int links,
           java.lang.String recentComment,
           java.lang.String externalId,
           int components,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.description = description;
           this.priority = priority;
           this.caption = caption;
           this.type = type;
           this.state = state;
           this.estimation = estimation;
           this.fact = fact;
           this.function = function;
           this.tags = tags;
           this.owner = owner;
           this.project = project;
           this.plannedRelease = plannedRelease;
           this.iteration = iteration;
           this.lifecycleDuration = lifecycleDuration;
           this.deadlines = deadlines;
           this.startDate = startDate;
           this.finishDate = finishDate;
           this.deliveryDate = deliveryDate;
           this.tasks = tasks;
           this.openTasks = openTasks;
           this.environment = environment;
           this.submittedVersion = submittedVersion;
           this.closedInVersion = closedInVersion;
           this.factToday = factToday;
           this.author = author;
           this.estimatedStartDate = estimatedStartDate;
           this.estimatedFinishDate = estimatedFinishDate;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.attachment = attachment;
           this.question = question;
           this.dueWeeks = dueWeeks;
           this.watchers = watchers;
           this.links = links;
           this.recentComment = recentComment;
           this.externalId = externalId;
           this.components = components;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the description value for this Request.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Request.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the priority value for this Request.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Request.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the caption value for this Request.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Request.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the type value for this Request.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this Request.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Request.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Request.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the estimation value for this Request.
     * 
     * @return estimation
     */
    public float getEstimation() {
        return estimation;
    }


    /**
     * Sets the estimation value for this Request.
     * 
     * @param estimation
     */
    public void setEstimation(float estimation) {
        this.estimation = estimation;
    }


    /**
     * Gets the fact value for this Request.
     * 
     * @return fact
     */
    public float getFact() {
        return fact;
    }


    /**
     * Sets the fact value for this Request.
     * 
     * @param fact
     */
    public void setFact(float fact) {
        this.fact = fact;
    }


    /**
     * Gets the function value for this Request.
     * 
     * @return function
     */
    public int getFunction() {
        return function;
    }


    /**
     * Sets the function value for this Request.
     * 
     * @param function
     */
    public void setFunction(int function) {
        this.function = function;
    }


    /**
     * Gets the tags value for this Request.
     * 
     * @return tags
     */
    public int getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this Request.
     * 
     * @param tags
     */
    public void setTags(int tags) {
        this.tags = tags;
    }


    /**
     * Gets the owner value for this Request.
     * 
     * @return owner
     */
    public int getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Request.
     * 
     * @param owner
     */
    public void setOwner(int owner) {
        this.owner = owner;
    }


    /**
     * Gets the project value for this Request.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Request.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the plannedRelease value for this Request.
     * 
     * @return plannedRelease
     */
    public int getPlannedRelease() {
        return plannedRelease;
    }


    /**
     * Sets the plannedRelease value for this Request.
     * 
     * @param plannedRelease
     */
    public void setPlannedRelease(int plannedRelease) {
        this.plannedRelease = plannedRelease;
    }


    /**
     * Gets the iteration value for this Request.
     * 
     * @return iteration
     */
    public int getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this Request.
     * 
     * @param iteration
     */
    public void setIteration(int iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the lifecycleDuration value for this Request.
     * 
     * @return lifecycleDuration
     */
    public int getLifecycleDuration() {
        return lifecycleDuration;
    }


    /**
     * Sets the lifecycleDuration value for this Request.
     * 
     * @param lifecycleDuration
     */
    public void setLifecycleDuration(int lifecycleDuration) {
        this.lifecycleDuration = lifecycleDuration;
    }


    /**
     * Gets the deadlines value for this Request.
     * 
     * @return deadlines
     */
    public int getDeadlines() {
        return deadlines;
    }


    /**
     * Sets the deadlines value for this Request.
     * 
     * @param deadlines
     */
    public void setDeadlines(int deadlines) {
        this.deadlines = deadlines;
    }


    /**
     * Gets the startDate value for this Request.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Request.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the finishDate value for this Request.
     * 
     * @return finishDate
     */
    public java.util.Calendar getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this Request.
     * 
     * @param finishDate
     */
    public void setFinishDate(java.util.Calendar finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the deliveryDate value for this Request.
     * 
     * @return deliveryDate
     */
    public java.util.Date getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this Request.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the tasks value for this Request.
     * 
     * @return tasks
     */
    public int getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Request.
     * 
     * @param tasks
     */
    public void setTasks(int tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the openTasks value for this Request.
     * 
     * @return openTasks
     */
    public int getOpenTasks() {
        return openTasks;
    }


    /**
     * Sets the openTasks value for this Request.
     * 
     * @param openTasks
     */
    public void setOpenTasks(int openTasks) {
        this.openTasks = openTasks;
    }


    /**
     * Gets the environment value for this Request.
     * 
     * @return environment
     */
    public int getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this Request.
     * 
     * @param environment
     */
    public void setEnvironment(int environment) {
        this.environment = environment;
    }


    /**
     * Gets the submittedVersion value for this Request.
     * 
     * @return submittedVersion
     */
    public int getSubmittedVersion() {
        return submittedVersion;
    }


    /**
     * Sets the submittedVersion value for this Request.
     * 
     * @param submittedVersion
     */
    public void setSubmittedVersion(int submittedVersion) {
        this.submittedVersion = submittedVersion;
    }


    /**
     * Gets the closedInVersion value for this Request.
     * 
     * @return closedInVersion
     */
    public int getClosedInVersion() {
        return closedInVersion;
    }


    /**
     * Sets the closedInVersion value for this Request.
     * 
     * @param closedInVersion
     */
    public void setClosedInVersion(int closedInVersion) {
        this.closedInVersion = closedInVersion;
    }


    /**
     * Gets the factToday value for this Request.
     * 
     * @return factToday
     */
    public float getFactToday() {
        return factToday;
    }


    /**
     * Sets the factToday value for this Request.
     * 
     * @param factToday
     */
    public void setFactToday(float factToday) {
        this.factToday = factToday;
    }


    /**
     * Gets the author value for this Request.
     * 
     * @return author
     */
    public int getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Request.
     * 
     * @param author
     */
    public void setAuthor(int author) {
        this.author = author;
    }


    /**
     * Gets the estimatedStartDate value for this Request.
     * 
     * @return estimatedStartDate
     */
    public java.util.Calendar getEstimatedStartDate() {
        return estimatedStartDate;
    }


    /**
     * Sets the estimatedStartDate value for this Request.
     * 
     * @param estimatedStartDate
     */
    public void setEstimatedStartDate(java.util.Calendar estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }


    /**
     * Gets the estimatedFinishDate value for this Request.
     * 
     * @return estimatedFinishDate
     */
    public java.util.Calendar getEstimatedFinishDate() {
        return estimatedFinishDate;
    }


    /**
     * Sets the estimatedFinishDate value for this Request.
     * 
     * @param estimatedFinishDate
     */
    public void setEstimatedFinishDate(java.util.Calendar estimatedFinishDate) {
        this.estimatedFinishDate = estimatedFinishDate;
    }


    /**
     * Gets the orderNum value for this Request.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Request.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Request.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Request.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Request.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Request.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the attachment value for this Request.
     * 
     * @return attachment
     */
    public int getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this Request.
     * 
     * @param attachment
     */
    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the question value for this Request.
     * 
     * @return question
     */
    public int getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this Request.
     * 
     * @param question
     */
    public void setQuestion(int question) {
        this.question = question;
    }


    /**
     * Gets the dueWeeks value for this Request.
     * 
     * @return dueWeeks
     */
    public int getDueWeeks() {
        return dueWeeks;
    }


    /**
     * Sets the dueWeeks value for this Request.
     * 
     * @param dueWeeks
     */
    public void setDueWeeks(int dueWeeks) {
        this.dueWeeks = dueWeeks;
    }


    /**
     * Gets the watchers value for this Request.
     * 
     * @return watchers
     */
    public int getWatchers() {
        return watchers;
    }


    /**
     * Sets the watchers value for this Request.
     * 
     * @param watchers
     */
    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }


    /**
     * Gets the links value for this Request.
     * 
     * @return links
     */
    public int getLinks() {
        return links;
    }


    /**
     * Sets the links value for this Request.
     * 
     * @param links
     */
    public void setLinks(int links) {
        this.links = links;
    }


    /**
     * Gets the recentComment value for this Request.
     * 
     * @return recentComment
     */
    public java.lang.String getRecentComment() {
        return recentComment;
    }


    /**
     * Sets the recentComment value for this Request.
     * 
     * @param recentComment
     */
    public void setRecentComment(java.lang.String recentComment) {
        this.recentComment = recentComment;
    }


    /**
     * Gets the externalId value for this Request.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Request.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the components value for this Request.
     * 
     * @return components
     */
    public int getComponents() {
        return components;
    }


    /**
     * Sets the components value for this Request.
     * 
     * @param components
     */
    public void setComponents(int components) {
        this.components = components;
    }


    /**
     * Gets the id value for this Request.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Request.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Request.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Request.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Request.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Request.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Request.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Request.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.priority == other.getPriority() &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            this.type == other.getType() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.estimation == other.getEstimation() &&
            this.fact == other.getFact() &&
            this.function == other.getFunction() &&
            this.tags == other.getTags() &&
            this.owner == other.getOwner() &&
            this.project == other.getProject() &&
            this.plannedRelease == other.getPlannedRelease() &&
            this.iteration == other.getIteration() &&
            this.lifecycleDuration == other.getLifecycleDuration() &&
            this.deadlines == other.getDeadlines() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            this.tasks == other.getTasks() &&
            this.openTasks == other.getOpenTasks() &&
            this.environment == other.getEnvironment() &&
            this.submittedVersion == other.getSubmittedVersion() &&
            this.closedInVersion == other.getClosedInVersion() &&
            this.factToday == other.getFactToday() &&
            this.author == other.getAuthor() &&
            ((this.estimatedStartDate==null && other.getEstimatedStartDate()==null) || 
             (this.estimatedStartDate!=null &&
              this.estimatedStartDate.equals(other.getEstimatedStartDate()))) &&
            ((this.estimatedFinishDate==null && other.getEstimatedFinishDate()==null) || 
             (this.estimatedFinishDate!=null &&
              this.estimatedFinishDate.equals(other.getEstimatedFinishDate()))) &&
            this.orderNum == other.getOrderNum() &&
            ((this.recordCreated==null && other.getRecordCreated()==null) || 
             (this.recordCreated!=null &&
              this.recordCreated.equals(other.getRecordCreated()))) &&
            ((this.recordModified==null && other.getRecordModified()==null) || 
             (this.recordModified!=null &&
              this.recordModified.equals(other.getRecordModified()))) &&
            this.attachment == other.getAttachment() &&
            this.question == other.getQuestion() &&
            this.dueWeeks == other.getDueWeeks() &&
            this.watchers == other.getWatchers() &&
            this.links == other.getLinks() &&
            ((this.recentComment==null && other.getRecentComment()==null) || 
             (this.recentComment!=null &&
              this.recentComment.equals(other.getRecentComment()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            this.components == other.getComponents() &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getPriority();
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        _hashCode += getType();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += new Float(getEstimation()).hashCode();
        _hashCode += new Float(getFact()).hashCode();
        _hashCode += getFunction();
        _hashCode += getTags();
        _hashCode += getOwner();
        _hashCode += getProject();
        _hashCode += getPlannedRelease();
        _hashCode += getIteration();
        _hashCode += getLifecycleDuration();
        _hashCode += getDeadlines();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        _hashCode += getTasks();
        _hashCode += getOpenTasks();
        _hashCode += getEnvironment();
        _hashCode += getSubmittedVersion();
        _hashCode += getClosedInVersion();
        _hashCode += new Float(getFactToday()).hashCode();
        _hashCode += getAuthor();
        if (getEstimatedStartDate() != null) {
            _hashCode += getEstimatedStartDate().hashCode();
        }
        if (getEstimatedFinishDate() != null) {
            _hashCode += getEstimatedFinishDate().hashCode();
        }
        _hashCode += getOrderNum();
        if (getRecordCreated() != null) {
            _hashCode += getRecordCreated().hashCode();
        }
        if (getRecordModified() != null) {
            _hashCode += getRecordModified().hashCode();
        }
        _hashCode += getAttachment();
        _hashCode += getQuestion();
        _hashCode += getDueWeeks();
        _hashCode += getWatchers();
        _hashCode += getLinks();
        if (getRecentComment() != null) {
            _hashCode += getRecentComment().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        _hashCode += getComponents();
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
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estimation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Function"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
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
        elemField.setFieldName("plannedRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlannedRelease"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LifecycleDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadlines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deadlines"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OpenTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubmittedVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedInVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClosedInVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factToday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FactToday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueWeeks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DueWeeks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Watchers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recentComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecentComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Components"));
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
