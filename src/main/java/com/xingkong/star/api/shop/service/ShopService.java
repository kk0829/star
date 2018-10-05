package com.xingkong.star.api.shop.service;

import com.xingkong.star.api.shop.domain.Shop;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ShopService {

    public Optional<Shop> findById(Integer id);

    public Shop findByAlias(String alias);

    public Page<Shop> findAllByNameLike(Integer page, Integer size, String name);
}
