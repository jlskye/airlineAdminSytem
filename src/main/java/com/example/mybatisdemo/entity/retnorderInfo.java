package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class retnorderInfo implements Serializable{
    private Integer order_id;
    private Integer order_code;
    private Integer flight_id;

    public Integer getOrderID() {
        return order_id;
    }

    public void setOrderID(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrderCode() {
        return order_code;
    }

    public void setOrderCode(Integer order_code) {
        this.order_code = order_code;
    }

    public Integer getFlightID() {
        return flight_id;
    }

    public void setFlightID(Integer flight_id) {
        this.flight_id = flight_id;
    }
}
