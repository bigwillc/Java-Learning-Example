package com.example.demo.designPattern.chains.array;

public class HandlerC implements IHandler {

    @Override
    public boolean handler() {
        System.out.println("hello handler c");
        return false;
    }
}
