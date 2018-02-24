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

    private static void addition(ArrayList list) {
        list.add("d10");
        list.add("d2");
        list.add("d3");
        list.add("d4");
        list.add("d5");
        list.add(6.8);
        list.add(6);
        System.out.println(list.get(1));
        System.out.println(list.get(1));
        list.set(1,null);
        //null pointer exception coz set can be used to replace values only
        list.set(100,null);

        for (Object object : list) {
            System.out.println(object);
        }
    }

    private static void increment() {
        int oldCapacity = 10;
        System.out.println("Increment in Arraylist: " + (oldCapacity + (10 >> 1)));
        System.out.println("Increment in Vector: " + (oldCapacity + (10 << 1)));
    }
}
