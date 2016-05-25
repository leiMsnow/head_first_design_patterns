package com.ray.design.patterns.composite;

import java.util.Iterator;

/**
 * 提供默认的组合实现
 * Created by Ray on 2016/5/25.
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isHot() {
        throw new UnsupportedOperationException();
    }

    public void showMenu() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
}
