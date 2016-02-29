package com.hunter.handleapp.bean;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/27.
 */
public class AchivementBean {
    private Boolean success;
    private Boolean authorized;
    private ArrayList<Achivement> achivements;

    public AchivementBean() {
    }

    public AchivementBean(Boolean success, Boolean authorized, ArrayList<Achivement> achivements) {
        this.success = success;
        this.authorized = authorized;
        this.achivements = achivements;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public ArrayList<Achivement> getAchivements() {
        return achivements;
    }

    public void setAchivements(ArrayList<Achivement> achivements) {
        this.achivements = achivements;
    }
}
