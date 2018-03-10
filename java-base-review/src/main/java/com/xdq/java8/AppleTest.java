package com.xdq.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu_do on 2018/3/11.
 */
public class AppleTest {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple a : inventory){
            if ("green".equals(a.getColor())){
                result.add(a);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByColor(List<Apple> inventory,
                                                  String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if ( apple.getColor().equals(color) ) {
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApples(List<Apple> inventory, String color,
                                           int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            boolean isFlag = (flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight);
            if (isFlag){
                result.add(apple);
            }
        }
        return result;
    }
}
