package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class mainorderInfo implements Serializable {

    private Integer order_id;
    private String user_phone;
    private Integer order_type;


    public Integer getOrderID() {
        return order_id;
    }
    public void setOrderID(Integer order_id) {
        this.order_id = order_id;
    }
    public String getUserPhone() {
        return user_phone;
    }
    public void setUserPhone(String user_phone) {
        this.user_phone = user_phone;
    }
    public Integer getOrderType() {
        return this.order_type;
    }
    public void setOrderType(Integer order_type) {
        this.order_type = order_type;
    }

}
