package com.ray.design.patterns.Iterator;

import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class DinerMenu implements IMenu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(b, s, s1, v);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

 }
