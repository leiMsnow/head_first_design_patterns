package com.ray.design.patterns.Iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class CafeMenu implements IMenu {

    HashMap<String,MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {

        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.39);

    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menItem = new MenuItem(b, s, s1, v);
        menuItems.put(menItem.getName(),menItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
