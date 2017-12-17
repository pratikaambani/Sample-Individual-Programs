package com.sample.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Pratik Ambani on 6/12/2017.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(5, "A");
        map.put("4", "B");
        map.put(3, "C");
        map.put(2, "D");
        map.put(1, "E");

        map.remove("A");
        map.remove(5);
        map.remove(3);
        map.remove(1);

        System.out.println(map.get(0));
        System.out.println(map.get(4));



    }
}
