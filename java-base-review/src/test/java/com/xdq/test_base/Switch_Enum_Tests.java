package com.xdq.test_base;

import com.xdq.learn_enum.Size;
import org.junit.Test;

import java.util.Date;

/**
 * Created by xu_do on 2017/8/27.
 */
public class Switch_Enum_Tests {

    @Test
    public void test() {
        Size sz = Size.EXTRA_LARGE;
        //枚举
        switch (sz)
        {
            case LARGE:
                break;
            case SMALL: break;
            case MEDIUM: break;
            case EXTRA_LARGE://no need to use Size.EXTRA_LARGE
                Date date = new Date();
                System.out.println(date);
                System.out.println(sz);
                break;
            default: break;
        }

    }

    @Test
    public void test2() {
        int i = 0;
        System.out.println("ready");
        System.out.println("start");
        read_date:
        while (true)
        {
            i++;
            System.out.println(i);
            for (int j = 0; j<10; j++) {
                System.out.println("j-" + j);
                for (int k = 0; k<10; k++) {
                    System.out.println("k:"+k);
                    if (i == 10) {
                        break read_date;
                    }
                }
            }
        }
        System.out.println("break");
    }

}
