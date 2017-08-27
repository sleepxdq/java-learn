package com.xdq.learn_enum;


/**
 * Created by xu_do on 2017/8/27.
 */
public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {return this.abbreviation;}

}
