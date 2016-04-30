package com.ray.design.patterns.decorator.condiment;

import com.ray.design.patterns.decorator.Beverage;
import com.ray.design.patterns.decorator.CondimentDecorator;

/**
 * 摩卡
 * Created by dangdang on 4/30/16.
 */
public class Soy implements CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "," + this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
