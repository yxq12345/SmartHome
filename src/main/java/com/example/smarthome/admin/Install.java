package com.example.smarthome.admin;

import java.util.Date;

public class Install {
    private Integer id;

    private Integer orderId;

    private Integer saddId;

    private String servertime;

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

    public Integer getSaddId() {
        return saddId;
    }

    public void setSaddId(Integer saddId) {
        this.saddId = saddId;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime == null ? null : servertime.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}