package com.company.article;

import com.company.creature.Creature;

/**
 * @description:徒手
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 15:30
 * @version:
 * @modified By:
 */
public class BareHand extends Article{
    public BareHand(String id, String description, int effectValue) {
        super(id, description, effectValue);
    }

    @Override
    public void useArticle(Creature targetCreature) {
        targetCreature.setHp(targetCreature.getHp()+this.getEffectValue());
    }
}
