/**
 * Methodology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.devprom.api.soap.service.dataservice;

public class Methodology  implements java.io.Serializable {
    private java.lang.String isPlanningUsed;

    private java.lang.String isTasks;

    private java.lang.String isReleasesUsed;

    private java.lang.String isFixedRelease;

    private int releaseDuration;

    private java.lang.String hasMilestones;

    private java.lang.String isVersionsUsed;

    private java.lang.String metricsType;

    private java.lang.String useScrums;

    private java.lang.String isDesign;

    private java.lang.String isRequirements;

    private java.lang.String isIncidentsUsed;

    private java.lang.String isTests;

    private int project;

    private java.lang.String isHelps;

    private java.lang.String isRequestOrderUsed;

    private java.lang.String requestApproveRequired;

    private java.lang.String isResponsibleForIssue;

    private java.lang.String useFunctionalDecomposition;

    private java.lang.String isResponsibleForFunctions;

    private java.lang.String useEnvironments;

    private java.lang.String isSubversionUsed;

    private java.lang.String isFileServer;

    private java.lang.String isHighTolerance;

    private java.lang.String taskEstimationUsed;

    private java.lang.String requestEstimationRequired;

    private java.lang.String isTimesheetsAreApproved;

    private java.lang.String isReportsOnActivities;

    private java.lang.String isParticipantsTakeTasks;

    private java.lang.String isKnowledgeUsed;

    private java.lang.String isDeadlineUsed;

    private java.lang.String isTasksDepend;

    private java.lang.String isCrossChecking;

    private int verificationTime;

    private java.lang.String isUserInProject;

    private java.lang.String customerAcceptsIssues;

    private java.lang.String isKanbanUsed;

    private java.util.Calendar recordCreated;

    private java.util.Calendar recordModified;

    private int id;

    private java.lang.String className;

    private int recordVersion;

    private java.lang.String url;

    public Methodology() {
    }

    public Methodology(
           java.lang.String isPlanningUsed,
           java.lang.String isTasks,
           java.lang.String isReleasesUsed,
           java.lang.String isFixedRelease,
           int releaseDuration,
           java.lang.String hasMilestones,
           java.lang.String isVersionsUsed,
           java.lang.String metricsType,
           java.lang.String useScrums,
           java.lang.String isDesign,
           java.lang.String isRequirements,
           java.lang.String isIncidentsUsed,
           java.lang.String isTests,
           int project,
           java.lang.String isHelps,
           java.lang.String isRequestOrderUsed,
           java.lang.String requestApproveRequired,
           java.lang.String isResponsibleForIssue,
           java.lang.String useFunctionalDecomposition,
           java.lang.String isResponsibleForFunctions,
           java.lang.String useEnvironments,
           java.lang.String isSubversionUsed,
           java.lang.String isFileServer,
           java.lang.String isHighTolerance,
           java.lang.String taskEstimationUsed,
           java.lang.String requestEstimationRequired,
           java.lang.String isTimesheetsAreApproved,
           java.lang.String isReportsOnActivities,
           java.lang.String isParticipantsTakeTasks,
           java.lang.String isKnowledgeUsed,
           java.lang.String isDeadlineUsed,
           java.lang.String isTasksDepend,
           java.lang.String isCrossChecking,
           int verificationTime,
           java.lang.String isUserInProject,
           java.lang.String customerAcceptsIssues,
           java.lang.String isKanbanUsed,
           java.util.Calendar recordCreated,
           java.util.Calendar recordModified,
           int id,
           java.lang.String className,
           int recordVersion,
           java.lang.String url) {
           this.isPlanningUsed = isPlanningUsed;
           this.isTasks = isTasks;
           this.isReleasesUsed = isReleasesUsed;
           this.isFixedRelease = isFixedRelease;
           this.releaseDuration = releaseDuration;
           this.hasMilestones = hasMilestones;
           this.isVersionsUsed = isVersionsUsed;
           this.metricsType = metricsType;
           this.useScrums = useScrums;
           this.isDesign = isDesign;
           this.isRequirements = isRequirements;
           this.isIncidentsUsed = isIncidentsUsed;
           this.isTests = isTests;
           this.project = project;
           this.isHelps = isHelps;
           this.isRequestOrderUsed = isRequestOrderUsed;
           this.requestApproveRequired = requestApproveRequired;
           this.isResponsibleForIssue = isResponsibleForIssue;
           this.useFunctionalDecomposition = useFunctionalDecomposition;
           this.isResponsibleForFunctions = isResponsibleForFunctions;
           this.useEnvironments = useEnvironments;
           this.isSubversionUsed = isSubversionUsed;
           this.isFileServer = isFileServer;
           this.isHighTolerance = isHighTolerance;
           this.taskEstimationUsed = taskEstimationUsed;
           this.requestEstimationRequired = requestEstimationRequired;
           this.isTimesheetsAreApproved = isTimesheetsAreApproved;
           this.isReportsOnActivities = isReportsOnActivities;
           this.isParticipantsTakeTasks = isParticipantsTakeTasks;
           this.isKnowledgeUsed = isKnowledgeUsed;
           this.isDeadlineUsed = isDeadlineUsed;
           this.isTasksDepend = isTasksDepend;
           this.isCrossChecking = isCrossChecking;
           this.verificationTime = verificationTime;
           this.isUserInProject = isUserInProject;
           this.customerAcceptsIssues = customerAcceptsIssues;
           this.isKanbanUsed = isKanbanUsed;
           this.recordCreated = recordCreated;
           this.recordModified = recordModified;
           this.id = id;
           this.className = className;
           this.recordVersion = recordVersion;
           this.url = url;
    }


    /**
     * Gets the isPlanningUsed value for this Methodology.
     * 
     * @return isPlanningUsed
     */
    public java.lang.String getIsPlanningUsed() {
        return isPlanningUsed;
    }


    /**
     * Sets the isPlanningUsed value for this Methodology.
     * 
     * @param isPlanningUsed
     */
    public void setIsPlanningUsed(java.lang.String isPlanningUsed) {
        this.isPlanningUsed = isPlanningUsed;
    }


    /**
     * Gets the isTasks value for this Methodology.
     * 
     * @return isTasks
     */
    public java.lang.String getIsTasks() {
        return isTasks;
    }


    /**
     * Sets the isTasks value for this Methodology.
     * 
     * @param isTasks
     */
    public void setIsTasks(java.lang.String isTasks) {
        this.isTasks = isTasks;
    }


    /**
     * Gets the isReleasesUsed value for this Methodology.
     * 
     * @return isReleasesUsed
     */
    public java.lang.String getIsReleasesUsed() {
        return isReleasesUsed;
    }


    /**
     * Sets the isReleasesUsed value for this Methodology.
     * 
     * @param isReleasesUsed
     */
    public void setIsReleasesUsed(java.lang.String isReleasesUsed) {
        this.isReleasesUsed = isReleasesUsed;
    }


    /**
     * Gets the isFixedRelease value for this Methodology.
     * 
     * @return isFixedRelease
     */
    public java.lang.String getIsFixedRelease() {
        return isFixedRelease;
    }


    /**
     * Sets the isFixedRelease value for this Methodology.
     * 
     * @param isFixedRelease
     */
    public void setIsFixedRelease(java.lang.String isFixedRelease) {
        this.isFixedRelease = isFixedRelease;
    }


    /**
     * Gets the releaseDuration value for this Methodology.
     * 
     * @return releaseDuration
     */
    public int getReleaseDuration() {
        return releaseDuration;
    }


    /**
     * Sets the releaseDuration value for this Methodology.
     * 
     * @param releaseDuration
     */
    public void setReleaseDuration(int releaseDuration) {
        this.releaseDuration = releaseDuration;
    }


    /**
     * Gets the hasMilestones value for this Methodology.
     * 
     * @return hasMilestones
     */
    public java.lang.String getHasMilestones() {
        return hasMilestones;
    }


    /**
     * Sets the hasMilestones value for this Methodology.
     * 
     * @param hasMilestones
     */
    public void setHasMilestones(java.lang.String hasMilestones) {
        this.hasMilestones = hasMilestones;
    }


    /**
     * Gets the isVersionsUsed value for this Methodology.
     * 
     * @return isVersionsUsed
     */
    public java.lang.String getIsVersionsUsed() {
        return isVersionsUsed;
    }


    /**
     * Sets the isVersionsUsed value for this Methodology.
     * 
     * @param isVersionsUsed
     */
    public void setIsVersionsUsed(java.lang.String isVersionsUsed) {
        this.isVersionsUsed = isVersionsUsed;
    }


    /**
     * Gets the metricsType value for this Methodology.
     * 
     * @return metricsType
     */
    public java.lang.String getMetricsType() {
        return metricsType;
    }


    /**
     * Sets the metricsType value for this Methodology.
     * 
     * @param metricsType
     */
    public void setMetricsType(java.lang.String metricsType) {
        this.metricsType = metricsType;
    }


    /**
     * Gets the useScrums value for this Methodology.
     * 
     * @return useScrums
     */
    public java.lang.String getUseScrums() {
        return useScrums;
    }


    /**
     * Sets the useScrums value for this Methodology.
     * 
     * @param useScrums
     */
    public void setUseScrums(java.lang.String useScrums) {
        this.useScrums = useScrums;
    }


    /**
     * Gets the isDesign value for this Methodology.
     * 
     * @return isDesign
     */
    public java.lang.String getIsDesign() {
        return isDesign;
    }


    /**
     * Sets the isDesign value for this Methodology.
     * 
     * @param isDesign
     */
    public void setIsDesign(java.lang.String isDesign) {
        this.isDesign = isDesign;
    }


    /**
     * Gets the isRequirements value for this Methodology.
     * 
     * @return isRequirements
     */
    public java.lang.String getIsRequirements() {
        return isRequirements;
    }


    /**
     * Sets the isRequirements value for this Methodology.
     * 
     * @param isRequirements
     */
    public void setIsRequirements(java.lang.String isRequirements) {
        this.isRequirements = isRequirements;
    }


    /**
     * Gets the isIncidentsUsed value for this Methodology.
     * 
     * @return isIncidentsUsed
     */
    public java.lang.String getIsIncidentsUsed() {
        return isIncidentsUsed;
    }


    /**
     * Sets the isIncidentsUsed value for this Methodology.
     * 
     * @param isIncidentsUsed
     */
    public void setIsIncidentsUsed(java.lang.String isIncidentsUsed) {
        this.isIncidentsUsed = isIncidentsUsed;
    }


    /**
     * Gets the isTests value for this Methodology.
     * 
     * @return isTests
     */
    public java.lang.String getIsTests() {
        return isTests;
    }


    /**
     * Sets the isTests value for this Methodology.
     * 
     * @param isTests
     */
    public void setIsTests(java.lang.String isTests) {
        this.isTests = isTests;
    }


    /**
     * Gets the project value for this Methodology.
     * 
     * @return project
     */
    public int getProject() {
        return project;
    }


    /**
     * Sets the project value for this Methodology.
     * 
     * @param project
     */
    public void setProject(int project) {
        this.project = project;
    }


    /**
     * Gets the isHelps value for this Methodology.
     * 
     * @return isHelps
     */
    public java.lang.String getIsHelps() {
        return isHelps;
    }


    /**
     * Sets the isHelps value for this Methodology.
     * 
     * @param isHelps
     */
    public void setIsHelps(java.lang.String isHelps) {
        this.isHelps = isHelps;
    }


    /**
     * Gets the isRequestOrderUsed value for this Methodology.
     * 
     * @return isRequestOrderUsed
     */
    public java.lang.String getIsRequestOrderUsed() {
        return isRequestOrderUsed;
    }


    /**
     * Sets the isRequestOrderUsed value for this Methodology.
     * 
     * @param isRequestOrderUsed
     */
    public void setIsRequestOrderUsed(java.lang.String isRequestOrderUsed) {
        this.isRequestOrderUsed = isRequestOrderUsed;
    }


    /**
     * Gets the requestApproveRequired value for this Methodology.
     * 
     * @return requestApproveRequired
     */
    public java.lang.String getRequestApproveRequired() {
        return requestApproveRequired;
    }


    /**
     * Sets the requestApproveRequired value for this Methodology.
     * 
     * @param requestApproveRequired
     */
    public void setRequestApproveRequired(java.lang.String requestApproveRequired) {
        this.requestApproveRequired = requestApproveRequired;
    }


    /**
     * Gets the isResponsibleForIssue value for this Methodology.
     * 
     * @return isResponsibleForIssue
     */
    public java.lang.String getIsResponsibleForIssue() {
        return isResponsibleForIssue;
    }


    /**
     * Sets the isResponsibleForIssue value for this Methodology.
     * 
     * @param isResponsibleForIssue
     */
    public void setIsResponsibleForIssue(java.lang.String isResponsibleForIssue) {
        this.isResponsibleForIssue = isResponsibleForIssue;
    }


    /**
     * Gets the useFunctionalDecomposition value for this Methodology.
     * 
     * @return useFunctionalDecomposition
     */
    public java.lang.String getUseFunctionalDecomposition() {
        return useFunctionalDecomposition;
    }


    /**
     * Sets the useFunctionalDecomposition value for this Methodology.
     * 
     * @param useFunctionalDecomposition
     */
    public void setUseFunctionalDecomposition(java.lang.String useFunctionalDecomposition) {
        this.useFunctionalDecomposition = useFunctionalDecomposition;
    }


    /**
     * Gets the isResponsibleForFunctions value for this Methodology.
     * 
     * @return isResponsibleForFunctions
     */
    public java.lang.String getIsResponsibleForFunctions() {
        return isResponsibleForFunctions;
    }


    /**
     * Sets the isResponsibleForFunctions value for this Methodology.
     * 
     * @param isResponsibleForFunctions
     */
    public void setIsResponsibleForFunctions(java.lang.String isResponsibleForFunctions) {
        this.isResponsibleForFunctions = isResponsibleForFunctions;
    }


    /**
     * Gets the useEnvironments value for this Methodology.
     * 
     * @return useEnvironments
     */
    public java.lang.String getUseEnvironments() {
        return useEnvironments;
    }


    /**
     * Sets the useEnvironments value for this Methodology.
     * 
     * @param useEnvironments
     */
    public void setUseEnvironments(java.lang.String useEnvironments) {
        this.useEnvironments = useEnvironments;
    }


    /**
     * Gets the isSubversionUsed value for this Methodology.
     * 
     * @return isSubversionUsed
     */
    public java.lang.String getIsSubversionUsed() {
        return isSubversionUsed;
    }


    /**
     * Sets the isSubversionUsed value for this Methodology.
     * 
     * @param isSubversionUsed
     */
    public void setIsSubversionUsed(java.lang.String isSubversionUsed) {
        this.isSubversionUsed = isSubversionUsed;
    }


    /**
     * Gets the isFileServer value for this Methodology.
     * 
     * @return isFileServer
     */
    public java.lang.String getIsFileServer() {
        return isFileServer;
    }


    /**
     * Sets the isFileServer value for this Methodology.
     * 
     * @param isFileServer
     */
    public void setIsFileServer(java.lang.String isFileServer) {
        this.isFileServer = isFileServer;
    }


    /**
     * Gets the isHighTolerance value for this Methodology.
     * 
     * @return isHighTolerance
     */
    public java.lang.String getIsHighTolerance() {
        return isHighTolerance;
    }


    /**
     * Sets the isHighTolerance value for this Methodology.
     * 
     * @param isHighTolerance
     */
    public void setIsHighTolerance(java.lang.String isHighTolerance) {
        this.isHighTolerance = isHighTolerance;
    }


    /**
     * Gets the taskEstimationUsed value for this Methodology.
     * 
     * @return taskEstimationUsed
     */
    public java.lang.String getTaskEstimationUsed() {
        return taskEstimationUsed;
    }


    /**
     * Sets the taskEstimationUsed value for this Methodology.
     * 
     * @param taskEstimationUsed
     */
    public void setTaskEstimationUsed(java.lang.String taskEstimationUsed) {
        this.taskEstimationUsed = taskEstimationUsed;
    }


    /**
     * Gets the requestEstimationRequired value for this Methodology.
     * 
     * @return requestEstimationRequired
     */
    public java.lang.String getRequestEstimationRequired() {
        return requestEstimationRequired;
    }


    /**
     * Sets the requestEstimationRequired value for this Methodology.
     * 
     * @param requestEstimationRequired
     */
    public void setRequestEstimationRequired(java.lang.String requestEstimationRequired) {
        this.requestEstimationRequired = requestEstimationRequired;
    }


    /**
     * Gets the isTimesheetsAreApproved value for this Methodology.
     * 
     * @return isTimesheetsAreApproved
     */
    public java.lang.String getIsTimesheetsAreApproved() {
        return isTimesheetsAreApproved;
    }


    /**
     * Sets the isTimesheetsAreApproved value for this Methodology.
     * 
     * @param isTimesheetsAreApproved
     */
    public void setIsTimesheetsAreApproved(java.lang.String isTimesheetsAreApproved) {
        this.isTimesheetsAreApproved = isTimesheetsAreApproved;
    }


    /**
     * Gets the isReportsOnActivities value for this Methodology.
     * 
     * @return isReportsOnActivities
     */
    public java.lang.String getIsReportsOnActivities() {
        return isReportsOnActivities;
    }


    /**
     * Sets the isReportsOnActivities value for this Methodology.
     * 
     * @param isReportsOnActivities
     */
    public void setIsReportsOnActivities(java.lang.String isReportsOnActivities) {
        this.isReportsOnActivities = isReportsOnActivities;
    }


    /**
     * Gets the isParticipantsTakeTasks value for this Methodology.
     * 
     * @return isParticipantsTakeTasks
     */
    public java.lang.String getIsParticipantsTakeTasks() {
        return isParticipantsTakeTasks;
    }


    /**
     * Sets the isParticipantsTakeTasks value for this Methodology.
     * 
     * @param isParticipantsTakeTasks
     */
    public void setIsParticipantsTakeTasks(java.lang.String isParticipantsTakeTasks) {
        this.isParticipantsTakeTasks = isParticipantsTakeTasks;
    }


    /**
     * Gets the isKnowledgeUsed value for this Methodology.
     * 
     * @return isKnowledgeUsed
     */
    public java.lang.String getIsKnowledgeUsed() {
        return isKnowledgeUsed;
    }


    /**
     * Sets the isKnowledgeUsed value for this Methodology.
     * 
     * @param isKnowledgeUsed
     */
    public void setIsKnowledgeUsed(java.lang.String isKnowledgeUsed) {
        this.isKnowledgeUsed = isKnowledgeUsed;
    }


    /**
     * Gets the isDeadlineUsed value for this Methodology.
     * 
     * @return isDeadlineUsed
     */
    public java.lang.String getIsDeadlineUsed() {
        return isDeadlineUsed;
    }


    /**
     * Sets the isDeadlineUsed value for this Methodology.
     * 
     * @param isDeadlineUsed
     */
    public void setIsDeadlineUsed(java.lang.String isDeadlineUsed) {
        this.isDeadlineUsed = isDeadlineUsed;
    }


    /**
     * Gets the isTasksDepend value for this Methodology.
     * 
     * @return isTasksDepend
     */
    public java.lang.String getIsTasksDepend() {
        return isTasksDepend;
    }


    /**
     * Sets the isTasksDepend value for this Methodology.
     * 
     * @param isTasksDepend
     */
    public void setIsTasksDepend(java.lang.String isTasksDepend) {
        this.isTasksDepend = isTasksDepend;
    }


    /**
     * Gets the isCrossChecking value for this Methodology.
     * 
     * @return isCrossChecking
     */
    public java.lang.String getIsCrossChecking() {
        return isCrossChecking;
    }


    /**
     * Sets the isCrossChecking value for this Methodology.
     * 
     * @param isCrossChecking
     */
    public void setIsCrossChecking(java.lang.String isCrossChecking) {
        this.isCrossChecking = isCrossChecking;
    }


    /**
     * Gets the verificationTime value for this Methodology.
     * 
     * @return verificationTime
     */
    public int getVerificationTime() {
        return verificationTime;
    }


    /**
     * Sets the verificationTime value for this Methodology.
     * 
     * @param verificationTime
     */
    public void setVerificationTime(int verificationTime) {
        this.verificationTime = verificationTime;
    }


    /**
     * Gets the isUserInProject value for this Methodology.
     * 
     * @return isUserInProject
     */
    public java.lang.String getIsUserInProject() {
        return isUserInProject;
    }


    /**
     * Sets the isUserInProject value for this Methodology.
     * 
     * @param isUserInProject
     */
    public void setIsUserInProject(java.lang.String isUserInProject) {
        this.isUserInProject = isUserInProject;
    }


    /**
     * Gets the customerAcceptsIssues value for this Methodology.
     * 
     * @return customerAcceptsIssues
     */
    public java.lang.String getCustomerAcceptsIssues() {
        return customerAcceptsIssues;
    }


    /**
     * Sets the customerAcceptsIssues value for this Methodology.
     * 
     * @param customerAcceptsIssues
     */
    public void setCustomerAcceptsIssues(java.lang.String customerAcceptsIssues) {
        this.customerAcceptsIssues = customerAcceptsIssues;
    }


    /**
     * Gets the isKanbanUsed value for this Methodology.
     * 
     * @return isKanbanUsed
     */
    public java.lang.String getIsKanbanUsed() {
        return isKanbanUsed;
    }


    /**
     * Sets the isKanbanUsed value for this Methodology.
     * 
     * @param isKanbanUsed
     */
    public void setIsKanbanUsed(java.lang.String isKanbanUsed) {
        this.isKanbanUsed = isKanbanUsed;
    }


    /**
     * Gets the recordCreated value for this Methodology.
     * 
     * @return recordCreated
     */
    public java.util.Calendar getRecordCreated() {
        return recordCreated;
    }


    /**
     * Sets the recordCreated value for this Methodology.
     * 
     * @param recordCreated
     */
    public void setRecordCreated(java.util.Calendar recordCreated) {
        this.recordCreated = recordCreated;
    }


    /**
     * Gets the recordModified value for this Methodology.
     * 
     * @return recordModified
     */
    public java.util.Calendar getRecordModified() {
        return recordModified;
    }


    /**
     * Sets the recordModified value for this Methodology.
     * 
     * @param recordModified
     */
    public void setRecordModified(java.util.Calendar recordModified) {
        this.recordModified = recordModified;
    }


    /**
     * Gets the id value for this Methodology.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Methodology.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the className value for this Methodology.
     * 
     * @return className
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this Methodology.
     * 
     * @param className
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the recordVersion value for this Methodology.
     * 
     * @return recordVersion
     */
    public int getRecordVersion() {
        return recordVersion;
    }


    /**
     * Sets the recordVersion value for this Methodology.
     * 
     * @param recordVersion
     */
    public void setRecordVersion(int recordVersion) {
        this.recordVersion = recordVersion;
    }


    /**
     * Gets the url value for this Methodology.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Methodology.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Methodology)) return false;
        Methodology other = (Methodology) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isPlanningUsed==null && other.getIsPlanningUsed()==null) || 
             (this.isPlanningUsed!=null &&
              this.isPlanningUsed.equals(other.getIsPlanningUsed()))) &&
            ((this.isTasks==null && other.getIsTasks()==null) || 
             (this.isTasks!=null &&
              this.isTasks.equals(other.getIsTasks()))) &&
            ((this.isReleasesUsed==null && other.getIsReleasesUsed()==null) || 
             (this.isReleasesUsed!=null &&
              this.isReleasesUsed.equals(other.getIsReleasesUsed()))) &&
            ((this.isFixedRelease==null && other.getIsFixedRelease()==null) || 
             (this.isFixedRelease!=null &&
              this.isFixedRelease.equals(other.getIsFixedRelease()))) &&
            this.releaseDuration == other.getReleaseDuration() &&
            ((this.hasMilestones==null && other.getHasMilestones()==null) || 
             (this.hasMilestones!=null &&
              this.hasMilestones.equals(other.getHasMilestones()))) &&
            ((this.isVersionsUsed==null && other.getIsVersionsUsed()==null) || 
             (this.isVersionsUsed!=null &&
              this.isVersionsUsed.equals(other.getIsVersionsUsed()))) &&
            ((this.metricsType==null && other.getMetricsType()==null) || 
             (this.metricsType!=null &&
              this.metricsType.equals(other.getMetricsType()))) &&
            ((this.useScrums==null && other.getUseScrums()==null) || 
             (this.useScrums!=null &&
              this.useScrums.equals(other.getUseScrums()))) &&
            ((this.isDesign==null && other.getIsDesign()==null) || 
             (this.isDesign!=null &&
              this.isDesign.equals(other.getIsDesign()))) &&
            ((this.isRequirements==null && other.getIsRequirements()==null) || 
             (this.isRequirements!=null &&
              this.isRequirements.equals(other.getIsRequirements()))) &&
            ((this.isIncidentsUsed==null && other.getIsIncidentsUsed()==null) || 
             (this.isIncidentsUsed!=null &&
              this.isIncidentsUsed.equals(other.getIsIncidentsUsed()))) &&
            ((this.isTests==null && other.getIsTests()==null) || 
             (this.isTests!=null &&
              this.isTests.equals(other.getIsTests()))) &&
            this.project == other.getProject() &&
            ((this.isHelps==null && other.getIsHelps()==null) || 
             (this.isHelps!=null &&
              this.isHelps.equals(other.getIsHelps()))) &&
            ((this.isRequestOrderUsed==null && other.getIsRequestOrderUsed()==null) || 
             (this.isRequestOrderUsed!=null &&
              this.isRequestOrderUsed.equals(other.getIsRequestOrderUsed()))) &&
            ((this.requestApproveRequired==null && other.getRequestApproveRequired()==null) || 
             (this.requestApproveRequired!=null &&
              this.requestApproveRequired.equals(other.getRequestApproveRequired()))) &&
            ((this.isResponsibleForIssue==null && other.getIsResponsibleForIssue()==null) || 
             (this.isResponsibleForIssue!=null &&
              this.isResponsibleForIssue.equals(other.getIsResponsibleForIssue()))) &&
            ((this.useFunctionalDecomposition==null && other.getUseFunctionalDecomposition()==null) || 
             (this.useFunctionalDecomposition!=null &&
              this.useFunctionalDecomposition.equals(other.getUseFunctionalDecomposition()))) &&
            ((this.isResponsibleForFunctions==null && other.getIsResponsibleForFunctions()==null) || 
             (this.isResponsibleForFunctions!=null &&
              this.isResponsibleForFunctions.equals(other.getIsResponsibleForFunctions()))) &&
            ((this.useEnvironments==null && other.getUseEnvironments()==null) || 
             (this.useEnvironments!=null &&
              this.useEnvironments.equals(other.getUseEnvironments()))) &&
            ((this.isSubversionUsed==null && other.getIsSubversionUsed()==null) || 
             (this.isSubversionUsed!=null &&
              this.isSubversionUsed.equals(other.getIsSubversionUsed()))) &&
            ((this.isFileServer==null && other.getIsFileServer()==null) || 
             (this.isFileServer!=null &&
              this.isFileServer.equals(other.getIsFileServer()))) &&
            ((this.isHighTolerance==null && other.getIsHighTolerance()==null) || 
             (this.isHighTolerance!=null &&
              this.isHighTolerance.equals(other.getIsHighTolerance()))) &&
            ((this.taskEstimationUsed==null && other.getTaskEstimationUsed()==null) || 
             (this.taskEstimationUsed!=null &&
              this.taskEstimationUsed.equals(other.getTaskEstimationUsed()))) &&
            ((this.requestEstimationRequired==null && other.getRequestEstimationRequired()==null) || 
             (this.requestEstimationRequired!=null &&
              this.requestEstimationRequired.equals(other.getRequestEstimationRequired()))) &&
            ((this.isTimesheetsAreApproved==null && other.getIsTimesheetsAreApproved()==null) || 
             (this.isTimesheetsAreApproved!=null &&
              this.isTimesheetsAreApproved.equals(other.getIsTimesheetsAreApproved()))) &&
            ((this.isReportsOnActivities==null && other.getIsReportsOnActivities()==null) || 
             (this.isReportsOnActivities!=null &&
              this.isReportsOnActivities.equals(other.getIsReportsOnActivities()))) &&
            ((this.isParticipantsTakeTasks==null && other.getIsParticipantsTakeTasks()==null) || 
             (this.isParticipantsTakeTasks!=null &&
              this.isParticipantsTakeTasks.equals(other.getIsParticipantsTakeTasks()))) &&
            ((this.isKnowledgeUsed==null && other.getIsKnowledgeUsed()==null) || 
             (this.isKnowledgeUsed!=null &&
              this.isKnowledgeUsed.equals(other.getIsKnowledgeUsed()))) &&
            ((this.isDeadlineUsed==null && other.getIsDeadlineUsed()==null) || 
             (this.isDeadlineUsed!=null &&
              this.isDeadlineUsed.equals(other.getIsDeadlineUsed()))) &&
            ((this.isTasksDepend==null && other.getIsTasksDepend()==null) || 
             (this.isTasksDepend!=null &&
              this.isTasksDepend.equals(other.getIsTasksDepend()))) &&
            ((this.isCrossChecking==null && other.getIsCrossChecking()==null) || 
             (this.isCrossChecking!=null &&
              this.isCrossChecking.equals(other.getIsCrossChecking()))) &&
            this.verificationTime == other.getVerificationTime() &&
            ((this.isUserInProject==null && other.getIsUserInProject()==null) || 
             (this.isUserInProject!=null &&
              this.isUserInProject.equals(other.getIsUserInProject()))) &&
            ((this.customerAcceptsIssues==null && other.getCustomerAcceptsIssues()==null) || 
             (this.customerAcceptsIssues!=null &&
              this.customerAcceptsIssues.equals(other.getCustomerAcceptsIssues()))) &&
            ((this.isKanbanUsed==null && other.getIsKanbanUsed()==null) || 
             (this.isKanbanUsed!=null &&
              this.isKanbanUsed.equals(other.getIsKanbanUsed()))) &&
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
        if (getIsPlanningUsed() != null) {
            _hashCode += getIsPlanningUsed().hashCode();
        }
        if (getIsTasks() != null) {
            _hashCode += getIsTasks().hashCode();
        }
        if (getIsReleasesUsed() != null) {
            _hashCode += getIsReleasesUsed().hashCode();
        }
        if (getIsFixedRelease() != null) {
            _hashCode += getIsFixedRelease().hashCode();
        }
        _hashCode += getReleaseDuration();
        if (getHasMilestones() != null) {
            _hashCode += getHasMilestones().hashCode();
        }
        if (getIsVersionsUsed() != null) {
            _hashCode += getIsVersionsUsed().hashCode();
        }
        if (getMetricsType() != null) {
            _hashCode += getMetricsType().hashCode();
        }
        if (getUseScrums() != null) {
            _hashCode += getUseScrums().hashCode();
        }
        if (getIsDesign() != null) {
            _hashCode += getIsDesign().hashCode();
        }
        if (getIsRequirements() != null) {
            _hashCode += getIsRequirements().hashCode();
        }
        if (getIsIncidentsUsed() != null) {
            _hashCode += getIsIncidentsUsed().hashCode();
        }
        if (getIsTests() != null) {
            _hashCode += getIsTests().hashCode();
        }
        _hashCode += getProject();
        if (getIsHelps() != null) {
            _hashCode += getIsHelps().hashCode();
        }
        if (getIsRequestOrderUsed() != null) {
            _hashCode += getIsRequestOrderUsed().hashCode();
        }
        if (getRequestApproveRequired() != null) {
            _hashCode += getRequestApproveRequired().hashCode();
        }
        if (getIsResponsibleForIssue() != null) {
            _hashCode += getIsResponsibleForIssue().hashCode();
        }
        if (getUseFunctionalDecomposition() != null) {
            _hashCode += getUseFunctionalDecomposition().hashCode();
        }
        if (getIsResponsibleForFunctions() != null) {
            _hashCode += getIsResponsibleForFunctions().hashCode();
        }
        if (getUseEnvironments() != null) {
            _hashCode += getUseEnvironments().hashCode();
        }
        if (getIsSubversionUsed() != null) {
            _hashCode += getIsSubversionUsed().hashCode();
        }
        if (getIsFileServer() != null) {
            _hashCode += getIsFileServer().hashCode();
        }
        if (getIsHighTolerance() != null) {
            _hashCode += getIsHighTolerance().hashCode();
        }
        if (getTaskEstimationUsed() != null) {
            _hashCode += getTaskEstimationUsed().hashCode();
        }
        if (getRequestEstimationRequired() != null) {
            _hashCode += getRequestEstimationRequired().hashCode();
        }
        if (getIsTimesheetsAreApproved() != null) {
            _hashCode += getIsTimesheetsAreApproved().hashCode();
        }
        if (getIsReportsOnActivities() != null) {
            _hashCode += getIsReportsOnActivities().hashCode();
        }
        if (getIsParticipantsTakeTasks() != null) {
            _hashCode += getIsParticipantsTakeTasks().hashCode();
        }
        if (getIsKnowledgeUsed() != null) {
            _hashCode += getIsKnowledgeUsed().hashCode();
        }
        if (getIsDeadlineUsed() != null) {
            _hashCode += getIsDeadlineUsed().hashCode();
        }
        if (getIsTasksDepend() != null) {
            _hashCode += getIsTasksDepend().hashCode();
        }
        if (getIsCrossChecking() != null) {
            _hashCode += getIsCrossChecking().hashCode();
        }
        _hashCode += getVerificationTime();
        if (getIsUserInProject() != null) {
            _hashCode += getIsUserInProject().hashCode();
        }
        if (getCustomerAcceptsIssues() != null) {
            _hashCode += getCustomerAcceptsIssues().hashCode();
        }
        if (getIsKanbanUsed() != null) {
            _hashCode += getIsKanbanUsed().hashCode();
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
        new org.apache.axis.description.TypeDesc(Methodology.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("tns", "methodology"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPlanningUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPlanningUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReleasesUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsReleasesUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFixedRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsFixedRelease"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReleaseDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMilestones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasMilestones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVersionsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVersionsUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricsType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MetricsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useScrums");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseScrums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDesign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDesign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIncidentsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsIncidentsUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTests"));
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
        elemField.setFieldName("isHelps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHelps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequestOrderUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsRequestOrderUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestApproveRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestApproveRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResponsibleForIssue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsResponsibleForIssue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useFunctionalDecomposition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseFunctionalDecomposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isResponsibleForFunctions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsResponsibleForFunctions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useEnvironments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseEnvironments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubversionUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsSubversionUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFileServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsFileServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHighTolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHighTolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskEstimationUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskEstimationUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEstimationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestEstimationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTimesheetsAreApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTimesheetsAreApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReportsOnActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsReportsOnActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isParticipantsTakeTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsParticipantsTakeTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKnowledgeUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsKnowledgeUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeadlineUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDeadlineUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTasksDepend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTasksDepend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCrossChecking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsCrossChecking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VerificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUserInProject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsUserInProject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAcceptsIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerAcceptsIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKanbanUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsKanbanUsed"));
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
