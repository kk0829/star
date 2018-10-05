package com.xingkong.star.api.category.service;

import com.xingkong.star.api.category.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> findById(Integer id);

    List<Category> findAll();

    List<Category> findAllByIdIn(List<Integer> ids);

    Category save(Category category);
}
