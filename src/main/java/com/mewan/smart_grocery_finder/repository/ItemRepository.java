package com.mewan.smart_grocery_finder.repository;

import com.mewan.smart_grocery_finder.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findByNameIgnoreCase(String name);
}
