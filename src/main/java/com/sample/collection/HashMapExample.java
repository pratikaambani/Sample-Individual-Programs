package com.sample.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pratik Ambani on 25/11/2017.
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map students = new HashMap();

        students.put(0, 0);
        students.put(null, null);
        students.put(1, "A");
   //     students.put("1", "B");
        students.put(2, "C");
        students.put(3, "D");
        students.put(2, "E");

        students.get(3);
        students.get("3");
        students.get(null);


        students.remove("2");
        students.remove(2);

//        students.replace(3, "F");

        System.out.println("Done");

    }

}
