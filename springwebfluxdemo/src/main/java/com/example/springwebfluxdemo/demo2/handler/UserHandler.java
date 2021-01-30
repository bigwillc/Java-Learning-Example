package com.example.springwebfluxdemo.demo2.handler;

import com.example.springwebfluxdemo.demo2.entity.User;
import com.example.springwebfluxdemo.demo2.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * @author bigwillc
 **/
public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    // 根据ID查询用户
    public Mono<ServerResponse> getUserById(ServerRequest request) {
        String userId = request.pathVariable("id");
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        // 调用service方法得到数据
        Mono<User> userMono = this.userService.getUserById(userId);
        // 把UserMono进行转换返回
        // 使用Reactor操作符flatMap
        return userMono.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(person))).switchIfEmpty(notFound);
    }

    // 查询所有
    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        Flux<User> users = this.userService.getUsers();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(users, User.class);
    }

    // 添加
    public Mono<ServerResponse> saveUser(ServerRequest request) {
        // 得到user对象
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }

}

