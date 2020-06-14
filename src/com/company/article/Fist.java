package com.company.article;

import com.company.creature.Creature;

/**
 * @description:拳头攻击
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 22:18
 * @version:
 * @modified By:
 */
public class Fist extends Article{
    public Fist(String id, String description, int effectValue) {
        super(id, description, effectValue);
    }

    @Override
    public void useArticle(Creature targetCreature) {
        targetCreature.setHp(targetCreature.getHp()+this.getEffectValue());
    }
}
