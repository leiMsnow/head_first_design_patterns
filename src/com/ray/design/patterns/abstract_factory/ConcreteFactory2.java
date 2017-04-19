package com.ray.design.patterns.abstract_factory;

/**
 * 具体工厂角色
 * Created by dangdang on 2017/3/28.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
