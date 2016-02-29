package com.hunter.handleapp.DB;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.Gson;
import com.hunter.handleapp.bean.Achivement;
import com.hunter.handleapp.bean.CandidateProfile;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/27.
 */
@Table(name = "Achivement")
public class AchivementDB extends Model{
    @Column(name = "uid")
    private String uid;
    @Column(name = "instName")
    private String instName;
    @Column(name = "trainPlanName")
    private String trainPlanName;
    @Column(name = "trainBeginDate")
    private String trainBeginDate;
    @Column(name = "trainEndDate")
    private String trainEndDate;
    @Column(name = "candidateProfile")
    private String candidateProfile;
    @Column(name = "qualification")
    private String qualification;
    @Column(name = "assessmentNature")
    private String assessmentNature;
    @Column(name = "certificateType")
    private String certificateType;
    @Column(name = "companyType")
    private String companyType;
    @Column(name = "workClass")
    private String workClass;
    @Column(name = "workItem")
    private String workItem;
    @Column(name = "theoryExamScore")
    private String theoryExamScore;
    @Column(name = "theoryExamPassed")
    private String theoryExamPassed;
    @Column(name = "operationExamScore")
    private String operationExamScore;
    @Column(name = "operationExamPassed")
    private String operationExamPassed;

    public AchivementDB(Achivement achivement){
        uid = achivement.getUid();
        instName = achivement.getInstName();
        trainPlanName = achivement.getTrainPlanName();
        trainBeginDate = achivement.getTrainBeginDate();
        trainEndDate = achivement.getTrainEndDate();
        candidateProfile =  new Gson().toJson(achivement.getCandidateProfile());
        qualification = achivement.getQualification();
        assessmentNature = achivement.getAssessmentNature();
        certificateType = achivement.getCertificateType();
        companyType = achivement.getCompanyType();
        workClass = achivement.getWorkClass();
        workItem = achivement.getWorkItem();
        theoryExamScore = achivement.getTheoryExamScore();
        theoryExamPassed = achivement.getTheoryExamPassed();
        operationExamScore = achivement.getOperationExamScore();
        operationExamPassed = achivement.getOperationExamPassed();
    }

    public AchivementDB() {
    }

    public AchivementDB(String uid, String instName, String trainPlanName, String trainBeginDate, String trainEndDate, String candidateProfile, String qualification, String assessmentNature, String certificateType, String companyType, String workClass, String workItem, String theoryExamScore, String theoryExamPassed, String operationExamScore, String operationExamPassed) {
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

    public String getCandidateProfile() {
        return candidateProfile;
    }

    public void setCandidateProfile(String candidateProfile) {
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
