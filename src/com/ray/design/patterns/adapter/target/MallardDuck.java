package com.ray.design.patterns.adapter.target;

/**
 * Created by Azure on 2016/5/9.
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
