package com.company.room;

import com.company.room.Room;

import java.util.ArrayList;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/8 15:01
 * @version:
 * @modified By:
 */
public class RoomSet {
    private ArrayList<Room> rooms=new ArrayList<Room>();

    public RoomSet() {
    }

    public RoomSet(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public Room reachroombyId(String roomid){
        Room room =null;
        for(Room item:rooms){
            if (roomid.equals(item.getId())){
                room=item;
                break;
            }
        }
        return room;
    }
    public Room getplacebyid(String id){
        Room room=null;
        for(Room item:rooms){

                if(id.equals(item.getId())){
                    room=item;
                }
        }
        return room;
    }

}
