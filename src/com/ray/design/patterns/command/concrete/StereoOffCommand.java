package com.ray.design.patterns.command.concrete;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.reveiver.Stereo;

/**
 *
 * Created by Azure on 2016/5/7.
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
