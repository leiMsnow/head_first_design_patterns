package com.ray.design.patterns.command.invoker;

import com.ray.design.patterns.command.Command;
import com.ray.design.patterns.command.concrete.NoCommand;

/**
 * 遥控器
 * Created by Azure on 2016/5/7.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void ondoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- Remote Control ----- \n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot")
                    .append(i)
                    .append("]")
                    .append(onCommands[i].getClass().getSimpleName())
                    .append("   ")
                    .append(offCommands[i].getClass().getSimpleName())
                    .append("\n");
        }
        stringBuilder.append("[undo]")
                .append(undoCommand.getClass().getSimpleName())
                .append("\n");

        return stringBuilder.toString();
    }
}
