package com.xdq.abstract_interface;

public class Main {

    public static void main(String[] args) {
        String s = AbstractDoor.s;
        System.out.println(s);
        AbstractDoor.test5();
        WoodenDoor woodenDoor = new WoodenDoor();
        woodenDoor.test1();
    }


}
