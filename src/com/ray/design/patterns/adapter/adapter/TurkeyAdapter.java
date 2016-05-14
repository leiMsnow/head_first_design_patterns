package com.ray.design.patterns.adapter.adapter;

import com.ray.design.patterns.adapter.target.Duck;
import com.ray.design.patterns.adapter.adaptee.Turkey;

/**
 * Created by Azure on 2016/5/9.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
