package com.example.databaseconnection.service;

import com.example.databaseconnection.model.User;

import com.example.databaseconnection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public HttpStatus deleteUser(Long id) {
        userRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
