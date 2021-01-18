package com.example.demo.designPattern.publishSubscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();

    //绑定订阅
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //删除订阅
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //通知订阅者
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
