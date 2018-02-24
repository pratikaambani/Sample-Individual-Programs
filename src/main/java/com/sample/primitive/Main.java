package com.sample.primitive;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int a = 1321866544;
        System.out.println("Hello World!");
        System.out.println("a= " + (byte) a);
        System.out.println("a= " + (short) a);
        System.out.println("a= " + (long) a);

        if ("" instanceof String) {
            System.out.println("Yes, it is!!");
        } else {
            System.out.println("No, It isn't!!");
        }

        System.out.println(new Date());
    }
}

