package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class sgorderInfo implements Serializable {
    private Integer order_id;
    private Integer flight_id;

    public void setOrderID(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrderID() {
        return order_id;
    }

    public Integer getFlightID() {
        return flight_id;
    }

    public void setFlightID(Integer flight_id) {
        this.flight_id = flight_id;
    }
}
