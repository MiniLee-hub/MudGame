package com.company.article;

import com.company.creature.Creature;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 15:18
 * @version:
 * @modified By:
 */
public abstract class Article {
    private String id;
    private String description;
    private int effectValue;

    public abstract void useArticle(Creature targetCreature);
    public Article() {
    }

    public Article(String id, String description, int effectValue) {
        this.id = id;
        this.description = description;
        this.effectValue = effectValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }
}
