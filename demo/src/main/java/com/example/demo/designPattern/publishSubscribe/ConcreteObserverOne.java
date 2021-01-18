package com.example.demo.designPattern.publishSubscribe;

/**
 * 订阅者1（观察者1）
 *
 * @author bigwillc
 **/
public class ConcreteObserverOne implements Observer{
    @Override
    public void update(String message) {
        // 收到订阅消息出发自己的业务操作
        System.out.println("Observer one receive message: " + message);
        System.out.println("Process your business...");
    }
}
