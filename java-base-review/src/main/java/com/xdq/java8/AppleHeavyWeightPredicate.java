package com.xdq.java8;

/**
 * Created by xu_do on 2018/3/13.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
