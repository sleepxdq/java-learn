package com.xdq.part1;

/**
 * 饿汉模式
 */
public class Emperor {
    //防止产生多个对象
    private Emperor(){}

    //内部实例化
    private static Emperor emperor = new Emperor();

    //对外提供获取次对象的方法
    public static Emperor getInstance(){
        return emperor;
    }
}
