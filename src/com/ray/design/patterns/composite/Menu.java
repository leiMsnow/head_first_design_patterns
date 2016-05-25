package com.ray.design.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 菜单，有子项菜单
 * Created by Ray on 2016/5/25.
 */
public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Iterator<MenuComponent> createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showMenu() {
        System.out.print("\n" + getName() + " --- " + getDescription());
        System.out.println(" --------------------------------------------------------------------------------- ");
        // 效果同while
        menuComponents.forEach(MenuComponent::showMenu);
    }
}
