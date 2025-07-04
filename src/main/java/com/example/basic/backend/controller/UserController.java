package com.example.basic.backend.controller;

import com.example.basic.backend.model.User;
import com.example.basic.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        System.out.println("Received user: " + user.getName() + ", " + user.getEmail());
        return userService.addUser(user);
    }
}