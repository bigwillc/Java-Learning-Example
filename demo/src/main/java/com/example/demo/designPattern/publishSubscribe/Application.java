package com.example.demo.designPattern.publishSubscribe;

/**
 * @author bigwillc
 **/
public class Application {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers("publish-subscribe!");
    }
}
