package com.practise.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pratik Ambani on 11/12/2017.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        final List linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add("2");
        linkedList.add(null);


        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));


        linkedList.remove(1);
        linkedList.remove("1");

    }
}
