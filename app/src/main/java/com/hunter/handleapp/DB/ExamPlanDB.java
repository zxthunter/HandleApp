package com.hunter.handleapp.DB;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.Gson;
import com.hunter.handleapp.bean.ExamPlan;
import com.hunter.handleapp.bean.Institution;
import com.hunter.handleapp.bean.Timetable;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
@Table(name = "ExamPlan")
public class ExamPlanDB extends Model{
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
    @Column(name = "type")
    private String type;
    @Column(name = "examBeginDate")
    private String examBeginDate;
    @Column(name = "examEndDate")
    private String examEndDate;
    @Column(name = "examLimit")
    private String examLimit;
    @Column(name = "allowExamTimes")
    private String allowExamTimes;
    @Column(name = "paperForm")
    private String paperForm;
    @Column(name = "timetables")
    private String timetables;

    public ExamPlanDB() {
    }

    public ExamPlanDB(String uid, String instName, String trainPlanName, String trainBeginDate, String trainEndDate, String type, String examBeginDate, String examEndDate, String examLimit, String allowExamTimes, String paperForm, String timetables) {
        this.uid = uid;
        this.instName = instName;
        this.trainPlanName = trainPlanName;
        this.trainBeginDate = trainBeginDate;
        this.trainEndDate = trainEndDate;
        this.type = type;
        this.examBeginDate = examBeginDate;
        this.examEndDate = examEndDate;
        this.examLimit = examLimit;
        this.allowExamTimes = allowExamTimes;
        this.paperForm = paperForm;
        this.timetables = timetables;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExamBeginDate() {
        return examBeginDate;
    }

    public void setExamBeginDate(String examBeginDate) {
        this.examBeginDate = examBeginDate;
    }

    public String getExamEndDate() {
        return examEndDate;
    }

    public void setExamEndDate(String examEndDate) {
        this.examEndDate = examEndDate;
    }

    public String getExamLimit() {
        return examLimit;
    }

    public void setExamLimit(String examLimit) {
        this.examLimit = examLimit;
    }

    public String getAllowExamTimes() {
        return allowExamTimes;
    }

    public void setAllowExamTimes(String allowExamTimes) {
        this.allowExamTimes = allowExamTimes;
    }

    public String getPaperForm() {
        return paperForm;
    }

    public void setPaperForm(String paperForm) {
        this.paperForm = paperForm;
    }

    public String getTimetables() {
        return timetables;
    }

    public void setTimetables(String timetables) {
        this.timetables = timetables;
    }

    public ExamPlanDB(ExamPlan examPlan) {
        uid = examPlan.getUid();
        instName = examPlan.getInstName();
        trainPlanName = examPlan.getTrainPlanName();
        trainBeginDate = examPlan.getTrainBeginDate();
        trainEndDate = examPlan.getTrainEndDate();
        type = examPlan.getType();
        examBeginDate = examPlan.getExamBeginDate();
        examEndDate = examPlan.getExamEndDate();
        examLimit = examPlan.getExamLimit();
        allowExamTimes = examPlan.getAllowExamTimes();
        paperForm = examPlan.getPaperForm();
        timetables = new Gson().toJson(examPlan.getTimetables());
    }


}
