package com.practise.doubts;

import java.util.BitSet;
import java.util.Enumeration;
import java.util.Vector;

public class Enum {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Enumeration<String> e;

        Vector<String> v = new Vector<String>();
        v.add("P");
        v.add("R");
        v.add("A");
        v.add("T");
        v.add("I");
        v.add("K");

        e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        BitSet b1 = new BitSet(12);
        BitSet b2 = new BitSet(21);

        b1.set(0);
        b1.set(10);
        b1.set(100);
        b1.set(1000);

        b2.set(20);
        b2.set(30);
        b2.set(100);
        b2.set(5000);

        System.out.println(b1);
        System.out.println(b2);

        b1.and(b2);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(v.capacity());

        System.out.println(v);
        v.addAll(v);

        Vector<String> v2 = (Vector<String>) v.clone();

        System.out.println(v.contains("K"));

        v.ensureCapacity(60000);

        System.out.println(v.size());
        System.out.println(v.capacity());

        System.out.println("v2 = " + v2);

        System.out.println("v = " + v);

    }

}
