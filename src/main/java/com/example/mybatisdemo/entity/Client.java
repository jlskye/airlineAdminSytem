package com.example.mybatisdemo.entity;

import java.io.Serializable;


public class Client implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String user_name;
    private String user_phone;
    private String user_id;
    private String user_money;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return user_name;
    }
    public void setUserName(String user_name) {
        this.user_name = user_name;
    }
    public String getUserPhone() {
        return user_phone;
    }
    public void setUserPhone(String user_phone) {
        this.user_phone = user_phone;
    }
    public String getUserId() {
        return user_id;
    }
    public void setUserId(String user_id) {
        this.user_id = user_id;
    }
    public String getUserMoney() {
        return user_money;
    }
    public void setUserMoney(String user_money) {
        this.user_money = user_money;
    }



}
