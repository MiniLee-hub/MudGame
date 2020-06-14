package com.company.room;

import com.company.creature.Monster;

import java.util.HashMap;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 14:52
 * @version:
 * @modified By:
 */
public  class Room {
    private String id;
    private String description;
    private Monster currentMonster;
    HashMap<String,Room>RoomMap=new HashMap<String,Room>();

    @Override
    public String toString(){return description;}

    public Room() {
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(Monster currentMonster) {
        this.currentMonster = currentMonster;
    }

    public HashMap<String, Room> getRoomMap() {
        return RoomMap;
    }

    public void setRoomMap(HashMap<String, Room> roomMap) {
        this.RoomMap = roomMap;
    }

    public Room(String id, String description) {
        this.id = id;
        this.description = description;
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
}
