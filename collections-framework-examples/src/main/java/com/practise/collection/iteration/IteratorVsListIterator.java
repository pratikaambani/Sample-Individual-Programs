package com.practise.collection.iteration;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator {

    public static void main(String args[]) {
        ArrayList names = new ArrayList();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");

        Iterator it = names.iterator();
        while (it.hasNext()) {
            String obj = (String) it.next();
            System.out.println(obj);
        }

        ListIterator<String> listIterator;
        List<String> firstNames = new ArrayList();
        firstNames.add("Shyam");
        firstNames.add("Rajat");
        firstNames.add("Paul");
        firstNames.add("Tom");
        firstNames.add("Kate");
        //Obtaining list iterator
        listIterator = firstNames.listIterator();

        System.out.println("Traversing the list in forward direction:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("\nTraversing the list in backward direction:");
        //Replaces the last element returned
        listIterator.set("123");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }
}
