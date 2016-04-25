package com.ray.design.patterns.strategy.character;

import com.ray.design.patterns.strategy.transportation.TransportationBehavior;
import com.ray.design.patterns.strategy.weapon.WeaponBehavior;

/**
 * 角色
 * Created by dangdang on 4/25/16.
 */
public abstract class Characters {

    WeaponBehavior weaponBehavior;
    TransportationBehavior transportationBehavior;

    abstract String name();

    public void flight() {
        String weapon = "不使用武器";
        String transportation = "";
        if (weaponBehavior != null) {
            weapon = weaponBehavior.useWeapon();
        }
        if (transportationBehavior != null) {
            transportation = transportationBehavior.useTransportation();
        }
        System.out.println(name() + "-->" + weapon + transportation + "开始战斗...");
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setTransportationBehavior(TransportationBehavior transportationBehavior) {
        this.transportationBehavior = transportationBehavior;
    }
}
