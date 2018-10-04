package com.xingkong.star.common.controller;

import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.api.country_code.domain.CountryCode;
import com.xingkong.star.base.domain.PlainResult;
import com.xingkong.star.api.country_code.service.CountryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryCodeController extends BaseController {

    @Autowired
    private CountryCodeService countryCodeService;

    @GetMapping("/common/country-code/list")
    public PlainResult findAll() {
        List<CountryCode> data = countryCodeService.findAll();
        return this.success(data);
    }
}
