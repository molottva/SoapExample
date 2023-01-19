/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Task  implements java.io.Serializable {
    private java.lang.String caption;

    private int priority;

    private int assignee;

    private float planned;

    private float leftWork;

    private float fact;

    private int release;

    private java.util.Date plannedStartDate;

    private java.util.Date plannedFinishDate;

    private int taskType;

    private int changeRequest;

    private java.lang.String issueDescription;

    private java.lang.String issueState;

    private int attachment;

    private float factToday;

    private int traceTask;

    private int traceInversedTask;

    private java.lang.String state;

    private java.util.Calendar startDate;

    private java.util.Calendar finishDate;

    private int tags;

    private java.util.Calendar estimatedStartDate;

    private java.util.Calendar estimatedFinishDate;

    private int orderNum;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int watchers;

    private int author;

    private int dueWeeks;

    private java.lang.String recentComment;

    private int project;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Task() {
    }

    public Task(
           java.lang.String caption,
           int priority,
           int assignee,
           float planned,
           float leftWork,
           float fact,
           int release,
           java.util.Date plannedStartDate,
           java.util.Date plannedFinishDate,
           int taskType,
           int changeRequest,
           java.lang.String issueDescription,
           java.lang.String issueState,
           int attachment,
           float factToday,
           int traceTask,
           int traceInversedTask,
           java.lang.String state,
           java.util.Calendar startDate,
           java.util.Calendar finishDate,
           int tags,
           java.util.Calendar estimatedStartDate,
           java.util.Calendar estimatedFinishDate,
           int orderNum,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int watchers,
           int author,
           int dueWeeks,
           java.lang.String recentComment,
           int project,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.caption = caption;
           this.priority = priority;
           this.assignee = assignee;
           this.planned = planned;
           this.leftWork = leftWork;
           this.fact = fact;
           this.release = release;
           this.plannedStartDate = plannedStartDate;
           this.plannedFinishDate = plannedFinishDate;
           this.taskType = taskType;
           this.changeRequest = changeRequest;
           this.issueDescription = issueDescription;
           this.issueState = issueState;
           this.attachment = attachment;
           this.factToday = factToday;
           this.traceTask = traceTask;
           this.traceInversedTask = traceInversedTask;
           this.state = state;
           this.startDate = startDate;
           this.finishDate = finishDate;
           this.tags = tags;
           this.estimatedStartDate = estimatedStartDate;
           this.estimatedFinishDate = estimatedFinishDate;
           this.orderNum = orderNum;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.watchers = watchers;
           this.author = author;
           this.dueWeeks = dueWeeks;
           this.recentComment = recentComment;
           this.project = project;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the caption value for this Task.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this Task.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the priority value for this Task.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Task.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the assignee value for this Task.
     * 
     * @return assignee
     */
    public int getAssignee() {
        return assignee;
    }


    /**
     * Sets the assignee value for this Task.
     * 
     * @param assignee
     */
    public void setAssignee(int assignee) {
        this.assignee = assignee;
    }


    /**
     * Gets the planned value for this Task.
     * 
     * @return planned
     */
    public float getPlanned() {
        return planned;
    }


    /**
     * Sets the planned value for this Task.
     * 
     * @param planned
     */
    public void setPlanned(float planned) {
        this.planned = planned;
    }


    /**
     * Gets the leftWork value for this Task.
     * 
     * @return leftWork
     */
    public float getLeftWork() {
        return leftWork;
    }


    /**
     * Sets the leftWork value for this Task.
     * 
     * @param leftWork
     */
    public void setLeftWork(float leftWork) {
        this.leftWork = leftWork;
    }


    /**
     * Gets the fact value for this Task.
     * 
     * @return fact
     */
    public float getFact() {
        return fact;
    }


    /**
     * Sets the fact value for this Task.
     * 
     * @param fact
     */
    public void setFact(float fact) {
        this.fact = fact;
    }


    /**
     * Gets the release value for this Task.
     * 
     * @return release
     */
    public int getRelease() {
        return release;
    }


    /**
     * Sets the release value for this Task.
     * 
     * @param release
     */
    public void setRelease(int release) {
        this.release = release;
    }


    /**
     * Gets the plannedStartDate value for this Task.
     * 
     * @return plannedStartDate
     */
    public java.util.Date getPlannedStartDate() {
        return plannedStartDate;
    }


    /**
     * Sets the plannedStartDate value for this Task.
     * 
     * @param plannedStartDate
     */
    public void setPlannedStartDate(java.util.Date plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }


    /**
     * Gets the plannedFinishDate value for this Task.
     * 
     * @return plannedFinishDate
     */
    public java.util.Date getPlannedFinishDate() {
        return plannedFinishDate;
    }


    /**
     * Sets the plannedFinishDate value for this Task.
     * 
     * @param plannedFinishDate
     */
    public void setPlannedFinishDate(java.util.Date plannedFinishDate) {
        this.plannedFinishDate = plannedFinishDate;
    }


    /**
     * Gets the taskType value for this Task.
     * 
     * @return taskType
     */
    public int getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this Task.
     * 
     * @param taskType
     */
    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the changeRequest value for this Task.
     * 
     * @return changeRequest
     */
    public int getChangeRequest() {
        return changeRequest;
    }


    /**
     * Sets the changeRequest value for this Task.
     * 
     * @param changeRequest
     */
    public void setChangeRequest(int changeRequest) {
        this.changeRequest = changeRequest;
    }


    /**
     * Gets the issueDescription value for this Task.
     * 
     * @return issueDescription
     */
    public java.lang.String getIssueDescription() {
        return issueDescription;
    }


    /**
     * Sets the issueDescription value for this Task.
     * 
     * @param issueDescription
     */
    public void setIssueDescription(java.lang.String issueDescription) {
        this.issueDescription = issueDescription;
    }


    /**
     * Gets the issueState value for this Task.
     * 
     * @return issueState
     */
    public java.lang.String getIssueState() {
        return issueState;
    }


    /**
     * Sets the issueState value for this Task.
     * 
     * @param issueState
     */
    public void setIssueState(java.lang.String issueState) {
        this.issueState = issueState;
    }


    /**
     * Gets the attachment value for this Task.
     * 
     * @return attachment
     */
    public int getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this Task.
     * 
     * @param attachment
     */
    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the factToday value for this Task.
     * 
     * @return factToday
     */
    public float getFactToday() {
        return factToday;
    }


    /**
     * Sets the factToday value for this Task.
     * 
     * @param factToday
     */
    public void setFactToday(float factToday) {
        this.factToday = factToday;
    }


    /**
     * Gets the traceTask value for this Task.
     * 
     * @return traceTask
     */
    public int getTraceTask() {
        return traceTask;
    }


    /**
     * Sets the traceTask value for this Task.
     * 
     * @param traceTask
     */
    public void setTraceTask(int traceTask) {
        this.traceTask = traceTask;
    }


    /**
     * Gets the traceInversedTask value for this Task.
     * 
     * @return traceInversedTask
     */
    public int getTraceInversedTask() {
        return traceInversedTask;
    }


    /**
     * Sets the traceInversedTask value for this Task.
     * 
     * @param traceInversedTask
     */
    public void setTraceInversedTask(int traceInversedTask) {
        this.traceInversedTask = traceInversedTask;
    }


    /**
     * Gets the state value for this Task.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Task.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the startDate value for this Task.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Task.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the finishDate value for this Task.
     * 
     * @return finishDate
     */
    public java.util.Calendar getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this Task.
     * 
     * @param finishDate
     */
    public void setFinishDate(java.util.Calendar finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the tags value for this Task.
     * 
     * @return tags
     */
    public int getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this Task.
     * 
     * @param tags
     */
    public void setTags(int tags) {
        this.tags = tags;
    }


    /**
     * Gets the estimatedStartDate value for this Task.
     * 
     * @return estimatedStartDate
     */
    public java.util.Calendar getEstimatedStartDate() {
        return estimatedStartDate;
    }


    /**
     * Sets the estimatedStartDate value for this Task.
     * 
     * @param estimatedStartDate
     */
    public void setEstimatedStartDate(java.util.Calendar estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }


    /**
     * Gets the estimatedFinishDate value for this Task.
     * 
     * @return estimatedFinishDate
     */
    public java.util.Calendar getEstimatedFinishDate() {
        return estimatedFinishDate;
    }


    /**
     * Sets the estimatedFinishDate value for this Task.
     * 
     * @param estimatedFinishDate
     */
    public void setEstimatedFinishDate(java.util.Calendar estimatedFinishDate) {
        this.estimatedFinishDate = estimatedFinishDate;
    }


    /**
     * Gets the orderNum value for this Task.
     * 
     * @return orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }


    /**
     * Sets the orderNum value for this Task.
     * 
     * @param orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * Gets the recordCreated value for this Task.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Task.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Task.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Task.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the watchers value for this Task.
     * 
     * @return watchers
     */
    public int getWatchers() {
        return watchers;
    }


    /**
     * Sets the watchers value for this Task.
     * 
     * @param watchers
     */
    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }


    /**
     * Gets the author value for this Task.
     * 
     * @return author
     */
    public int getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Task.
     * 
     * @param author
     */
    public void setAuthor(int author) {
        this.author = author;
    }


    /**
     * Gets the dueWeeks value for this Task.
     * 
     * @return dueWeeks
     */
    public int getDueWeeks() {
        return dueWeeks;
    }


    /**
     * Sets the dueWeeks value for this Task.
     * 
     * @param dueWeeks
     */
    public void setDueWeeks(int dueWeeks) {
        this.dueWeeks = dueWeeks;
    }


    /**
     * Gets the recentComment value for this Task.
     * 
     * @return recentComment
     */
    public java.lang.String getRecentComment() {
        return recentComment;
    }


    /**
     * Sets the recentComment value for this Task.
     * 
     * @param recentComment
     */
    public void setRecentComment(java.lang.String recentComment) {
        this.recentComment = recentComment;
    }


    /**
     * Gets the project value for this Task.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Task.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the id value for this Task.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Task.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Task.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Task.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Task.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Task.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Task.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Task.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
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
            this.priority == other.getPriority() &&
            this.assignee == other.getAssignee() &&
            this.planned == other.getPlanned() &&
            this.leftWork == other.getLeftWork() &&
            this.fact == other.getFact() &&
            this.release == other.getRelease() &&
            ((this.plannedStartDate==null && other.getPlannedStartDate()==null) || 
             (this.plannedStartDate!=null &&
              this.plannedStartDate.equals(other.getPlannedStartDate()))) &&
            ((this.plannedFinishDate==null && other.getPlannedFinishDate()==null) || 
             (this.plannedFinishDate!=null &&
              this.plannedFinishDate.equals(other.getPlannedFinishDate()))) &&
            this.taskType == other.getTaskType() &&
            this.changeRequest == other.getChangeRequest() &&
            ((this.issueDescription==null && other.getIssueDescription()==null) || 
             (this.issueDescription!=null &&
              this.issueDescription.equals(other.getIssueDescription()))) &&
            ((this.issueState==null && other.getIssueState()==null) || 
             (this.issueState!=null &&
              this.issueState.equals(other.getIssueState()))) &&
            this.attachment == other.getAttachment() &&
            this.factToday == other.getFactToday() &&
            this.traceTask == other.getTraceTask() &&
            this.traceInversedTask == other.getTraceInversedTask() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            this.tags == other.getTags() &&
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
            this.watchers == other.getWatchers() &&
            this.author == other.getAuthor() &&
            this.dueWeeks == other.getDueWeeks() &&
            ((this.recentComment==null && other.getRecentComment()==null) || 
             (this.recentComment!=null &&
              this.recentComment.equals(other.getRecentComment()))) &&
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
        _hashCode += getPriority();
        _hashCode += getAssignee();
        _hashCode += new Float(getPlanned()).hashCode();
        _hashCode += new Float(getLeftWork()).hashCode();
        _hashCode += new Float(getFact()).hashCode();
        _hashCode += getRelease();
        if (getPlannedStartDate() != null) {
            _hashCode += getPlannedStartDate().hashCode();
        }
        if (getPlannedFinishDate() != null) {
            _hashCode += getPlannedFinishDate().hashCode();
        }
        _hashCode += getTaskType();
        _hashCode += getChangeRequest();
        if (getIssueDescription() != null) {
            _hashCode += getIssueDescription().hashCode();
        }
        if (getIssueState() != null) {
            _hashCode += getIssueState().hashCode();
        }
        _hashCode += getAttachment();
        _hashCode += new Float(getFactToday()).hashCode();
        _hashCode += getTraceTask();
        _hashCode += getTraceInversedTask();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        _hashCode += getTags();
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
        _hashCode += getWatchers();
        _hashCode += getAuthor();
        _hashCode += getDueWeeks();
        if (getRecentComment() != null) {
            _hashCode += getRecentComment().hashCode();
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
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Caption"));
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
        elemField.setFieldName("assignee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Assignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Planned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftWork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LeftWork"));
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
        elemField.setFieldName("release");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlannedStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedFinishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlannedFinishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachment"));
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
        elemField.setFieldName("traceTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TraceTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceInversedTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TraceInversedTask"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tags"));
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
        elemField.setFieldName("watchers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Watchers"));
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
        elemField.setFieldName("dueWeeks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DueWeeks"));
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
