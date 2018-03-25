package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class flightUniInfo implements Serializable{
    private Integer flight_id;
    private String flight_no;
    private String dep_date;
    private String arr_date;

    public void setFlightID(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getFlightID() {
        return flight_id;
    }

    public void setFlightNo(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getFlightNo() {
        return flight_no;
    }

    public void setDepDate(String dep_date) {
        this.dep_date = dep_date;
    }

    public String getDepDate() {
        return dep_date;
    }

    public void setArrDate(String arr_date) {
        this.arr_date = arr_date;
    }

    public String getArrDate() {
        return arr_date;
    }
}
