package com.ray.design.patterns.Iterator.restaurant;


import com.ray.design.patterns.Iterator.MenuItem;

/**
 * 麦当劳家的菜单
 * Created by Ray on 2016/5/21.
 */
public class McdonaldMenu {


    MenuItem[] menuItems;
    static final int ITEMS_COUNT = 5;
    int currentNum = 0;

    /**
     * 麦当劳提供的菜单
     */
    public McdonaldMenu() {

        menuItems = new MenuItem[ITEMS_COUNT];

        addMenu("蜜汁鸡腿满碗饭套餐", "蜜汁鸡腿满碗饭一份 一杯中可乐 2块麦辣鸡翅", 36.0);
        addMenu("香煎猪扒蒸蛋堡中套餐", "1个捣蛋绿 香煎猪扒蒸蛋堡 1份薯条（中）" +
                "/可换小玉米杯 1杯可口可乐（中）", 34.0);
        addMenu("芝足火腿加长堡配大薯套餐", "1个芝足火腿加长堡 1份薯条（大）" +
                " 1杯可口可乐（大）（薯条可换大玉米杯）", 35.0);
        addMenu("那么大鸡排套餐", "那么大鸡排满碗饭一份 一杯中可乐 2块麦辣鸡翅", 11.0);
        addMenu("怒放分享盒", "麦辣鸡翅2块 那么大鸡排1份 麦乐鸡4块", 28.0);
    }

    /**
     * @return 可以返回一个菜单列表
     */
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    // 添加菜单
    private void addMenu(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        if (currentNum < ITEMS_COUNT) {
            menuItems[currentNum] = menuItem;
            currentNum++;
        }
    }

}
