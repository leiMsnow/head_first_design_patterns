package com.ray.design.patterns.decorator.beverage;

import com.ray.design.patterns.decorator.Beverage;

/**
 * 低咖啡因
 * Created by dangdang on 4/30/16.
 */
public class Decat implements Beverage {
    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() +" ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
