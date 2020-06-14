package com.company;

import com.company.creature.Creature;
import com.company.creature.Monster;
import com.company.creature.MonsterSet;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 19:11
 * @version:
 * @modified By:
 */
public class Ui {
      public void displayStaus(Sense sense){
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println(sense.getPerson().getDescription()+":  hp:"+sense.getPerson().getHp());
          System.out.println("你当前在:  "+sense.getPerson().getCurrentroom().getId()+sense.getPerson().getCurrentroom().getDescription()+",这里有妖怪:  "+sense.getPerson().getCurrentroom().getCurrentMonster().getId()
                  +sense.getPerson().getCurrentroom().getCurrentMonster().getDescription()+"(hp:"+sense.getPerson().getCurrentroom().getCurrentMonster().getHp()+")"+"这里有药水： "+sense.getPerson().getCurrentDrug().getHp());
          System.out.println("出口有： "+sense.getPerson().getCurrentroom().getRoomMap());
          System.out.println("你可以输3条命令:chop(chop m1) bye help go (go 1/2/3/4/5) drink (drink 1/2)");
          System.out.println("-------------------------------------------------------------------------------");
      }
      public void displayHelpMsg(){
          System.out.println("你可以输3条命令:chop(chop m1) bye help go (go 1/2/3/4/5) drink (drink 1/2)");
      }
      public void displayBye(){
          System.out.println("再见.");
      }
      public void displayErrorCmdMsg(){
          System.out.println("你输入的是非法命令。");
      }
    public void displayDamageMsg(Creature attackCreature, Creature targetCreature){
        System.out.println(attackCreature.getDescription()+"对"+targetCreature.getDescription()+"造成"+attackCreature.getCurrentArticle().getEffectValue()+"伤害。");}
}
