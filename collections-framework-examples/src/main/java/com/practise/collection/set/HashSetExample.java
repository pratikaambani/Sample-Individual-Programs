package com.practise.collection.set;

import java.io.IOException;
import java.util.HashSet;

/**
 * Created by Pratik Ambani on 11/12/2017.
 */
public class HashSetExample {
    public static void main(String[] args) throws IOException {

        System.out.println("Hi");
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.size());
        hashSet.add(20);
        hashSet.add("HashSet Tutorial");
        hashSet.add(23);
        hashSet.add(20);
        hashSet.add("JavaCodeGeeks");
        System.out.println(hashSet.size());

        hashSet.remove(1);
        hashSet.remove("HashSet Tutorial");
        System.out.println("Set contains " + hashSet);
    }
}