package com.sample.passbyvalue;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
public class PassByValue {

    //call by value and reference
    public static void main(String[] args) {

        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");

        System.out.println("Red color: " +red.getColor());
        System.out.println("Blue color: " +blue.getColor());

        //swap, best example for any programming language to check pass by value or reference
        swap(red, blue);

        System.out.println("Red color: " +red.getColor());
        System.out.println("Blue color: " +blue.getColor());

        foo(blue);

        System.out.println("Blue color: " +blue.getColor());
    }

    private static void foo(Balloon balloon) {
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }

    private static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }

}
