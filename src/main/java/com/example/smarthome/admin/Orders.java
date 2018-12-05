package com.example.smarthome.admin;

public class Orders {
    private Integer id;

    private Integer userId;

    private Integer gtId;

    private Integer count;

    private Integer state;

    private Integer total;

    private Integer saddId;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSaddId() {
        return saddId;
    }

    public void setSaddId(Integer saddId) {
        this.saddId = saddId;
    }
}