package com.example.studentcomplaintservice.bean;

public class Response {
    Object object;
    Integer status;

    public Response(Object object, Integer status) {
        this.object = object;
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
