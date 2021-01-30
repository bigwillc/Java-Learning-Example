package com.example.springwebfluxdemo.demo1.controller;

import com.example.springwebfluxdemo.demo1.entity.User;
import com.example.springwebfluxdemo.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author bigwillc
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user")
    public Flux<User> getAllUser() {
        return userService.getUsers();
    }

    @PostMapping("saveuser")
    public Mono<Void> saveUser(@RequestBody User user) {
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }
}
