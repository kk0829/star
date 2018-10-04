package com.xingkong.star.api.account.service.impl;

import com.xingkong.star.api.account.domain.Account;
import com.xingkong.star.api.account.repository.AccountRepository;
import com.xingkong.star.api.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Optional<Account> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Long count() {
        return repository.count();
    }
}
