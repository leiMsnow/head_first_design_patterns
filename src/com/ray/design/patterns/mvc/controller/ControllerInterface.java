package com.ray.design.patterns.mvc.controller;

/**
 * Created by dangdang on 7/2/16.
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
