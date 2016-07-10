package com.ray.design.patterns.decorator.Pancake;

/**
 * 装饰者
 * Created by Ray on 2016/7/9.
 */
public class EggDecorator extends Pancake {

    Pancake pancake;

    public EggDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String desc() {
        return pancake.desc() +"，" +"加一个鸡蛋";
    }

    @Override
    public double cost() {
        return pancake.cost() + 1.0;
    }
}
