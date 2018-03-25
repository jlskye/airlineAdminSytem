package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class airInfo implements Serializable {
    private String flight_no;
    private String carrier_no;
    private String air_name;
    private String air_amount;

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getAir_amount() {
        return air_amount;
    }

    public void setAir_amount(String air_amount) {
        this.air_amount = air_amount;
    }

    public String getAir_name() {
        return air_name;
    }

    public void setAir_name(String air_name) {
        this.air_name = air_name;
    }

    public String getCarrier_no() {
        return carrier_no;
    }

    public void setCarrier_no(String carrier_no) {
        this.carrier_no = carrier_no;
    }
}
