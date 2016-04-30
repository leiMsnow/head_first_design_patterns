package com.ray.design.patterns.decorator.size;

import com.ray.design.patterns.decorator.Beverage;
import com.ray.design.patterns.decorator.SizeDecorator;

/**
 * 小杯
 * Created by dangdang on 4/30/16.
 */
public class Tall implements SizeDecorator {

    Beverage beverage;

    public Tall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "," + this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
