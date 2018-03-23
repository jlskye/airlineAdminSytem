package com.example.mybatisdemo.entity;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;


public class Carrier implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private MultipartFile uploadfile ;
    private String carrier_name;
    private String carrier_id;
    private String landline;
    private String picpath;

    public MultipartFile getUploadfile() {
        return uploadfile;
    }
    public void setUploadfile(MultipartFile uploadfile) {
        this.uploadfile = uploadfile;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPicpath() {
        return picpath;
    }
    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }
    public String getCarrierName() {
        return carrier_name;
    }
    public void setCarrierName(String carrier_name) {
        this.carrier_name = carrier_name;
    }
    public String getCarrierId() {
        return carrier_id;
    }
    public void setCarrierId(String carrier_id) {
        this.carrier_id = carrier_id;
    }
    public String getLandline() {
        return landline;
    }
    public void setLandline(String landline) {
        this.landline = landline;
    }



}
