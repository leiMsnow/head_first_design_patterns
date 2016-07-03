package com.ray.design.patterns.state;

/**
 * 没有投币状态
 * Created by Azure on 2016/6/4.
 */
public class NoQuarterState extends AbstractState {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

}
