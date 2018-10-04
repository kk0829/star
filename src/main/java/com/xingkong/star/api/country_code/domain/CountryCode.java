package com.xingkong.star.api.country_code.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class CountryCode implements Serializable {

    private static final long serialVersionUID = 3045079692790880879L;

    @Id
    @GeneratedValue
    private Integer id;

    private String code;

    private String name;

    private String en;

    private String zh;
}
