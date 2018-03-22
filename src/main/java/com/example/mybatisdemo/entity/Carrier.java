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
    private String cname;
    private String code;
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
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLandline() {
        return landline;
    }
    public void setLandline(String landline) {
        this.landline = landline;
    }



}
