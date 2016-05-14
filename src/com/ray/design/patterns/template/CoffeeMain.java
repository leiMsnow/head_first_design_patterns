package com.ray.design.patterns.template;

/**
 * Created by Azure on 2016/5/14.
 */
public class CoffeeMain {

    public static  void main(String[] args){

        CoffeeWithHook  coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
