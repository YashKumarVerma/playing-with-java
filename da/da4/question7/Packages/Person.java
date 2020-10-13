package Packages;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int age;
    public int income;

    public Person(String name, int age, int income) {
        this.age = age;
        this.income = income;
        this.name = name;
    }
}