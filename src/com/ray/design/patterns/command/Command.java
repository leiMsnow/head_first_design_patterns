package com.ray.design.patterns.command;

/**
 * 命令接口
 * Created by Azure on 2016/5/7.
 */
public interface Command {
    void execute();
    void undo();
}
