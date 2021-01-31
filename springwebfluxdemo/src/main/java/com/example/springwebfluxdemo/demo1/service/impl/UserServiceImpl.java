package com.example.springwebfluxdemo.demo1.service.impl;

import com.example.springwebfluxdemo.demo1.entity.User;
import com.example.springwebfluxdemo.demo1.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bigwillc
 **/
@Service
public class UserServiceImpl implements UserService {
    // 创建map集合存储数据
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("lilei", "male", 30));
        this.users.put(2, new User("hanmeimei", "female", 15));
        this.users.put(3, new User("zhaolei", "male", 25));
    }

    @Override
    public Mono<User> getUserById(int id) {
        // 从一个 Optional 对象或可能为 null 的对象中创建 Mono
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getUsers() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            int id = users.size() + 1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
