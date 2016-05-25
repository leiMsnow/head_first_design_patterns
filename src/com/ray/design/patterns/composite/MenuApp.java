package com.ray.design.patterns.composite;

import java.util.Iterator;

/**
 * 订单系统的主程序
 * Created by Ray on 2016/5/25.
 */
public class MenuApp {

    MenuComponent menuComponent;

    public MenuApp(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    private void showAllMenu() {
        menuComponent.showMenu();
    }

    private void showHotMenu() {
        Iterator<MenuComponent> iterator = menuComponent.createIterator();
        System.out.println("\n热卖区域");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isHot()) {
                    menuComponent.showMenu();
                }
            } catch (UnsupportedOperationException e) {

            }
        }

    }


    public static void main(String[] args) {

        MenuComponent breakfastMenu = new Menu("早餐", "推出特色早餐");
        breakfastMenu.add(new MenuItem("6元早餐", "特价早餐只需6元", true, 6.0));
        breakfastMenu.add(new MenuItem("牛肉粥热豆浆油条餐", "牛肉蛋花粥1份+安心油条1根 + 醇豆浆（热）1杯", false, 21.9));
        breakfastMenu.add(new MenuItem("牛肉蛋花粥", "全新美味的牛肉蛋花粥，在熬制的粥底中打入美味蛋花，加入细切新鲜牛肉，" +
                "再配以黑木耳和黄花菜等配菜，料足味美。", false, 11.0));

        MenuComponent lunchMenu = new Menu("午餐", "丰富多样的午餐");
        lunchMenu.add(new MenuItem("外带炸鸡桶", "吮指原味鸡3块+香麻藤椒脆皮鸡2块", true, 39.9));
        lunchMenu.add(new MenuItem("新奥尔良烤鸡腿饭餐", "新奥尔良烤鸡腿饭1份+新奥尔良烤翅2块 +芙蓉荟蔬汤1份", true, 33.5));
        lunchMenu.add(new MenuItem("吮指原味鸡", "具有神秘配方浓郁的香料所散发的绝佳风味，鲜嫩多汁。", false, 79.0));
        lunchMenu.add(new MenuItem("Q辣小鲜鱿", "精选来自阿根廷鱿鱼，金黄酥脆，筋道弹牙，喷香微辣", false, 11.0));
        lunchMenu.add(new MenuItem("堡堡双人餐", "香辣鸡腿堡1个+新奥尔良烤鸡腿堡1个+香辣鸡翅2块+新奥尔良烤翅2块\" +\n" +
                "                        \"+波纹霸王薯条1份+红豆派1个+百事可乐1.2L瓶", true, 66.0));

        MenuComponent allMenus = new Menu("今日菜单", "每天都有特价套餐");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);


        MenuApp menuApp = new MenuApp(allMenus);
//        menuApp.showAllMenu();
        menuApp.showHotMenu();

    }

}
