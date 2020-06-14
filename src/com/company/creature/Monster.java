package com.company.creature;

import com.company.article.Article;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 18:45
 * @version:
 * @modified By:
 */
public class Monster extends Creature{
    public Monster(String id, String description) {
    }

    @Override
    public void attack(Article article, Creature targetCreature) {
        article.useArticle(targetCreature);
    }

}
