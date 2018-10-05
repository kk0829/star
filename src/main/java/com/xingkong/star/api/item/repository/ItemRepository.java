package com.xingkong.star.api.item.repository;

import com.xingkong.star.api.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
