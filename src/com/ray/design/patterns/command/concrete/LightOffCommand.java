package com.ray.design.patterns.command.concrete;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.reveiver.Light;

/**
 * Created by Azure on 2016/5/7.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
