package com.xingkong.star.api.shop.service;

import com.xingkong.star.api.shop.domain.Shop;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * @author kk
 */
public interface ShopService {

    /**
     * 根据店铺 Id 查询店铺基本信息
     */
    public Optional<Shop> findById(Integer id);

    /**
     * 根据店铺 alias 查询店铺基本信息
     */
    public Shop findByAlias(String alias);

    public Shop save(Shop shop);

    public Page<Shop> findAllByNameLike(Integer page, Integer size, String name);

    public Page<Shop> search(Integer page, Integer size, String name);
}
