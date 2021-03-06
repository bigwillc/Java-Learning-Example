package com.example.demo.designPattern.chains.array;

public class Application {
    public static void main(String[] args) {
        //1.创建一个责任链
        HandlerChain chain = new HandlerChain();
        //2.绑定两个处理的Handler
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());

        //3.执行处理方法
        chain.handler();
    }
}
