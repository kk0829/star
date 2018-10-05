package com.xingkong.star.shop.controller;

import com.xingkong.star.api.shop.domain.Shop;
import com.xingkong.star.api.shop.service.ShopService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.domain.PlainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 店铺基本信息控制器类
 */
@RestController
public class ShopBasicInfo extends BaseController {

    @Autowired
    private ShopService shopService;

    @GetMapping(value = "/shop/info")
    public PlainResult getShopBasicInfo(@RequestParam(value = "id", required = true) Integer id) {
        Optional<Shop> shop = shopService.findById(id);
        if (shop.isPresent()) {
            return this.success(shop);
        } else {
            return this.emptyRecord();
        }
    }
}
