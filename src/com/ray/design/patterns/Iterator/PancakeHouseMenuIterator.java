package com.ray.design.patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
@Deprecated
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

}
