package com.company.creature;

import com.company.article.Drug;
import com.company.room.Room;
import com.company.article.Article;

import java.util.ArrayList;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 14:44
 * @version:
 * @modified By:
 */
public abstract class Creature {
    private String id;
    private String description;
    private int hp;//生命值
    private int damage;//进攻伤害点数
    private Article currentArticle;
    private Room currentroom;
    private Monster currentMonster;
    private Drug currentDrug;
    private ArrayList<Article> articles=new ArrayList<>();
    @Override
    public String toString(){return description;}
    public abstract void attack(Article article,Creature targetCreature);//当前生物用一种武器攻击目标生物
    public void goroom(Creature person,Room room){
        person.setCurrentroom(room);
    }//去到某个房间
    public void drinkdrug(Creature person, Drug drug){
        drug.addpoints(person);
    }
    public Creature() {
    }

    public Creature(String id, String description, int hp, int damage) {
        this.id = id;
        this.description = description;
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
    public Room getCurrentroom() {
        return currentroom;
    }

    public void setCurrentroom(Room currentroom) {
        this.currentroom = currentroom;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(Monster currentMonster) {
        this.currentMonster = currentMonster;
    }

    public Drug getCurrentDrug() {
        return currentDrug;
    }

    public void setCurrentDrug(Drug currentDrug) {
        this.currentDrug = currentDrug;
    }

    public Article getCurrentArticle() {
        return currentArticle;
    }

    public void setCurrentArticle(Article currentArticle) {
        this.currentArticle = currentArticle;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
}
