package com.ray.design.patterns.strategy.weapon;

/**
 * 长矛
 * Created by dangdang on 4/25/16.
 */
public class SpearBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return "使用长矛";
    }
}
