package com.example.demo.designPattern.template;

/**
 * @author bigwillc
 **/
public abstract class AbstractClass {

    public final void templateMethod() {
        // common process
        System.out.println("Common process ...");
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();
    protected abstract void method2();

}
