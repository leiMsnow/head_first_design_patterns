package com.ray.design.patterns.adapter;

import com.ray.design.patterns.adapter.client.WildTurkey;
import com.ray.design.patterns.adapter.adapter.TurkeyAdapter;
import com.ray.design.patterns.adapter.target.Duck;
import com.ray.design.patterns.adapter.target.MallardDuck;

/**
 * Created by Azure on 2016/5/9.
 */
public class AdapterTestDrive {

    public static void main(String [] args){

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
