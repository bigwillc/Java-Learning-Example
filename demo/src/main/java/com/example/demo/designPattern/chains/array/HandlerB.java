package com.example.demo.designPattern.chains.array;

public class HandlerB implements IHandler {

    @Override
    public boolean handler() {
        boolean handled = false;
        // ...
        System.out.println("Handler B process...");

        return handled;
    }
}
