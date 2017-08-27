package com.xdq.constructor;

import java.util.Random;

/**
 * Created by xu_do on 2017/8/27.
 */
public class ConstructorTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harry", 40000);
        employees[1] = new Employee(60000);
        employees[2] = new Employee();

        for (Employee employee : employees) {
            System.out.println("name=" + employee.getName() + ", id=" + employee.getId()
            + ", salary=" + employee.getSalary());
        }
    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";//instance field initialization
    private double salary;

    //static initialization block ， 只执行一次，在类加载时
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization,每new一次都会执行
    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
