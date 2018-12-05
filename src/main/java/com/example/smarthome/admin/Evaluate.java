package com.example.smarthome.admin;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer oriderId;

    private Integer star;

    private Date createtime;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOriderId() {
        return oriderId;
    }

    public void setOriderId(Integer oriderId) {
        this.oriderId = oriderId;
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
}