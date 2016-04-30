package com.ray.design.patterns.decorator;

import com.ray.design.patterns.decorator.beverage.DarkRoast;
import com.ray.design.patterns.decorator.beverage.Espresso;
import com.ray.design.patterns.decorator.condiment.Mocha;
import com.ray.design.patterns.decorator.condiment.Soy;
import com.ray.design.patterns.decorator.condiment.Whip;
import com.ray.design.patterns.decorator.size.Tall;

/**
 * Created by dangdang on 4/30/16.
 */
public class CoffeeMain {

    public static void main(String args[]) {

        //订一杯Espresso
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());

        //订一杯DarkRoast,加入双倍Mocha/加入奶泡
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        //订一小杯Decat,加入Soy
        Beverage decat = new Espresso();
        decat = new Soy(decat);
        decat = new Tall(decat);
        System.out.println(decat.getDescription() + " $" + decat.cost());

    }
}
