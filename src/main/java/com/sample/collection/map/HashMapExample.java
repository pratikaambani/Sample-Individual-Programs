package com.sample.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik Ambani on 25/11/2017.
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map students = new HashMap();

        //put
        students.put(0, 0);
        students.put(null, null);
        students.put(1, "A");
        students.put("1", "B");
        students.put(2, "C");
        students.put(3, "D");
        students.put(2, "E");

        //get
        System.out.println(students.get(3));
        System.out.println(students.get("3"));
        System.out.println(students.get(null));

        //remove
        students.remove("2");
        students.remove(2);

        students.replace(3, "F");
    }
}


