package com.ray.design.patterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Azure on 2016/5/14.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    public String getUserInput() {

        String userInput = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            userInput = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (userInput == null)
            userInput = "no";

        return userInput;
    }
}
