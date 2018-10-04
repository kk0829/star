package com.xingkong.star.api.account.repository;

import com.xingkong.star.api.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
