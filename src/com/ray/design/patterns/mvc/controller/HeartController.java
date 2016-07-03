package com.ray.design.patterns.mvc.controller;

import com.ray.design.patterns.mvc.HeartAdapter;
import com.ray.design.patterns.mvc.model.HeartModelInterface;
import com.ray.design.patterns.mvc.view.DJView;

/**
 * Created by dangdang on 7/2/16.
 */
public class HeartController implements ControllerInterface {

    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this,new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.disableStopMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
