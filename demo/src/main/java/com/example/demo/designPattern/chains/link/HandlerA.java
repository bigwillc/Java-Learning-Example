package com.example.demo.designPattern.chains.link;

public class HandlerA extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        //...
        System.out.println("Handler A process!");
        if (!handled && successor != null) {
            System.out.println("Hello Handler A before handler!");
            successor.handle();
            System.out.println("Hello Handler A after handler!");
        }
    }
}
