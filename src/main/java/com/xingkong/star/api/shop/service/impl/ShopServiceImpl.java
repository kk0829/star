package com.xingkong.star.api.shop.service.impl;

import com.xingkong.star.api.shop.domain.Shop;
import com.xingkong.star.api.shop.repository.ShopRepository;
import com.xingkong.star.api.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Optional;

/**
 * @author kk
 */
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

    @Override
    public Shop save(Shop shop) {
        shop.setAlias("123");
        System.out.println(shop);
        return repository.save(shop);
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

    /**
     * 根据店铺名 name 查询店铺列表
     *
     * @param page 第几页
     * @param size 每页大小
     * @param name 店铺名
     */
    @Override
    public Page<Shop> search(Integer page, Integer size, String name) {
        System.out.println("page = " + page);
        System.out.println("size = " + size);
        System.out.println("name = " + name);
        Specification<Shop> specification = new Specification<Shop>() {
            @Override
            public Predicate toPredicate(Root<Shop> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Path path = root.get("name");
                return criteriaBuilder.like(path, "%" + name + "%");
            }
        };
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "id");

        return repository.findAll(specification, pageable);
    }
}
