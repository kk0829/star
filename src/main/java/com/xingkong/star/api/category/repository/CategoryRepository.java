package com.xingkong.star.api.category.repository;

import com.xingkong.star.api.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAllByIdIn(List<Integer> ids);
}
