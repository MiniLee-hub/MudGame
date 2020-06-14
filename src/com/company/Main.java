package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sense sense=new Sense();
        sense.initSense();
        System.out.println("----------------------------------------游戏背景：--------------------------------------------");
        System.out.println("晋州民乱，大力女祖上一位老奶奶用大力加害百姓，结果一夜之间失去力气，晚年也身患疾病而凄惨度过。\n从此便有了只要用大力做坏事就会遭遇不幸的诅咒。" +
                "大力女小都出生后，一直隐藏着她的力气。直到有一天……");
        sense.play();
    }
}
