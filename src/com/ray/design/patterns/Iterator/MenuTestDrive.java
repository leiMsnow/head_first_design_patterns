package com.ray.design.patterns.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class MenuTestDrive {

    public static void main(String[]args){
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(dinerMenu,pancakeHouseMenu,cafeMenu);
        waitress.printMenu();
    }
}
