package com.xingkong.star.controller.common;

import com.xingkong.star.controller.base.BaseController;
import com.xingkong.star.domain.CountryCode;
import com.xingkong.star.domain.PlainResult;
import com.xingkong.star.service.CountryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryCodeController extends BaseController {

    @Autowired
    private CountryCodeService countryCodeService;

    @GetMapping("/api/country-code/list")
    public PlainResult findAll() {
        List<CountryCode> data = countryCodeService.findAll();
        return this.success(data);
    }
}
