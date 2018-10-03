package com.xingkong.star.service.impl;

import com.xingkong.star.domain.CountryCode;
import com.xingkong.star.repository.CountryCodeRepository;
import com.xingkong.star.service.CountryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryCodeServiceImpl implements CountryCodeService {

    @Autowired
    private CountryCodeRepository repository;

    @Override
    public List<CountryCode> findAll() {
        return repository.findAll();
    }
}
