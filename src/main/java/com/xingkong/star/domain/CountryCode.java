package com.xingkong.star.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class CountryCode {

    @Id
    @GeneratedValue
    private Integer id;

    private String code;

    private String name;

    private String en;

    private String zh;
}
