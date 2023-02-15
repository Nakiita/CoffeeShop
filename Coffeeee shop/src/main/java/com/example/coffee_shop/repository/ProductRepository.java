package com.example.coffee_shop.repository;

import com.example.coffee_shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long >{
}
