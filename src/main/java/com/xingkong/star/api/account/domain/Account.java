package com.xingkong.star.api.account.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String countryCode;

    private String mobile;

    private Integer gender;

    private String nickName;

    private String qq;

    private String weixin;

    private String avatar;

    private String password;
}
