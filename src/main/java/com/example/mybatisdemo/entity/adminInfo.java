package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class adminInfo implements Serializable{

    private Integer admin_id;
    private String admin_acount;
    private String admin_pwd;
    private String admin_perm;


    public void setAdminAcount(String adminAcount) {
        this.admin_acount = adminAcount;
        System.out.print(adminAcount);
    }
    public String getAdminAcount() {
        return this.admin_acount;
    }
    public void setAdminPwd(String adminPwd) {
        this.admin_pwd = adminPwd;
    }

    public String getAdminPwd() {
        return admin_pwd;
    }
    public void setAdminPerm(String adminPerm) {
        this.admin_perm = adminPerm;
    }

    public String getAdminPerm() {
        return this.admin_perm;
    }

    public Integer getAdminID() {
        return admin_id;
    }

    public void setAdminID(Integer admin_id) {
        this.admin_id = admin_id;
    }
}

