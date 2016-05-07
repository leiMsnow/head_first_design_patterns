package com.ray.design.patterns.command.concrete;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.reveiver.Stereo;

/**
 *
 * Created by Azure on 2016/5/7.
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
