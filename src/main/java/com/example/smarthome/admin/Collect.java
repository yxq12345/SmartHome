package com.example.smarthome.admin;

import java.util.Date;

public class Collect {
    private Integer id;

    private Integer userId;

    private Integer gtId;

    private Date caretetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public Date getCaretetime() {
        return caretetime;
    }

    public void setCaretetime(Date caretetime) {
        this.caretetime = caretetime;
    }
}