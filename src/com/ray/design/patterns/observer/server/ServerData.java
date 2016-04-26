package com.ray.design.patterns.observer.server;

import com.ray.design.patterns.observer.client.Observer;

import java.util.ArrayList;

/**
 * 数据中转站
 * Created by dangdang on 4/26/16.
 */
public class ServerData implements Observable {

    private ArrayList<Observer> observers;
    private String message;

    public ServerData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void receiveMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
