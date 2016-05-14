package com.ray.design.patterns.strategy.character;

import com.ray.design.patterns.strategy.transportation.BarrelBehavior;

/**
 * 飞桶
 * Created by dangdang on 4/25/16.
 */
public class GoblinBarrel extends KnifeGoblins{

    public GoblinBarrel() {
        setTransportationBehavior(new BarrelBehavior());
    }
}
