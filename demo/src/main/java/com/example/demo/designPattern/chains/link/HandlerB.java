package com.example.demo.designPattern.chains.link;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        System.out.println("Handler B process!");
        if (!handled && successor != null) {
            System.out.println("Hello handler B before handle");
            successor.handle();
            System.out.println("Hello handler B after handle");
        }
    }
}
