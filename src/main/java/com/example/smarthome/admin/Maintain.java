package com.example.smarthome.admin;

import java.util.Date;

public class Maintain {
    private Integer id;

    private Integer orderId;

    private String breakdown;

    private String servertime;

    private String info;

    private Integer saddId;

    private Date createtime;

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

    public String getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(String breakdown) {
        this.breakdown = breakdown == null ? null : breakdown.trim();
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime == null ? null : servertime.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getSaddId() {
        return saddId;
    }

    public void setSaddId(Integer saddId) {
        this.saddId = saddId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}