package com.example.databaseconnection.service;

import com.example.databaseconnection.model.User;
import org.springframework.http.HttpStatus;

public interface UserService {
    Iterable<User> listUsers();
    User createUser(User user);
    HttpStatus deleteUser(Long id);
}
