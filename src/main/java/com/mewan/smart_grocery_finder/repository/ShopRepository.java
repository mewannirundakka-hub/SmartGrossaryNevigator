package com.mewan.smart_grocery_finder.repository;

import com.mewan.smart_grocery_finder.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}
