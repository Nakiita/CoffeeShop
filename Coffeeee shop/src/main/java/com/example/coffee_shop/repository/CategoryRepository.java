package com.example.coffee_shop.repository;

import com.example.coffee_shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
