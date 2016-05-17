package com.ray.design.patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class PancakeHouseMenu implements IMenu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);

    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(b, s, s1, v);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
       return menuItems.iterator();
        //return new PancakeHouseMenuIterator(menuItems);
    }

}
