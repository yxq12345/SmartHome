package com.example.smarthome.admin;

public class Feature {
    private Integer id;

    private String featname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeatname() {
        return featname;
    }

    public void setFeatname(String featname) {
        this.featname = featname == null ? null : featname.trim();
    }
}