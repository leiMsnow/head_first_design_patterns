package com.ray.design.patterns.observer.client;

import com.ray.design.patterns.observer.server.Observable;

/**
 * Created by dangdang on 4/26/16.
 */
public abstract class BaseDisplay implements Observer {


    Observable observable;

    public BaseDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void remove() {
        observable.removeObserver(this);
    }

}
