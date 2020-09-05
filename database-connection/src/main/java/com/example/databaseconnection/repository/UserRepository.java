package com.example.databaseconnection.repository;

import com.example.databaseconnection.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
