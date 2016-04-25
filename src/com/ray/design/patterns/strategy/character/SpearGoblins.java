package com.ray.design.patterns.strategy.character;

import com.ray.design.patterns.strategy.weapon.SpearBehavior;

/**
 * 长矛哥布林
 * Created by dangdang on 4/25/16.
 */
public class SpearGoblins extends Characters {

    public SpearGoblins() {
        setWeaponBehavior(new SpearBehavior());
    }

    @Override
    String name() {
        return "长矛哥布林";
    }
}
