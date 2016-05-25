package com.ray.design.patterns.Iterator.restaurant;

import com.ray.design.patterns.Iterator.MenuItem;

import java.util.*;

/**
 * 肯德基家的菜单
 * Created by Ray on 2016/5/21.
 */
public class KFCMenu {

    ArrayList<MenuItem> menuItems;

    /**
     * 肯德基提供的菜单
     */
    public KFCMenu() {

        menuItems = new ArrayList<>();

        addMenu("外带炸鸡桶", "吮指原味鸡3块+香麻藤椒脆皮鸡2块", 39.9);
        addMenu("新奥尔良烤鸡腿饭餐", "新奥尔良烤鸡腿饭1份+新奥尔良烤翅2块 +芙蓉荟蔬汤1份", 33.5);
        addMenu("吮指原味鸡", "具有神秘配方浓郁的香料所散发的绝佳风味，鲜嫩多汁。", 79.5);
        addMenu("Q辣小鲜鱿", "精选来自阿根廷鱿鱼，金黄酥脆，筋道弹牙，喷香微辣", 11.0);
        addMenu("堡堡双人餐", "香辣鸡腿堡1个+新奥尔良烤鸡腿堡1个+香辣鸡翅2块+新奥尔良烤翅2块" +
                        "+波纹霸王薯条1份+红豆派1个+百事可乐1.2L瓶"
                , 66.0);
    }

    /**
     * @return 可以返回一个菜单列表
     */
//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    /**
     * @return 返回菜单列表迭代器
     */
    public Iterator<MenuItem> getMenuIterator() {
        return new KFCMenuIterator(menuItems);
    }

    // 添加菜单
    private void addMenu(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);
    }
}
