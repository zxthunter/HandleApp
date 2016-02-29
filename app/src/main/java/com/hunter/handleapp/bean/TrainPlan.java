package com.hunter.handleapp.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
@Table(name = "TrainPlan")
public class TrainPlan {
    @Column(name = "uid")
    private String uid;
    @Column(name = "instName")
    private String instName;
    @Column(name = "name")
    private String name;
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
    @Column(name = "year")
    private String year;
    @Column(name = "stage")
    private String stage;
    @Column(name = "trainLimit")
    private String trainLimit;
    @Column(name = "trainAddress")
    private String trainAddress;
    @Column(name = "trainBeginDate")
    private String trainBeginDate;
    @Column(name = "trainEndDate")
    private String trainEndDate;
    @Column(name = "trainHours")
    private String trainHours;
    @Column(name = "about")
    private String about;
    @Column(name = "contact")
    private String contact;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "curriculums")
    private ArrayList<Curriculum> curriculums;

    public TrainPlan() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getTrainLimit() {
        return trainLimit;
    }

    public void setTrainLimit(String trainLimit) {
        this.trainLimit = trainLimit;
    }

    public String getTrainAddress() {
        return trainAddress;
    }

    public void setTrainAddress(String trainAddress) {
        this.trainAddress = trainAddress;
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

    public String getTrainHours() {
        return trainHours;
    }

    public void setTrainHours(String trainHours) {
        this.trainHours = trainHours;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Curriculum> getCurriculums() {
        return curriculums;
    }

    public void setCurriculums(ArrayList<Curriculum> curriculums) {
        this.curriculums = curriculums;
    }

    public TrainPlan(String uid, String instName, String name, String qualification, String assessmentNature, String certificateType, String companyType, String workClass, String workItem, String year, String stage, String trainLimit, String trainAddress, String trainBeginDate, String trainEndDate, String trainHours, String about, String contact, String telephone, ArrayList<Curriculum> curriculums) {
        this.uid = uid;
        this.instName = instName;
        this.name = name;
        this.qualification = qualification;
        this.assessmentNature = assessmentNature;
        this.certificateType = certificateType;
        this.companyType = companyType;
        this.workClass = workClass;
        this.workItem = workItem;
        this.year = year;
        this.stage = stage;
        this.trainLimit = trainLimit;
        this.trainAddress = trainAddress;
        this.trainBeginDate = trainBeginDate;
        this.trainEndDate = trainEndDate;
        this.trainHours = trainHours;
        this.about = about;
        this.contact = contact;
        this.telephone = telephone;
        this.curriculums = curriculums;
    }
}
