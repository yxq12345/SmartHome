package com.example.smarthome.admin;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer orderId;

    private Integer star;

    private Date createtime;

    private String info;

    private User user;

    private Orders orders;

    private Goods goods;

    private GoodsType goodsType;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", star=" + star +
                ", createtime=" + createtime +
                ", info='" + info + '\'' +
                ", user=" + user +
                ", orders=" + orders +
                ", goods=" + goods +
                ", goodsType=" + goodsType +
                '}';
    }
}