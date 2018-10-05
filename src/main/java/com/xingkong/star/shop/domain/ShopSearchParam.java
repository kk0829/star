package com.xingkong.star.shop.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class ShopSearchParam {

    private String name;

    private Integer page;

    private Integer pageSize;

    public ShopSearchParam(String name, Integer page, Integer pageSize) {
        this.name = name;
        this.page = page;
        this.pageSize = pageSize;
    }
}
