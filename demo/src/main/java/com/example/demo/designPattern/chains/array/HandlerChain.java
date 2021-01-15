package com.example.demo.designPattern.chains.array;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handler() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handler();
            if (handled) {
                break;
            }
        }
    }
}
