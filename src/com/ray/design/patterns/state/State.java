package com.ray.design.patterns.state;

/**
 *
 * Created by Ray on 2016/6/4.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
