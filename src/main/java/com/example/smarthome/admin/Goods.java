package com.example.smarthome.admin;

import java.util.Date;
import java.util.List;

public class Goods {
    private Integer id;

    private String goodsname;

    private Integer equId;

    private Date createtime;

    private Integer price;

    private String equname;

    private List<Photo> photos;

    private List<GoodsType> goodsTypes;

    public List<GoodsType> getGoodsTypes() {
        return goodsTypes;
    }

    public void setGoodsTypes(List<GoodsType> goodsTypes) {
        this.goodsTypes = goodsTypes;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public String getEquname() {
        return equname;
    }

    public void setEquname(String equname) {
        this.equname = equname;
    }



    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    private Equipment equ;

    private GoodsDetail goodsDetail;

    private GoodsType goodsType;

    public Equipment getEqu() {
        return equ;
    }

    public void setEqu(Equipment equ) {
        this.equ = equ;
    }

    public GoodsDetail getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(GoodsDetail goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getEquId() {
        return equId;
    }

    public void setEquId(Integer equId) {
        this.equId = equId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}