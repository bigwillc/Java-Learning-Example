package com.example.demo.designPattern.template;

/**
 * @author bigwillc
 **/
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void method1() {
        //...
        System.out.println("Class1 process in method1 ...");
    }

    @Override
    protected void method2() {
        //...
        System.out.println("Class1 process in method2 ...");
    }

}
