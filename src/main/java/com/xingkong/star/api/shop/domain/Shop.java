package com.xingkong.star.api.shop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Shop implements Serializable {

    private static final long serialVersionUID = -8272982979504919262L;

    @Id
    @GeneratedValue
    private Integer id;

    private String alias;

    private String name;

    private String logo;

    private String intro;

}
