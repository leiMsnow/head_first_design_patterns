package com.ray.design.patterns.observer.client;

import com.ray.design.patterns.observer.server.Observable;

/**
 * 通知栏显示
 * Created by dangdang on 4/26/16.
 */
public class NotifyDisplay extends BaseDisplay {

    public NotifyDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void update(String message) {
        System.out.println("通知栏:" + message);
    }
}
