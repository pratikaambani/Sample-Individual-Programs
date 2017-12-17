package com.sample.collection.set;

import java.util.TreeSet;

/**
 * Created by Pratik Ambani on 12/12/2017.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");

        // Duplicates will not get insert
        treeSet.add("C");

        // Elements get stored in default natural sorting Order(Ascending)
        System.out.println(treeSet);
        // [A,B,C]

        // ts1.add(2) ; will throw ClassCastException
        //             at run time

        treeSet.remove("B");
        treeSet.remove(1);
    }
}
