package com.example.coffee_shop.repository;

import com.example.coffee_shop.entity.Product;
import com.example.coffee_shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository <Product, Integer>{

}
