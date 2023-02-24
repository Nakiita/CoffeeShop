package com.example.coffee_shop;

import com.example.coffee_shop.entity.Product;
import com.example.coffee_shop.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
public class ProductRepositoryTests {
    @Autowired
    private ProductRepository productRepository;
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveProductTest(){
        Product product = Product.builder()
                .Name("Latte")
                .Preview("It's refreshing. ")
                .imageUrl("xyz")
                .build();

        productRepository.save(product);
        Assertions.assertThat(product.getId()).isGreaterThan(0);
    }

    @Test
    public void DeleteProductTest(){

        Product product=Product.builder()
                .Name("Coffee")
                .Preview("Popular One")
                .imageUrl("text.jpg")
                .build();
        productRepository.save(product);

        Product product1 = productRepository.findById(product.getId()).get();
        productRepository.delete(product1);

        Optional<Product> deletedUser = productRepository.findById(product1.getId());

        Assertions.assertThat(deletedUser.isPresent()).isEqualTo(false);
    }

}
