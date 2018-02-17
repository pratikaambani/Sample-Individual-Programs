package com.practise.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Pratik Ambani on 12/12/2017.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");
        linkedHashSet.add("Random");
        Iterator<String> itr=linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        linkedHashSet.remove(1);
        linkedHashSet.remove("Random");

        linkedHashSet.contains("Ravi");
    }
}
