package com.xingkong.star.base.model;

public class PlainResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public PlainResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public PlainResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}

