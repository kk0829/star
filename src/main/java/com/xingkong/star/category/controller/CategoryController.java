package com.xingkong.star.category.controller;

import com.xingkong.star.api.category.domain.Category;
import com.xingkong.star.api.category.service.CategoryService;
import com.xingkong.star.base.controller.BaseController;
import com.xingkong.star.base.model.PlainResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/category/basic")
    public PlainResult findById(@RequestParam(value = "id", required = true) Integer id) {
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()) {
            return this.success(category);
        } else {
            return this.emptyRecord();
        }
    }

    @GetMapping(value = "/category/list/all")
    public PlainResult findAll() {
        List<Category> data = categoryService.findAll();
        return this.success(data);
    }

    @GetMapping(value = "/category/list")
    public PlainResult findAllByIdIn(@RequestParam(value = "ids") List<Integer> ids) {
        List<Category> data = categoryService.findAllByIdIn(ids);
        return this.success(data);
    }

}
