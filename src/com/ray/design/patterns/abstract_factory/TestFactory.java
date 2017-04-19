package com.ray.design.patterns.abstract_factory;

/**
 * Created by dangdang on 2017/3/28.
 */
public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory productA = new ConcreteFactory1();
        AbstractProductA productA1 = productA.createProductA();
        productA1.method();

    }
}
