package com.xdq.part1;

import java.util.Objects;

/**
 * double check 模式，会出现小概率的失效问题
 */
public class Three {
    private Three(){}

    private volatile static Three three = null;

    public static Three getInstance(){
        if (Objects.isNull(three)){
            synchronized (Three.class){
                if (Objects.isNull(three)){
                    return new Three();
                }
            }
        }
        return three;
    }
}
