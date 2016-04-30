package com.ray.design.patterns.decorator.beverage;

import com.ray.design.patterns.decorator.Beverage;

/**
 * 混合
 * Created by dangdang on 4/30/16.
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return this.getClass().getSimpleName() +" ";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
