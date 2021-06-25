package com.practise.doubts;

public class DefaultConstructor {

    static int salary;
    static String name;

    public static void main(String[] args) {
        System.out.println(salary);
        System.out.println(name);

        System.out.println("Even though we don't assign an explicit constructor, java will generate a default constructor");

        System.out.println("Purpose of default constructor is to initialize the values");

        System.out.println("For example, salary and name don't have any value defined, still sout is giving 0 and null");
    }
}
