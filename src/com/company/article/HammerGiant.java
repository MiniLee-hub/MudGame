package com.company.article;

import com.company.creature.Creature;

/**
 * @description:大力锤
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 15:06
 * @version:
 * @modified By:
 */
public class HammerGiant extends Article{
    public HammerGiant(String id, String description, int effectValue) {
        super(id, description, effectValue);
    }

    @Override
    public void useArticle(Creature targetCreature) {
           targetCreature.setHp(targetCreature.getHp()+this.getEffectValue());
    }
}
