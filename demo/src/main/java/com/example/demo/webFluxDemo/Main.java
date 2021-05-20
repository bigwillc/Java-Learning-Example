package com.example.demo.webFluxDemo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Main {

    public static void main(String[] args) {
        //just方法直接声明
        Flux.just(1, 2, 3).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

        //其他的方法


    }
}
