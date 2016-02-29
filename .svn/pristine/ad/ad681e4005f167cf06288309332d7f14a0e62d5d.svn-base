package com.hunter.handleapp.DB;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.hunter.handleapp.bean.Institution;

/**
 * Created by zxt on 2016/2/24.
 */
@Table(name = "Institution")
public class InstitutionDB extends Model{
    @Column(name = "uid")
    private String uid;
    @Column(name = "type")
    private String type;
    @Column(name = "approveType")
    private String approveType;
    @Column(name = "name")
    private String name;
    @Column(name = "principal")
    private String principal;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "address")
    private String address;

    public InstitutionDB() {
    }

    public InstitutionDB(String uid, String type, String approveType, String name, String principal, String telephone, String mobile, String address) {
        this.uid = uid;
        this.type = type;
        this.approveType = approveType;
        this.name = name;
        this.principal = principal;
        this.telephone = telephone;
        this.mobile = mobile;
        this.address = address;
    }

    public InstitutionDB(Institution institution) {
        uid = institution.getUid();
        type = institution.getType();
        approveType = institution.getApproveType();
        name = institution.getName();
        principal = institution.getPrincipal();
        telephone = institution.getTelephone();
        mobile = institution.getMobile();
        address = institution.getAddress();
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApproveType() {
        return approveType;
    }

    public void setApproveType(String approveType) {
        this.approveType = approveType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
