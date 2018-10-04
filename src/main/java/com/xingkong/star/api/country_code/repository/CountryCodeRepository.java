package com.xingkong.star.api.country_code.repository;

import com.xingkong.star.api.country_code.domain.CountryCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCodeRepository extends JpaRepository<CountryCode, Integer> {
}
