package com.example.basic.backend.repository;

import com.example.basic.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // custom queries if needed
    // Example: Find user by email
    Optional<User> findByEmail(String email);

    // Example: Find all users with a given name
    List<User> findByName(String name);
}