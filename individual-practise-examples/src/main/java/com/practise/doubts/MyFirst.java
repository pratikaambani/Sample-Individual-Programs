package com.practise.doubts;


public class MyFirst {
    private String name;

    public MyFirst(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            MyFirst pojo = new MyFirst(arg); // Here's how you create a POJO
            System.out.println(pojo);
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}