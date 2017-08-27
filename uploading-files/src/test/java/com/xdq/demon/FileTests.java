package com.xdq.demon;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xu_do on 2017/8/17.
 */
public class FileTests {

    @Test
    public void test1() {
        File file = new File("F:\\1.txt");
        if (file.exists()) {
            try {
                List<String> readAllLines = Files.readAllLines(file.toPath());
                System.out.println("readAllLines:" + readAllLines.toString());
                List<Double> num = readAllLines.stream().map(readAllLine -> Double.parseDouble(readAllLine.substring(0, readAllLine.indexOf(" ")))).collect(Collectors.toList());
                num.forEach(System.out::println);
                Collections.sort(num);
                num.forEach(System.out::println);
                System.out.println(Math.floor(num.size() * 0.95));
                int num95 = (int) Math.floor(num.size() * 0.95);
                System.out.println(num.get(num95));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
