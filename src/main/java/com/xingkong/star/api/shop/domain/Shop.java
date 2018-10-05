package com.xingkong.star.api.shop.domain;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
public class Shop implements Serializable {

    private static final long serialVersionUID = -8272982979504919262L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String alias;

    @NotNull(message = "name 不能为空")
    @Length(max = 32, message = "name 长度不能超过 32")
    private String name;

    private String logo;

    private String intro;

}
