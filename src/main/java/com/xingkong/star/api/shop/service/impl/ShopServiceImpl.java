package com.xingkong.star.api.shop.service.impl;

import com.xingkong.star.api.shop.domain.Shop;
import com.xingkong.star.api.shop.repository.ShopRepository;
import com.xingkong.star.api.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
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

    /**
     * 根据店铺别名 alias 查询店铺基本信息
     *
     * @param alias 店铺别名
     */
    @Override
    public Shop findByAlias(String alias) {
        return repository.findByAlias(alias);
    }

    /**
     * 根据店铺名 name 查询店铺列表
     *
     * @param name 店铺名
     */
    @Override
    public Page<Shop> findAllByNameLike(Integer page, Integer size, String name) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "id");
        return repository.findAllByNameLike("%" + name + "%", pageable);
    }
}
