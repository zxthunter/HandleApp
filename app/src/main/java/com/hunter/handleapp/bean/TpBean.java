package com.hunter.handleapp.bean;

import java.util.ArrayList;

/**
 * Created by zxt on 2016/2/25.
 */
public class TpBean {
    private Boolean success;
    private Boolean authorized;
    private ArrayList<TrainPlan> plans;

    public TpBean() {
    }

    public TpBean(Boolean success, Boolean authorized, ArrayList<TrainPlan> plans) {
        this.success = success;
        this.authorized = authorized;
        this.plans = plans;
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

    public ArrayList<TrainPlan> getPlans() {
        return plans;
    }

    public void setPlans(ArrayList<TrainPlan> plans) {
        this.plans = plans;
    }
}
