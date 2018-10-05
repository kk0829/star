package com.xingkong.star.api.category.service.impl;

import com.xingkong.star.api.category.domain.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findById() {
        Optional<Category> category = categoryService.findById(1);
        category.ifPresent(category1 -> {
            Assert.assertNotNull(category1);
        });
    }

    @Test
    public void findAll() {
        List<Category> categoryList = categoryService.findAll();
        Assert.assertTrue(categoryList.size() > 0);
    }

    @Test
    public void findAllByIdIn() {
        List<Integer> ids = Arrays.asList(1,2,3,4);
        List<Category> categoryList = categoryService.findAllByIdIn(ids);
        Assert.assertTrue(categoryList.size() > 0);
    }

    @Test
    @Transactional
    public void save() {
        Category category = new Category("数码");
        categoryService.save(category);
    }
}