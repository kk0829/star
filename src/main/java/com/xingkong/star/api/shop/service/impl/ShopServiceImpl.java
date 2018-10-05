package com.xingkong.star.api.shop.service.impl;

import com.xingkong.star.api.shop.domain.Shop;
import com.xingkong.star.api.shop.repository.ShopRepository;
import com.xingkong.star.api.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository repository;

    /**
     * 根据店铺 Id 查询店铺基本信息
     */
    @Override
    public Optional<Shop> findById(Integer id) {
        return repository.findById(id);
    }
}
