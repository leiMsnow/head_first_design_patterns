package com.ray.design.patterns.command.reveiver;

/**
 * Created by Azure on 2016/5/7.
 */
public class Light {

    String name;

    public Light(String s) {
        this.name = s;
    }

    public void on() {
        System.out.println(name + "开灯");
    }

    public void off() {
        System.out.println(name + "关灯");
    }
}
