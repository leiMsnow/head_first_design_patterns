package com.ray.design.patterns.singleton;

/**
 * 巧克力工厂
 * Created by Azure on 2016/5/4.
 */
public class ChocolateBoiler {

    public static void main(String[] args) {

        ChocolateBoiler.getInstance();

    }

    private volatile static ChocolateBoiler instance;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        System.out.println("ChocolateBoiler created!");
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            boiled = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            empty = true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }

}
