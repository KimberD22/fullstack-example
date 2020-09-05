package com.example.databaseconnection.controller;

import com.example.databaseconnection.model.User;

import com.example.databaseconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> listUsers() {
        return userService.listUsers();
    }
    // user controller post request => userService.createUser(user) => userRepository.save(user) =>
        // db inserts info we grabbed up
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteUser(@PathVariable Long id) {
        // System.out.println(id);
        return userService.deleteUser(id);
    }

}
