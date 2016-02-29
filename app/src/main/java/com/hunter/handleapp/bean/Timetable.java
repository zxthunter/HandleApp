package com.hunter.handleapp.bean;

/**
 * Created by zxt on 2016/2/25.
 */
public class Timetable {
    private String uid;
    private String examInstitution;
    private String roomName;
    private String roomCapacity;
    private String beginTime;
    private String endTime;

    public Timetable() {
    }

    public Timetable(String uid, String examInstitution, String roomName, String roomCapacity, String beginTime, String endTime) {
        this.uid = uid;
        this.examInstitution = examInstitution;
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getExamInstitution() {
        return examInstitution;
    }

    public void setExamInstitution(String examInstitution) {
        this.examInstitution = examInstitution;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(String roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
