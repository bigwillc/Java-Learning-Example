package com.example.demo.designPattern.chains.template;

import java.util.ArrayList;
import java.util.List;


public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    // 绑定Handler
    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    // 执行责任链上Handler的处理
    public void handler() {
        for (IHandler handler : handlers) {
            handler.handler();
        }
    }
}
