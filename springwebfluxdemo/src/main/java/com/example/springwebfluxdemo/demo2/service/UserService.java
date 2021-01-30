package com.example.springwebfluxdemo.demo2.service;

import com.example.springwebfluxdemo.demo2.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *用户操作接口
 *
 **/
public interface UserService {
    // 根据ID查询用户
    Mono<User> getUserById(String id);

    // 查询所有用户
    Flux<User> getUsers();

    // 添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
