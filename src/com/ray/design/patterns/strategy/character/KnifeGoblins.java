package com.ray.design.patterns.strategy.character;

import com.ray.design.patterns.strategy.weapon.KnifeBehavior;

/**
 * 匕首哥布林
 * Created by dangdang on 4/25/16.
 */
public class KnifeGoblins extends Characters {


    public KnifeGoblins() {
        setWeaponBehavior(new KnifeBehavior());
    }

    @Override
    String name() {
        return "匕首哥布林";
    }
}
