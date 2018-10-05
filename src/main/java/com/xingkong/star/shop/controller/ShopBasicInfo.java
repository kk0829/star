package com.xingkong.star.shop.controller;

import com.xingkong.star.api.shop.domain.Shop;
import com.xingkong.star.api.shop.service.ShopService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.domain.PlainResult;
import com.xingkong.star.base.exception.ParamsError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public PlainResult getShopBasicInfo(@RequestParam(value = "id", required = false) Integer id,
                                        @RequestParam(value = "alias", required = false) String alias) throws Exception {
        if (id == null && alias == null) {
            throw new ParamsError("至少传递一个 id 或 alias 参数");
        }
        if (id != null) {
            Optional<Shop> shop = shopService.findById(id);
            if (shop.isPresent()) {
                return this.success(shop);
            } else {
                return this.emptyRecord();
            }
        } else if (alias != null) {
            Shop shop = shopService.findByAlias(alias);
            if (shop != null) {
                return this.success(shop);
            } else {
                return this.emptyRecord();
            }
        }
        return this.emptyRecord();
    }

    @GetMapping(value = "/shop/list/search")
    public PlainResult findAllByNameLike(@RequestParam(value = "name", required = false, defaultValue = "") String name,
                                         @RequestParam(value = "page", required = false, defaultValue = "0") String page,
                                         @RequestParam(value = "pageSize", required = false, defaultValue = "20") String pageSize) {
        Page<Shop> list = shopService.findAllByNameLike(Integer.parseInt(page), Integer.parseInt(pageSize), name);
        return this.success(list);
    }
}
