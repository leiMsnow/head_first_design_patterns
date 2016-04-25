package com.ray.design.patterns.strategy.transportation;

/**
 * 飞桶
 * Created by dangdang on 4/25/16.
 */
public class BarrelBehavior implements TransportationBehavior {

    @Override
    public String useTransportation() {
        return "乘坐飞桶";
    }

}
