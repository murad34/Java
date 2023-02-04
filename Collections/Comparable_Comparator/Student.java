package Comparable_Comparator;

import java.util.Comparator;

public class Student {

    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "age " + age;
    }

}