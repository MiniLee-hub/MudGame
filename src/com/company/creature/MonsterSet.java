package com.company.creature;

import java.util.ArrayList;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 14:58
 * @version:
 * @modified By:
 */
public class MonsterSet {
    private ArrayList<Monster> monsters=new ArrayList<>();
    //根据id(String)来查对应的Monster对象
    public Monster get(String id){
        Monster monster=null;
        for(Monster item:monsters){
            if(true==id.equals(item.getId())){
                monster=item;
                break;
            }
        }
        return monster;
    }
    public MonsterSet() {
    }

    public MonsterSet(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}
