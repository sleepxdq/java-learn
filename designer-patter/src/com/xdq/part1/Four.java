package com.xdq.part1;

/**
 * 静态内部类单例模式
 */
public class Four {
    private Four(){}

    public static Four getInstance(){
        return FourHolder.FOUR;
    }

    private static class FourHolder{
        private static final Four FOUR = new Four();
    }
}
