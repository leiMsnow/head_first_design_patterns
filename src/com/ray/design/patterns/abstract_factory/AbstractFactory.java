package com.ray.design.patterns.abstract_factory;

/**
 * 抽象工厂角色
 * Created by dangdang on 2017/3/28.
 */
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}
