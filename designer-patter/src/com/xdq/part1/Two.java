package com.xdq.part1;

import java.util.Objects;

/**
 * 懒汉模式（线程安全）
 */
public class Two {
    private Two(){}
    private static Two two = null;

    public static synchronized Two getInstance(){
        if (Objects.isNull(two)){
            return new Two();
        }
        return two;
    }
}
