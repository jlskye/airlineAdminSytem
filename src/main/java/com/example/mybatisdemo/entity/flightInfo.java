package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class flightInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer flight_id;
    private Integer flight_rid;
    private String flight_no;
    private String dep_time;
    private String arr_time;
    private String dep_airport;
    private String dep_city;
    private String arr_airport;
    private String arr_city;
    private String carrier_id;
    private String air_name;
    private Integer seat_amount;
    private String carrier_name;

    public Integer getFlightID() {
        return flight_id;
    }

    public void setFlightID(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getFlight_rid() {
        return flight_rid;
    }

    public void setFlight_rid(Integer flight_rid) {
        this.flight_rid = flight_rid;
    }

    public String getFlightNo() {
        return flight_no;
    }

    public void setFlightNo(String flight_no) {
        if(this.flight_no ==null){
            this.flight_no = flight_no;
        }
        else{
            this.flight_no = this.flight_no + "/" +flight_no;
        }
    }


    public String getDepTime() {
        return dep_time;
    }

    public void setDepTime(String dep_time) {
        if(this.dep_time == null){
            this.dep_time = dep_time;
        }
        else{
            this.dep_time = this.dep_time + "/" + dep_time;
        }
    }

    public String getArrTime() {
        return arr_time;
    }

    public void setArrTime(String arr_time) {
        if(this.arr_time == null){
            this.arr_time = arr_time;
        }
        else{
            this.arr_time = this.arr_time + "/" + arr_time;
        }
    }



    public void setDepCity(String dep_city) {
        if(this.dep_city == null){
            this.dep_city = dep_city;
        }
        else{
            this.dep_city = this.dep_city + "/" +dep_city;
        }
    }

    public String getDepCity() {
        return dep_city;
    }

    public void setArrCity(String arr_city) {
        if(this.arr_city == null){
            this.arr_city = arr_city;
        }
        else{
            this.arr_city = this.arr_city + "/" + arr_city;
        }
    }

    public String getArrCity() {
        return arr_city;
    }

    public String getDepAirport() {
        return dep_airport;
    }

    public void setDepAirport(String dep_airport) {
        if(this.dep_airport == null){
            this.dep_airport = dep_airport;
        }
        else{
            this.dep_airport = this.dep_airport + "/" + dep_airport;
        }
    }

    public void setArrAirport(String arr_airport) {
        if(this.arr_airport == null){
            this.arr_airport = arr_airport;
        }
        else{
            this.arr_airport = this.arr_airport + "/" +arr_airport;
        }
    }

    public String getArrAirport() {
        return arr_airport;
    }

    public void setCarrierID(String carrier_id) {
        this.carrier_id = carrier_id;
    }

    public String getCarrierID() {
        return carrier_id;
    }

    public void setSeatAmount(Integer seat_amount) {
        this.seat_amount = seat_amount;
    }

    public Integer getSeatAmount() {
        return seat_amount;
    }

    public void setAirName(String air_name) {
        this.air_name = air_name;
    }

    public String getAirName() {
        return air_name;
    }

    public String getCarrier_name() {
        return carrier_name;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }
}
