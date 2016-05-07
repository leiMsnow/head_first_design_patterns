package com.ray.design.patterns.command.reveiver;

/**
 * Created by Azure on 2016/5/7.
 */
public class Stereo {


    public void off() {
        System.out.println("关闭音响");
    }

    public void on() {
        System.out.println("打开音响");
    }

    public void setCD() {
        System.out.println("放入CD");
    }

    public void setVolume(int volume) {
        System.out.println("调整音量到:" + volume);
    }
}
