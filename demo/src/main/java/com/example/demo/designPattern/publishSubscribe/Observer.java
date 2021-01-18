package com.example.demo.designPattern.publishSubscribe;

/**
 * 订阅者（观察者）
 *
 * @author bigwillc
 **/
public interface Observer {
    void update(String message);
}
