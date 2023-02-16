package com.example.coffee_shop.repository;

import com.example.coffee_shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository <Product, Long >{
//    List<Product> findAllByCategoryId(int id);
}
