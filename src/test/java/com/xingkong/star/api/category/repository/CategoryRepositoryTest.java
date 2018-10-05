package com.xingkong.star.api.category.repository;

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository repository;

    @Test
    public void findByIdTest() {
        Optional<Category> category = repository.findById(1);
        Assert.assertTrue("类目未找到", category.isPresent());
    }

    @Test
    @Transactional
    public void saveTest() {
        Category category = new Category("女生最爱");
        repository.save(category);
        Assert.assertNotNull(category);
    }

    @Test
    public void findAllByIdInTest() {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4);
        List<Category> categoryList = repository.findAllByIdIn(ids);
        System.out.println(categoryList);
        Assert.assertTrue(categoryList.size() > 0);
    }

}