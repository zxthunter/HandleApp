package com.hunter.handleapp.bean;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/27.
 */
public class Achivement {
    private String uid;
    private String instName;
    private String trainPlanName;
    private String trainBeginDate;
    private String trainEndDate;
    private CandidateProfile candidateProfile;
    private String qualification;
    private String assessmentNature;
    private String certificateType;
    private String companyType;
    private String workClass;
    private String workItem;
    private String theoryExamScore;
    private String theoryExamPassed;
    private String operationExamScore;
    private String operationExamPassed;

    public Achivement() {
    }

    public Achivement(String uid, String instName, String trainPlanName, String trainBeginDate, String trainEndDate, CandidateProfile candidateProfile, String qualification, String assessmentNature, String certificateType, String companyType, String workClass, String workItem, String theoryExamScore, String theoryExamPassed, String operationExamScore, String operationExamPassed) {
        this.uid = uid;
        this.instName = instName;
        this.trainPlanName = trainPlanName;
        this.trainBeginDate = trainBeginDate;
        this.trainEndDate = trainEndDate;
        this.candidateProfile = candidateProfile;
        this.qualification = qualification;
        this.assessmentNature = assessmentNature;
        this.certificateType = certificateType;
        this.companyType = companyType;
        this.workClass = workClass;
        this.workItem = workItem;
        this.theoryExamScore = theoryExamScore;
        this.theoryExamPassed = theoryExamPassed;
        this.operationExamScore = operationExamScore;
        this.operationExamPassed = operationExamPassed;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getTrainPlanName() {
        return trainPlanName;
    }

    public void setTrainPlanName(String trainPlanName) {
        this.trainPlanName = trainPlanName;
    }

    public String getTrainBeginDate() {
        return trainBeginDate;
    }

    public void setTrainBeginDate(String trainBeginDate) {
        this.trainBeginDate = trainBeginDate;
    }

    public String getTrainEndDate() {
        return trainEndDate;
    }

    public void setTrainEndDate(String trainEndDate) {
        this.trainEndDate = trainEndDate;
    }

    public CandidateProfile getCandidateProfile() {
        return candidateProfile;
    }

    public void setCandidateProfile(CandidateProfile candidateProfile) {
        this.candidateProfile = candidateProfile;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAssessmentNature() {
        return assessmentNature;
    }

    public void setAssessmentNature(String assessmentNature) {
        this.assessmentNature = assessmentNature;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getWorkClass() {
        return workClass;
    }

    public void setWorkClass(String workClass) {
        this.workClass = workClass;
    }

    public String getWorkItem() {
        return workItem;
    }

    public void setWorkItem(String workItem) {
        this.workItem = workItem;
    }

    public String getTheoryExamScore() {
        return theoryExamScore;
    }

    public void setTheoryExamScore(String theoryExamScore) {
        this.theoryExamScore = theoryExamScore;
    }

    public String getTheoryExamPassed() {
        return theoryExamPassed;
    }

    public void setTheoryExamPassed(String theoryExamPassed) {
        this.theoryExamPassed = theoryExamPassed;
    }

    public String getOperationExamScore() {
        return operationExamScore;
    }

    public void setOperationExamScore(String operationExamScore) {
        this.operationExamScore = operationExamScore;
    }

    public String getOperationExamPassed() {
        return operationExamPassed;
    }

    public void setOperationExamPassed(String operationExamPassed) {
        this.operationExamPassed = operationExamPassed;
    }
}
