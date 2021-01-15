package com.example.demo.designPattern.chains.array;

public class HandlerA implements IHandler {
    @Override
    public boolean handler() {
        boolean handled = false;
        //...
        System.out.println("Handler A process...");
        return handled;
    }
}
