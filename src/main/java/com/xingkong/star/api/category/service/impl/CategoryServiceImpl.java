package com.xingkong.star.api.category.service.impl;

import com.xingkong.star.api.category.domain.Category;
import com.xingkong.star.api.category.repository.CategoryRepository;
import com.xingkong.star.api.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Optional<Category> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Category> findAllByIdIn(List<Integer> ids) {
        return repository.findAllByIdIn(ids);
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }
}
