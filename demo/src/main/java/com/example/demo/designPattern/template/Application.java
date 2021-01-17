package com.example.demo.designPattern.template;

/**
 * @author bigwillc
 **/
public class Application {
    public static void main(String[] args) {
        AbstractClass demo1 = new ConcreteClass1();
        demo1.templateMethod();

        System.out.println("---------------------------------------------------------------");
        AbstractClass demo2 = new ConcreteClass2();
        demo2.templateMethod();;
    }
}
