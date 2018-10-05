package com.xingkong.star.api.item.enums;

public enum ItemStatus {
    UP(0, "上架"),
    DOWN(1, "下架");

    private Integer code;

    private String msg;

    ItemStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
