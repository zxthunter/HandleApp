package com.hunter.handleapp.bean;

import com.hunter.handleapp.constants.UrlConstant;

import java.lang.reflect.Constructor;

/**
 * Created by zxt on 2016/2/25.
 */
public class TaskSimple {
    private String uid;
    private String title;
    private String description;
    private String urlString;
    public TaskSimple(Institution institution){
        uid = institution.getUid();
        urlString = UrlConstant.INST_URL;
        title = "待审核机构审批";
        description = "名称:"+institution.getName()+" 负责人:"+institution.getPrincipal()+" 机构类型:"+institution.getType()+" 审核类型:"+institution.getApproveType();
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public TaskSimple(TrainPlan trainPlan){
        uid = trainPlan.getUid();
        urlString = UrlConstant.TP_URL;

        title = "待审核培训计划审批";
        description = "培训机构名称:"+trainPlan.getInstName()+" 名称:"+trainPlan.getName()+" 资格类型:"+trainPlan.getQualification()+" 考核性质:"+trainPlan.getAssessmentNature();
    }

    public TaskSimple(ExamPlan examPlan){
        uid = examPlan.getUid();
        urlString = UrlConstant.EP_URL;

        title = "待审核考试计划审批";
        description = "培训机构名称:"+examPlan.getInstName()+" 培训计划名称:"+examPlan.getTrainPlanName()+" 考试计划类型:"+examPlan.getType();
    }

    public TaskSimple(Achivement achivement){
        uid = achivement.getUid();
        urlString = UrlConstant.ACHIVEMENT_URL;

        title = "待审核操作证审批";
        description = "培训机构名称:"+achivement.getInstName()+" 培训计划名称:"+achivement.getTrainPlanName()+" 资格类型:"+achivement.getQualification()+" 考核性质:"+achivement.getAssessmentNature();
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
