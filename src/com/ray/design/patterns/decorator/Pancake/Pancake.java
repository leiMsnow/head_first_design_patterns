package com.ray.design.patterns.decorator.Pancake;

/**
 * 被装饰者抽象类
 * Created by Ray on 2016/7/9.
 */
public abstract class Pancake {

    /**
     *
     * @return 煎饼/食材名称
     */
    public abstract String desc();

    /**
     *
     *
     * @return 价格
     */
    public abstract double cost();

}
