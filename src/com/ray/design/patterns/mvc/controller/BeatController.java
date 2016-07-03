package com.ray.design.patterns.mvc.controller;

import com.ray.design.patterns.mvc.model.BeatModelInterface;
import com.ray.design.patterns.mvc.view.DJView;

/**
 * Created by dangdang on 7/2/16.
 */
public class BeatController implements ControllerInterface {

    BeatModelInterface model;
    DJView view;


    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.enableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
