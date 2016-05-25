package com.ray.design.patterns.composite;

import java.util.Iterator;

/**
 * 菜单项，没有子项的菜单
 * Created by Ray on 2016/5/25.
 */
public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean isHot;
    double price;

    public MenuItem(String name, String description, boolean isHot, double price) {
        this.name = name;
        this.description = description;
        this.isHot = isHot;
        this.price = price;
    }


    @Override
    public Iterator<MenuComponent> createIterator() {

        return new DefaultIterator();
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showMenu() {
        System.out.print(" " + getName());
        System.out.print(isHot() ? "（热卖）" : "");
        System.out.print(" --- " + getDescription());
        System.out.println("\t\t" + getPrice());
    }
}
