package com.ray.design.patterns.composite;

import java.util.Iterator;

/**
 * 迭代器空实现;菜单项没有子项了，所以不需要迭代
 * Created by Ray on 2016/5/25.
 */
public class DefaultIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
