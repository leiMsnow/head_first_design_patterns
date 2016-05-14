package com.ray.design.patterns.adapter.client;

import com.ray.design.patterns.adapter.adaptee.Turkey;

/**
 * Created by Azure on 2016/5/9.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
