package com.xdq.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by xu_do on 2018/1/6.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Double> ts = new TreeSet<>();
        ts.add(9.0);
        ts.add(1.11);
        ts.add(2.23);
        ts.add(5.54343434);
        ts.add(8.0);
        ts.add(0.0001);
        ts.add(0.00001);
        ts.add(3.0);
        //会自动排序，只是字符和数字
        System.out.println(ts.toString());
    }
}
