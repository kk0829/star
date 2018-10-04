package com.xingkong.star.account.controller;

import com.xingkong.star.api.account.domain.Account;
import com.xingkong.star.api.account.service.AccountService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.domain.PlainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController extends BaseController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/account/base-info")
    public PlainResult findById(@RequestParam(value = "id") Long id) {
        Optional<Account> data = accountService.findById(id);
        return this.success(data);
    }

    @GetMapping(value = "/account/count")
    public PlainResult count() {
        Long count = accountService.count();
        return this.success(count);
    }
}
