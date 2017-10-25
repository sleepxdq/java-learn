package com.xdq.learn_enum;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xu_do on 2017/9/12.
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size:"+size);
        System.out.println("abbreviator:"+size.getAbbreviation());
        Size[] sizes = Size.values();
        for (Size s : sizes) {
            System.out.println(s.getAbbreviation() + s.ordinal());
            System.out.println("string：" + s.toString());
        }
//        Arrays.asList(sizes).forEach(System.out::getAbbreviation));
    }

}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}
