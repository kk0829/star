package com.xingkong.star.api.item.service.impl;

import com.xingkong.star.api.item.domain.Item;
import com.xingkong.star.api.item.repository.ItemRepository;
import com.xingkong.star.api.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public Optional<Item> findById(Long id) {
        return repository.findById(id);
    }
}
