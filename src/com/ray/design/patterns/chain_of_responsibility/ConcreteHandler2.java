package com.ray.design.patterns.chain_of_responsibility;

/**
 * Created by dangdang on 2017/4/10.
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handler(String condition) {
        if (condition.equals("handler2")){
            System.out.println(ConcreteHandler2.class.getSimpleName());
        }else{
            successor.handler(condition);
        }
    }
}
