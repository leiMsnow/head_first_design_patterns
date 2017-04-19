package com.ray.design.patterns.chain_of_responsibility;

/**
 * Created by dangdang on 2017/4/10.
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handler(String condition);


    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handler("handler1");
    }
}
