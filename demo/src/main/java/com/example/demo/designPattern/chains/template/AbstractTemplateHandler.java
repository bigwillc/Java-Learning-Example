package com.example.demo.designPattern.chains.template;

/**
 * @author bigwillc
 **/
public abstract class AbstractTemplateHandler implements IHandler {

    // 模板方法
    @Override
    public void handler() {
        // common process
        System.out.println("Common process ...");
        //...
        method1();
        //...

    }

    protected abstract void method1();

}
