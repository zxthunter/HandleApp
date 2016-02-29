package com.hunter.handleapp.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

/**
 * Created by zxt on 2016/2/25.
 */
@Table(name = "Curriculum")
public class Curriculum {
    private String uid;
    private String beginDate;
    private String endDate;
    private String content;
    private String hours;
    private String teacher;

    public Curriculum() {
    }

    public Curriculum(String uid, String beginDate, String endDate, String content, String hours, String teacher) {
        this.uid = uid;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.content = content;
        this.hours = hours;
        this.teacher = teacher;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
