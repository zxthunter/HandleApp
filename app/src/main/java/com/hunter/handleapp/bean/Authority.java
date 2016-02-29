package com.hunter.handleapp.bean;

/**
 * Created by zxt on 2016/2/24.
 */
public class Authority {
    private Boolean success;
    private Boolean authorized;

    public Authority() {
    }

    public Authority(Boolean success, Boolean authorized) {
        this.success = success;
        this.authorized = authorized;
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
}
