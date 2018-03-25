package com.example.mybatisdemo.entity;

import java.io.Serializable;

public class orderInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer order_id;
    private Integer orderID;
    private String user_phone;
    private Integer order_type;  //1,2
    private String order_Type;   //单程，往返
    private Integer flight_id;
    private Integer flight_rid;
    private String flight_no;
    private Integer order_code;
    private String dep_time;
    private String arr_time;
    private String dep_city;
    private String arr_city;
    private String dep_airport;
    private String arr_airport;
    private String dep_date;
    private String arr_date;
    private String seat_type;

    private String psg_type;
    private String psg_name;

    private String carrier_id;
    private String carrier_name;

    public Integer getOrderID() {
        return order_id;
    }
    public void setOrderID(Integer order_id) {
        this.order_id = order_id;
        this.orderID = order_id;
    }

    public Integer getOrderType() {
        return order_type;
    }

    public void setOrderType(Integer order_type) {
        this.order_type = order_type;
    }

    public String getOrder_Type() {
        if(order_type == 1){
            return "单程";
        }
        else if(order_type ==2){
            return "往返";
        }
        else{
            return "未设定";
        }
    }

    public void setOrder_Type(String order_Type) {
        this.order_Type = order_Type;
    }

    public String getUserPhone() {
        return user_phone;
    }
    public void setUserPhone(String user_phone) {
        this.user_phone = user_phone;
    }

    public Integer getFlightid() {
        return flight_id;
    }
    public void setFlightID(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Integer getFlightRId() {
        return flight_rid;
    }

    public void setFlightRId(Integer flight_rid) {
        this.flight_rid = flight_rid;
    }

    public String getOrderCode() {
        if(order_code == 1){
            return "去程";
        }
        else if(order_code ==2){
            return "返程";
        }
        else{
            return "未设定";
        }
    }

    public void setOrderCode(Integer order_code) {
        this.order_code = order_code;
    }

    public String getDep_date() {
        return dep_date;
    }

    public void setDep_date(String dep_date) {
        this.dep_date = dep_date;


    }

    public String getArr_date() {
        return arr_date;
    }

    public void setArr_date(String arr_date) {

        this.arr_date = arr_date;

    }
    public String getDepTime() {
        return dep_time;
    }

    public void setDepTime(String dep_time) {
        if(this.dep_time == null){
            this.dep_time = this.dep_date +" " + dep_time;
        }
        else{
            this.dep_time = this.dep_time + "|" + this.dep_date +" "+ dep_time;
        }
    }

    public String getArrTime() {
        return arr_time;
    }

    public void setArrTime(String arr_time) {
        if(this.arr_time == null){
            this.arr_time = this.arr_date+ " " +arr_time;
        }
        else{
            this.arr_time = this.arr_time + "|" + this.arr_date + " "+ arr_time;
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

    public String getPsg_type() {
        return psg_type;
    }

    public void setPsg_type(Integer psg_type) {
        if(psg_type == 1){
            this.psg_type = "成人";
        }
        else if(psg_type == 2){
            this.psg_type = "儿童";
        }
        else{
            this.psg_type = "婴儿";
        }
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        if(this.flight_no ==null){
            this.flight_no = flight_no;
        }
        else{
            this.flight_no = this.flight_no + "/" +flight_no;
        }
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



    public String getCarrierId() {
        return carrier_id;
    }

    public void setCarrierId(String carrier_id) {
        if(this.carrier_id == null){
            this.carrier_id = carrier_id;
        }
        else{
            this.carrier_id = this.carrier_id + "/" +carrier_id;
        }
    }

    public String getCarrierName() {
        return carrier_name;
    }

    public void setCarrierName(String carrier_name) {
        if(this.carrier_name == null){
            this.carrier_name = carrier_name;
        }
        else {
            this.carrier_name = this.carrier_name + "/" + carrier_name;
        }
    }

    public void setPsg_name(String psg_name) {
        this.psg_name = psg_name;
    }

    public String getPsg_name() {
        return psg_name;
    }

}
