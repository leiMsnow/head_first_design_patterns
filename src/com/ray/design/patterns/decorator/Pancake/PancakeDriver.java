package com.ray.design.patterns.decorator.Pancake;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 制作煎饼
 * Created by Ray on 2016/7/9.
 */
public class PancakeDriver {


    public static void main(String[] args) {
        Pancake pancake = new CornPancake();
        // 加鸡蛋
        EggDecorator egg = new EggDecorator(pancake);
        // 加火腿
        HamDecorator ham = new HamDecorator(egg);

        System.out.println("开始做煎饼...");
        System.out.println("客户：" + ham.desc());
        System.out.println("煎饼做好了...");
        System.out.println("价格为：" + ham.cost());

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
