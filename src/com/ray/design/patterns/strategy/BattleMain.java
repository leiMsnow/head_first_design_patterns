package com.ray.design.patterns.strategy;

import com.ray.design.patterns.strategy.character.Characters;
import com.ray.design.patterns.strategy.character.GoblinBarrel;
import com.ray.design.patterns.strategy.character.KnifeGoblins;
import com.ray.design.patterns.strategy.character.SpearGoblins;

/**
 * 策略模式 - 定义了算法族, 分别封装起来,让他们之间可以互相替换,此模式让算法的变化独立于使用算法的客户。
 * 游戏入口
 * Created by dangdang on 4/25/16.
 */
public class BattleMain {

    public static void main(String[] args) {

        System.out.println("战斗开始...\n");

        Characters knife = new KnifeGoblins();
        knife.flight();
        Characters spear = new SpearGoblins();
        spear.flight();
        Characters barrel = new GoblinBarrel();
        barrel.flight();

        System.out.println("\n打扫战场...");

    }
}
