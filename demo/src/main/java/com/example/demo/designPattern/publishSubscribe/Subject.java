package com.example.demo.designPattern.publishSubscribe;

/**
 * 发布者
 *
 * @author bigwillc
 **/
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
