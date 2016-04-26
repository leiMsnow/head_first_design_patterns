package com.ray.design.patterns.observer.server;

import com.ray.design.patterns.observer.client.Observer;

/**
 * Created by dangdang on 4/26/16.
 */
public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
