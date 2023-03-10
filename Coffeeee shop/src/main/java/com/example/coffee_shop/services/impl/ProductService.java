package com.example.coffee_shop.services.impl;


import com.example.coffee_shop.entity.Product;
import com.example.coffee_shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){
        return productRepository.findAll();
}
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public void removeProductById(Integer id){
        productRepository.deleteById(id);
    }
    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }


    }

