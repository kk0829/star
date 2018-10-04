package com.xingkong.star.api.account.service;

import com.xingkong.star.api.account.domain.Account;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findById(Long id);

    public Long count();
}
