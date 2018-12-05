package com.example.smarthome.admin;

public class GoodsType {
    private Integer id;

    private Integer goodId;

    private String gtname;

    private Integer gtcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname == null ? null : gtname.trim();
    }

    public Integer getGtcount() {
        return gtcount;
    }

    public void setGtcount(Integer gtcount) {
        this.gtcount = gtcount;
    }
}