package com.example.smarthome.admin;

public class GoodsType {
    private Integer id;

    private Integer goodsId;

    private String gtname;

    private Integer gtcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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