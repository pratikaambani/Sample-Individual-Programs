package com.sample.staticExample;

public class StaticMain {
    public static void main(String args[]) {

        StaticExample tS1 = new StaticExample("Pratik", "Ambani");
        StaticExample tS2 = new StaticExample("Another", "Value");
        StaticExample tS3 = new StaticExample("Third", "Value3");
        StaticExample tS4 = new StaticExample("Forutth", "Value4");

        // System.out.println(StaticExample.getMembers());
        System.out.println(StaticExample.class);

        System.out.println();
        System.out.println(tS2.getFirst());
        System.out.println(tS3.getLast());
        System.out.println(tS4.getMembers());

    }

}
