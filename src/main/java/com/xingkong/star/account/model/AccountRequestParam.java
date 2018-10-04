package com.xingkong.star.account.model;

import com.xingkong.star.base.model.BaseRequestParam;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccountRequestParam extends BaseRequestParam {

    @NotNull
    private Long id;
}
