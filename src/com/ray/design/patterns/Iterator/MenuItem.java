package com.ray.design.patterns.Iterator;

/**
 * Created by Azure on 2016/5/17.
 */
public class MenuItem {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(boolean vegetarian, String name, String description, double price) {
        this.vegetarian = vegetarian;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
