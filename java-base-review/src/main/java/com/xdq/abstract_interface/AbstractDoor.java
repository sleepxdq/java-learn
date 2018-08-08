package com.xdq.abstract_interface;

public abstract class AbstractDoor {
    public static String s = "haha";
    private int a;
    protected double b;
    public String c;
    char d;

    void test1(){
        System.out.println("qqqqqqqq");
    }

    public abstract void open();

    private void test3(){

    }

    abstract void close();

    static void test5(){
        System.out.println("static s");
    }
}
