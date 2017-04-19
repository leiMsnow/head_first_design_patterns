package com.ray.design.patterns.abstract_factory;

/**
 * 具体产品角色
 * Created by dangdang on 2017/3/28.
 */
public class ConcreteProductB1 extends AbstractProductB {
    @Override
    void method() {
        System.out.println("i'm " + this.getClass().getName());
    }
}
