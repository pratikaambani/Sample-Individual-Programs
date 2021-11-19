package com.practise.sample.serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 686800402478465782L;

    public String name;
    public int age;
    public transient int roll; // This will not be serialized

    public void personalDetails() {
        System.out.println("Name = " + name + " and age = " + age + " and roll = " + roll);
    }

}