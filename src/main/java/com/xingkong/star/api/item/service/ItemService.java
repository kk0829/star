package com.xingkong.star.api.item.service;

import com.xingkong.star.api.item.domain.Item;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    public Optional<Item> findById(Long id);

    List<Item> findAll(Pageable pageable);

    Item save(Item item);

}
