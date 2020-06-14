package com.company.article;

import com.company.creature.Creature;
import com.company.room.Room;

/**
 * @description:神奇药水
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 14:54
 * @version:
 * @modified By:
 */
public class  Drug extends Article{
    private String description;
    private int hp;
    private Room currentroom;
    @Override
    public void useArticle(Creature targetCreature) {
        targetCreature.setHp(targetCreature.getHp()+this.getEffectValue());
    }
    public void addpoints(Creature creature){
        creature.setHp(creature.getHp()+this.getHp());
    }

    public Drug() {    }

    public Drug(String id, String description, int effectValue, String description1, int hp, Room currentroom) {
        super(id, description, effectValue);
        this.description = description1;
        this.hp = hp;
        this.currentroom = currentroom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Room getCurrentroom() {
        return currentroom;
    }

    public void setCurrentroom(Room currentroom) {
        this.currentroom = currentroom;
    }
}
