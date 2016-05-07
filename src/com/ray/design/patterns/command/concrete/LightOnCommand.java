package com.ray.design.patterns.command.concrete;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.reveiver.Light;

/**
 *
 * Created by Azure on 2016/5/7.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
