package com.ray.design.patterns.decorator.Pancake;

/**
 * 装饰者
 * Created by Ray on 2016/7/9.
 */
public class HamDecorator extends Pancake {

    Pancake pancake;

    public HamDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desc() {
        return pancake.desc() + "，" + "加一个火腿";
    }

    @Override
    public double cost() {
        return pancake.cost() + 2.0;
    }
}
