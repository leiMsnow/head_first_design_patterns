package com.ray.design.patterns.Iterator.restaurant;

import com.ray.design.patterns.Iterator.MenuItem;

/**
 * 订单系统的主程序
 * Created by Ray on 2016/5/21.
 */
public class MenuApp {


    public static void main(String[] args) {

        MenuApp app = new MenuApp();
        System.out.println("-------------------------今日菜单---------------------------------");
        //调用菜单方法
//        app.showKFCMenu();
//        app.showMcdonaldMenu();

        KFCMenu kfc = new KFCMenu();
//        McdonaldMenu mcdonaldMenu = new McdonaldMenu();
        System.out.println("\n-------------------------这里是肯德基家---------------------------");
        app.showMenus(kfc.getMenuIterator());
        System.out.println("\n-------------------------这里是麦当劳家---------------------------");
//        app.showMenus(mcdonaldMenu.getMenuIterator());

        System.out.println("\n-------------------------尽情享用---------------------------------");


    }

    private void showMenus(Iterator<MenuItem> menuItemIterator) {

        while (menuItemIterator.hasNext()) {
            System.out.println(menuItemIterator.next());
        }

    }



    private void showKFCMenu() {

        KFCMenu kfc = new KFCMenu();
//        ArrayList<MenuItem> kfcMenuItems = kfc.getMenuItems();
//        System.out.println("\n-------------------------这里是肯德基家---------------------------");
//        for (int i = 0; i < kfcMenuItems.size(); i++) {
//            MenuItem menuItem = kfcMenuItems.get(i);
//            System.out.println(menuItem);
//        }

    }

    private void showMcdonaldMenu() {

        McdonaldMenu mcdonaldMenu = new McdonaldMenu();
        MenuItem[] mcdonaldItems = mcdonaldMenu.getMenuItems();
        System.out.println("\n-------------------------这里是麦当劳家---------------------------");
        for (int i = 0; i < mcdonaldItems.length; i++) {
            MenuItem menuItem = mcdonaldItems[i];
            System.out.println(menuItem);
        }

    }

}
