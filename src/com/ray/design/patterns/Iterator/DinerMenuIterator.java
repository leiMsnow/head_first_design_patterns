package com.ray.design.patterns.Iterator;

import java.util.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        int prev = position - 1;
        if (items[prev] != null) {
            int lastPosition = items.length - 1;
            System.arraycopy(items, prev + 1, items, prev, lastPosition - prev);
            items[lastPosition] = null;
        }
    }
}
