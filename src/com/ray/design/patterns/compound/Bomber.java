package com.ray.design.patterns.compound;

/**
 * 炸弹人
 * Created by Ray on 2016/6/21.
 */
public class Bomber implements Characters {
    @Override
    public void flight() {
        System.out.println("抱着炸弹的小骷髅来了！");
    }
}
