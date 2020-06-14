package com.company;

import com.company.article.*;
import com.company.creature.*;
import com.company.room.*;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 17:17
 * @version:
 * @modified By:
 */
public class Sense {

    private Person person=new Person();

    private MaskMonster maskMonster=new MaskMonster("m1","面具怪");
    private GiantMonster giantMonster=new GiantMonster("m2","巨人怪");
    private DarkMonster darkMonster=new DarkMonster("m3","混混怪");
    private MonsterSet monsterSet=new MonsterSet();

    Drug drug1=new Drug();
    Drug drug2=new Drug();
    DrugSet drugset=new DrugSet();

    Bridge bridge=new Bridge("1","汉江桥头");
    Company company =new Company("4","公司");
    Home home=new Home("5","家");
    Lane lane=new Lane("3","小巷子");
    WasteFactory wasteFactory =new WasteFactory("2","汽车废旧厂");
    RoomSet roomSet=new RoomSet();

    Ui ui=new Ui();

    public void initSense(){
          initPerson();
          initMonster();
          initRoom();
          initdrug();
    }
    public void initPerson(){
        person.setId("1");
        person.setDescription("大力女小都");
        person.setCurrentArticle(new HammerGiant("a1","大力锤",-40));
        person.setHp(500);
        person.setCurrentroom(bridge);
        person.setCurrentMonster(giantMonster);
        person.setCurrentDrug(drug1);
        person.setCurrentDrug(drug2);

    }
    public void initMonster(){
        maskMonster.setId("m1");
        maskMonster.setDescription("面具怪");
        maskMonster.setHp(100);
        maskMonster.setCurrentArticle(new Club("a2","棍棒攻击",-30));
        maskMonster.setDamage(-50);

        giantMonster.setId("m2");
        giantMonster.setDescription("巨人怪");
        giantMonster.setCurrentArticle(new Fist("a3","力量出拳攻击",-20));
        giantMonster.setHp(100);
        giantMonster.setDamage(-50);

        darkMonster.setId("m3");
        darkMonster.setDescription("混混怪");
        darkMonster.setCurrentArticle(new BareHand("a4","徒手空打",-10));
        darkMonster.setHp(300);
        darkMonster.setDamage(-10);

        monsterSet.getMonsters().add(maskMonster);
        monsterSet.getMonsters().add(giantMonster);
        monsterSet.getMonsters().add(darkMonster);

    }
    public void initRoom(){
        HashMap<String,Room>hs1=new HashMap<>();
        hs1.put("2",wasteFactory);
        hs1.put("5",home);
        bridge.setCurrentMonster(giantMonster);
        bridge.setRoomMap(hs1);

        HashMap<String,Room>hs2=new HashMap<>();
        hs2.put("3",lane);
        company.setCurrentMonster(maskMonster);
        company.setRoomMap(hs2);

        HashMap<String,Room>hs3=new HashMap<>();
        hs3.put("3",lane);
        home.setCurrentDrug(drug1);
        home.setCurrentDrug(drug2);
        home.setCurrentMonster(null);
        home.setRoomMap(hs3);

        HashMap<String,Room>hs4=new HashMap<>();
        hs4.put("2",wasteFactory);
        hs4.put("4",company);
        hs4.put("5",home);
        lane.setCurrentMonster(maskMonster);
        lane.setRoomMap(hs4);

        HashMap<String,Room>hs5=new HashMap<>();
        hs5.put("1",bridge);
        hs5.put("3",lane);
        wasteFactory.setCurrentMonster(darkMonster);
        wasteFactory.setRoomMap(hs5);

        roomSet.getRooms().add(home);
        roomSet.getRooms().add(lane);
        roomSet.getRooms().add(company);
        roomSet.getRooms().add(bridge);
        roomSet.getRooms().add(wasteFactory);

    }
    public void initdrug(){
        drug1.setId("1");
        drug1.setDescription("神奇药水");
        drug1.setEffectValue(100);

        drug2.setId("2");
        drug2.setDescription("神奇药水");
        drug2.setEffectValue(100);

        drugset.getDrugs().add(drug1);
        drugset.getDrugs().add(drug2);
    }

    public boolean judgeSuccess(){
        boolean flagPersonSuccess=true;
        if(this.getPerson().getHp()<=0){
            flagPersonSuccess=false;
        }
       return flagPersonSuccess;
    }
    public void play(){
        ui.displayStaus(this);
        Scanner in =new Scanner(System.in);
        while(true){

            String command =in.nextLine();
            String[] words = command.split(" ");

            if(words[0].equals("bye")){
                ui.displayBye();
                System.exit(0);
            }else if(words[0].equals("help")){
                ui.displayHelpMsg();
            }else if(words[0].equals("chop")){
                this.getPerson().attack(getPerson().getCurrentArticle(),this.getMonsterSet().get(words[1]));
                ui.displayDamageMsg(this.getPerson(),this.getMonsterSet().get(words[1]));
                this.getPerson().getCurrentMonster().attack(this.getPerson().getCurrentMonster().getCurrentArticle(),this.getPerson());
                ui.displayDamageMsg(this.getPerson().getCurrentMonster(),this.getPerson());

            }else if(words[0].equals("drink")){
                person.drinkdrug(this.person,drugset.getdrugbyid(words[1]));
            }else if(words[0].equals("go")){
                this.person.setCurrentroom(roomSet.getplacebyid(words[1]));
            }
            else{
               ui.displayErrorCmdMsg();
                ui.displayHelpMsg();
            }
            ui.displayStaus(this);
            if(this.person.getHp()<=0){
                System.out.println("游戏结束，你失败了！");
                break;
            }
               for(Monster item:this.getMonsterSet().getMonsters()) {
                   if (this.getPerson().getCurrentMonster().getHp() <= 0) {
                       System.out.println("你胜利啦！");
                       break;
                   }
               }
        }

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public MonsterSet getMonsterSet() {
        return monsterSet;
    }

    public void setMonsterSet(MonsterSet monsterSet) {
        this.monsterSet = monsterSet;
    }


}
