package com.ray.design.patterns.strategy.weapon;

/**
 * 匕首
 * Created by dangdang on 4/25/16.
 */
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return "使用匕首";
    }
}
