package com.xdq.genericReflection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu_do on 2018/1/6.
 */
public class Clazz {
    private String name;

    private List<String> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
