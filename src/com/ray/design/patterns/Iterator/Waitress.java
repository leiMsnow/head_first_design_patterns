package com.ray.design.patterns.Iterator;

import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class Waitress {

    IMenu dinerMenu;
    IMenu pancakeHouseMenu;
    IMenu cafeMenu;

    public Waitress(IMenu dinerMenu, IMenu pancakeHouseMenu, IMenu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n------------------------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
