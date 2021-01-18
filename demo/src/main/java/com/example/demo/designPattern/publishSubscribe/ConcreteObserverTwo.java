package com.example.demo.designPattern.publishSubscribe;

/**
 * 订阅者2（观察者2）
 *
 * @author bigwillc
 **/
public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(String message) {
        // 收到订阅消息后出发自己的业务操作
        System.out.println("Observer two receive message: " + message);
        System.out.println("Process your business...");
    }
}
