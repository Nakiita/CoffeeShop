
package com.example.coffee_shop;


import com.example.coffee_shop.entity.Category;
import com.example.coffee_shop.repository.CategoryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
public class CategoryRepositoryTests {
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveCategoryTest(){
        Category category=Category.builder()
                .Name("Coffee")
                .build();
        categoryRepository.save(category);

        Assertions.assertThat(category.getId()).isGreaterThan(0);
    }
    @Test
    public void updateUCategoryTest(){

        Category category=Category.builder()
                .Name("Coffee")
                .build();
        categoryRepository.save(category);

        Category category1 = categoryRepository.findById(category.getId()).get();
        category1.setName("Coffee");
        categoryRepository.save(category1);

        Assertions.assertThat(category1.getId()).isEqualTo(1);
    }

    @Test
    public void DeleteCategoryTest(){

        Category category=Category.builder()
                .Name("Coffee")
                .build();
        categoryRepository.save(category);

        Category category1 = categoryRepository.findById(category.getId()).get();
        categoryRepository.delete(category1);

        Optional<Category> deletedUser = categoryRepository.findById(category1.getId());

        Assertions.assertThat(deletedUser.isPresent()).isEqualTo(false);
    }

}