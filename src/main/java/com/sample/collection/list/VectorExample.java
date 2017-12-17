package com.sample.collection.list;

import java.util.List;
import java.util.Vector;

/**
 * Created by Pratik Ambani on 11/12/2017.
 */
public class VectorExample {
    public static void main(String[] args) {
        List vector = new Vector();

        vector.add(null);
        vector.add(1);
        vector.add("1");
        vector.add("1");
        vector.add("random");


//      vector.get(null);
//        vector.get("1");
        System.out.println(vector.get(0));
        try {
            System.out.println(vector.get(10));
        } catch (Exception e) {
            e.printStackTrace();
        }


        vector.remove(2);
        vector.remove(20);
    }
}
