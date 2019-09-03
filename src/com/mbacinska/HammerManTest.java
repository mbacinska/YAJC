package com.mbacinska;

public class HammerManTest {

    public static void main(String[] args) {

        HammerPieceTestable  handle = new HammerPieceTestable("black", 15);
        HammerPieceTestable head = new HammerPieceTestable("yellow",7);
        AbstractHammer hammer1 = new AbstractHammer(handle,head);
        System.out.println(hammer1.getWeight());
//        System.out.println(handle.getWeight());
//        System.out.println(head.getWeight());
        System.out.println(handle.getWeightCounter());
        System.out.println(head.getWeightCounter());



    }
}
