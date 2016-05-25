package com.ray.design.patterns.Iterator.restaurant;


import com.ray.design.patterns.Iterator.MenuItem;

import java.util.ArrayList;

/**
 * 肯德基数据集合迭代器
 * Created by Ray on 2016/5/21.
 */
public class KFCMenuIterator implements Iterator<MenuItem> {

    int position = 0;
    ArrayList<MenuItem> menuItems;

    public KFCMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

}
