package com.example.mybatisdemo.entity;

import java.io.Serializable;


public class Air implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String classifications ;
    private String cabin;
    private String assembly;
    private String description;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getClassifications() {
        return classifications;
    }
    public void setClassifications(String classifications) {
        this.classifications = classifications;
    }
    public String getCabin() {
        return cabin;
    }
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }
    public String getAssembly() {
        return assembly;
    }
    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}
