package com.xdq.part1;

import java.util.Objects;

/**
 * 懒汉模式（线程不安全）不用：会出现线程不安全
 *
 */
public class One {
    private One(){}
    private static One one = null;
    public static One getInstance(){
        if (Objects.isNull(one)){
            return new One();
        }
        return one;
    }
}

