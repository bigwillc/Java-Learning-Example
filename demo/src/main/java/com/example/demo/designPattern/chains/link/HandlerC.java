package com.example.demo.designPattern.chains.link;

public class HandlerC extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        System.out.println("Handler C process!");
        if (!handled && successor != null) {
            System.out.println("Hello handler C before handle");
            successor.handle();
            System.out.println("Hello handler C after handle");
        }
    }
}
