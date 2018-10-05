package com.xingkong.star.item.controller;

import com.xingkong.star.api.item.domain.Item;
import com.xingkong.star.api.item.service.ItemService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.model.PlainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ItemController extends BaseController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/item/basic/info")
    public PlainResult findById(@RequestParam(value = "id") Long id) {
        Optional<Item> item = itemService.findById(id);
        if (item.isPresent()) {
            return this.success(item);
        } else {
            return this.emptyRecord();
        }
    }
}
