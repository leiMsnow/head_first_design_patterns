package com.ray.design.patterns.observer.client;

import com.ray.design.patterns.observer.server.Observable;

/**
 * 详情界面显示
 * Created by dangdang on 4/26/16.
 */
public class DetailsDisplay extends BaseDisplay {

    public DetailsDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void update(String message) {
        System.out.println("详情界面:" + message);
    }
}
