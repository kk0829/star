package com.xingkong.star.api.account.service;

import com.xingkong.star.api.account.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public Optional<Account> findById(Long id);

    public Long count();

    public Page<Account> search(Integer page, Integer size);
}
