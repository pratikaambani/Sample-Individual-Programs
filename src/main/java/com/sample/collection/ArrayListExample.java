package com.sample.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        final ArrayList ll = new ArrayList();
        increment();
        addition(ll);
    }

    private static void addition(ArrayList ll) {
        ll.add("d10");
        ll.add("d2");
        ll.add("d3");

        for (Object object: ll) {
            System.out.println(object);
        }
    }

    private static void increment() {
        int oldCapacity = 10;
        System.out.println("Increment in Arraylist: " +(oldCapacity + (10 >> 1)));
        System.out.println("Increment in Vector: " +(oldCapacity + (10 << 1)));
    }
}
