package com.ray.design.patterns.strategy.weapon;

/**
 * 炸弹
 * Created by dangdang on 4/25/16.
 */
public class BombBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return "使用炸弹";
    }
}
