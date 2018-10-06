package com.xingkong.star.api.shop.repository;

import com.xingkong.star.api.shop.domain.Shop;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author kk
 */
public interface ShopRepository extends JpaSpecificationExecutor<Shop>, JpaRepository<Shop, Integer> {

    /**
     * 根据别名查找店铺
     * @param alias 店铺别名 alias
     */
    Shop findByAlias(String alias);

    Page<Shop> findAllByNameLike(String name, Pageable pageable);

}
