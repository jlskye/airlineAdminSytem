package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class carrierInfo implements Serializable {

    private String carrier_id;
    private String carrier_name;
    private String carrier_telephone;
    private String carrier_address;

    public String getCarrierID() {
        return carrier_id;
    }

    public void setCarrierID(String carrier_id) {
        this.carrier_id = carrier_id;
    }

    public String getCarrierName() {
        return carrier_name;
    }

    public void setCarrierName(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public String getCarrierTele() {
        return carrier_telephone;
    }

    public void setCarrierTele(String carrier_telephone) {
        this.carrier_telephone = carrier_telephone;
    }

    public String getCarrierAdd() {
        return carrier_address;
    }

    public void setCarrierAdd(String carrierAdd) {
        this.carrier_address = carrier_address;
    }
}
