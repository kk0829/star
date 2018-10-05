package com.xingkong.star.api.shop.service;

import com.xingkong.star.api.shop.domain.Shop;

import java.util.Optional;

public interface ShopService {

    public Optional<Shop> findById(Integer id);
}
