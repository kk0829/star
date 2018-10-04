package com.xingkong.star.account.controller;

import com.xingkong.star.account.model.AccountRequestParam;
import com.xingkong.star.api.account.domain.Account;
import com.xingkong.star.api.account.service.AccountService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.model.PlainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController extends BaseController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/account/basic/info")
    public PlainResult findById(AccountRequestParam params) {
        Optional<Account> data = accountService.findById(params.getId());
        return this.success(data);
    }

    @GetMapping(value = "/account/count")
    public PlainResult count() {
        Long count = accountService.count();
        return this.success(count);
    }

    @GetMapping(value = "/account/search")
    public PlainResult search() {
        Page<Account> page = accountService.search(0, 20);

        return this.success(page);
    }
}
