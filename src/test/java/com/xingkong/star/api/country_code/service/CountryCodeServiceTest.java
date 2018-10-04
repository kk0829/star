package com.xingkong.star.api.country_code.service;

import com.xingkong.star.api.country_code.domain.CountryCode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryCodeServiceTest {

    @Autowired
    private CountryCodeService countryCodeService;

    @Test
    public void findAll() {
        List<CountryCode> list = countryCodeService.findAll();
        Assert.assertTrue(list.size() > 0);
    }
}