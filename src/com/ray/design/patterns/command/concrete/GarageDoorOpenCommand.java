package com.ray.design.patterns.command.concrete;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.reveiver.GarageDoor;

/**
 *
 * Created by Azure on 2016/5/7.
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.doorOpen();
    }

    @Override
    public void undo() {

    }
}
