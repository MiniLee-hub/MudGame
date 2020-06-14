package com.company.creature;

import com.company.article.Article;
import com.company.creature.Creature;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 14:44
 * @version:
 * @modified By:
 */
public class Person extends Creature {

    @Override
    public void attack(Article article, Creature targetCreature) {
        article.useArticle(targetCreature);

    }
}
