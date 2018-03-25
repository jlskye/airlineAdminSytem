package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class psgInfo implements Serializable {
    private Integer order_id;
    private String psg_id;
    private String psg_name;
    private String psg_phone;
    private Integer psg_type;
    private Integer go_seat_type;
    private Integer back_seat_type;
    private Integer go_seat_price;
    private Integer back_seat_price;

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setPsg_id(String psg_id) {
        this.psg_id = psg_id;
    }

    public String getPsg_id() {
        return psg_id;
    }

    public void setPsg_name(String psg_name) {
        this.psg_name = psg_name;
    }

    public String getPsg_name() {
        return psg_name;
    }

    public void setPsg_phone(String psg_phone) {
        this.psg_phone = psg_phone;
    }

    public String getPsg_phone() {
        return psg_phone;
    }

    public void setPsg_type(Integer psg_type) {
        this.psg_type = psg_type;
    }

    public Integer getPsg_type() {
        return psg_type;
    }

    public void setGo_seat_type(Integer go_seat_type) {
        this.go_seat_type = go_seat_type;
    }

    public Integer getGo_seat_type() {
        return go_seat_type;
    }

    public void setGo_seat_price(Integer go_seat_price) {
        this.go_seat_price = go_seat_price;
    }

    public Integer getGo_seat_price() {
        return go_seat_price;
    }

    public void setBack_seat_type(Integer back_seat_type) {
        this.back_seat_type = back_seat_type;
    }

    public Integer getBack_seat_type() {
        return back_seat_type;
    }

    public void setBack_seat_price(Integer back_seat_price) {
        this.back_seat_price = back_seat_price;
    }

    public Integer getBack_seat_price() {
        return back_seat_price;
    }
}

