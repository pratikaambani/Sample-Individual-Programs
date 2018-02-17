package com.practise.collection.list;

import java.util.ArrayList;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        final ArrayList arrayList = new ArrayList();
        increment();
        addition(arrayList);


        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.get(1));


        System.out.println(arrayList.remove(3));
        arrayList.remove("d2");
        arrayList.remove(0);

    }

    private static void addition(ArrayList ll) {
        ll.add("d10");
        ll.add("d2");
        ll.add("d3");
        ll.add("d4");
        ll.add("d5");
        ll.add(6.8);
        ll.add(6);

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
