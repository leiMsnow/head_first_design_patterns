package com.ray.design.patterns.command;

import com.ray.design.patterns.command.concrete.LightOffCommand;
import com.ray.design.patterns.command.concrete.LightOnCommand;
import com.ray.design.patterns.command.invoker.RemoteControl;
import com.ray.design.patterns.command.reveiver.Light;

/**
 *
 * Created by Azure on 2016/5/7.
 */
public class RemoteControlMain {

    public static void main(String []args){

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("客厅");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.ondoButtonWasPressed();

        remoteControl.offButtonWasPressed(0);
        remoteControl.ondoButtonWasPressed();

    }
}
