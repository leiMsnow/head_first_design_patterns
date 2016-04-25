package com.ray.design.patterns.strategy.character;

import com.ray.design.patterns.strategy.weapon.WeaponBehavior;

/**
 * 角色
 * Created by dangdang on 4/25/16.
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    abstract void flight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
