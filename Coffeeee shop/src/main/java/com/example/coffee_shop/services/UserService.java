package com.example.coffee_shop.services;

import com.example.coffee_shop.entity.User;
import com.example.coffee_shop.pojo.UserPojo;

import java.io.IOException;
import java.util.List;

public interface UserService {

    UserPojo save(UserPojo userPojo) throws IOException;

    List<User> fetchAll();

    User fetchById(Integer id);

    void deleteById(Integer id);

    void sendEmail();
}

