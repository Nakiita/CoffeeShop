package com.example.coffee_shop.repository;

import com.example.coffee_shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
    public interface UserRepo extends JpaRepository<User, String> {

        @Query(value = "select * from users where email=?1", nativeQuery = true)
        Optional<User> findByEmail(String email);


    }


