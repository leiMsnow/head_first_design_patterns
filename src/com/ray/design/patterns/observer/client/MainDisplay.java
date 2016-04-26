package com.ray.design.patterns.observer.client;

import com.ray.design.patterns.observer.server.Observable;

/**
 * 主界面显示
 * Created by dangdang on 4/26/16.
 */
public class MainDisplay extends BaseDisplay {

    public MainDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void update(String message) {
        System.out.println("主界面:" + message);
    }
}
