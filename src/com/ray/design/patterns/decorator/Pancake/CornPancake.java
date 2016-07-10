package com.ray.design.patterns.decorator.Pancake;

/**
 * 被装饰者
 * Created by Ray on 2016/7/9.
 */
public class CornPancake extends Pancake {

    @Override
    public String desc() {
        return "来一个玉米煎饼";
    }

    @Override
    public double cost() {
        return 4.0;
    }

}
