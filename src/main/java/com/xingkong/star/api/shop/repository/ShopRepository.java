package com.xingkong.star.api.shop.repository;

import com.xingkong.star.api.shop.domain.Shop;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    Shop findByAlias(String alias);

    Page<Shop> findAllByNameLike(String name, Pageable pageable);
}
