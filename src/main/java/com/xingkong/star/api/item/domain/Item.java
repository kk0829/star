package com.xingkong.star.api.item.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Item implements Serializable {

    private static final long serialVersionUID = -3537565038911054874L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private BigDecimal price;

    private Integer stock;

    private String description;

    private String icon;

    private Integer status;

    private Integer categoryId;
}
