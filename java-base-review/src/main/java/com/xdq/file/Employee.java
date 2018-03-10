package com.xdq.file;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author xu_do
 * @date 2018/3/8
 */
@Data
@NoArgsConstructor
public class Employee{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        this.hireDay = calendar.getTime();
    }
}
