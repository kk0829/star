package com.xingkong.star.api.item.service;

import com.xingkong.star.api.item.domain.Item;

import java.util.Optional;

public interface ItemService {

    public Optional<Item> findById(Long id);
}
