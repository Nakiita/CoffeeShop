package com.example.coffee_shop;

import org.assertj.core.api.Assertions;
import com.example.coffee_shop.entity.User;
import com.example.coffee_shop.repository.UserRepo;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;


@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveUSerTest() {

        User user = User.builder()
                .fullName("Ram")
                .email("ram@gmail.com")
                .mobileNo("1234567890")
                .password("1234567")
                .build();

        userRepo.save(user);

        Assertions.assertThat(user.getId()).isGreaterThan(0);

    }

    @Test
    @Order(2)
    public void getUserTest() {
        User userGet = userRepo.findById(1).get();
        Assertions.assertThat(userGet.getId()).isEqualTo(1);
    }

    @Test
    @Order(3)
    public void getListOfUserTest() {
        List<User> Users = userRepo.findAll();
        Assertions.assertThat(Users.size()).isGreaterThan(0);
    }
}



