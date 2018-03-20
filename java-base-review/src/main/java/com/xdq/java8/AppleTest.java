package com.xdq.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author xu_do
 * @date 2018/3/11
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

    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple("red", 156),
                new Apple("green",112));
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());


        filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });

        filterApples(inventory, apple -> "green".equals(apple.getColor()));


        LambdaTest lambdaTest = (a, b) -> {
            System.out.println(a + "ssssdss" + b);
            return a + b;
        };
        int sum = lambdaTest.add(1, 2);

    }
}
