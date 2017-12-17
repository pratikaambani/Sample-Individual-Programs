package com.sample.collection.map;

import java.util.*;

/**
 * Created by Pratik Ambani on 8/12/2017.
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        tm.put("first", "FIRST INSERTED");
        tm.put("bsecond", "SECOND INSERTED");
        tm.put("athird","THIRD INSERTED");
        System.out.println(tm);
        Set<String> keys = tm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+tm.get(key));
        }

        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("first", "FIRST INSERTED");
        map.put("bsecond", "SECOND INSERTED");
        map.put("athird","THIRD INSERTED");
        System.out.println(map);
        Iterator<String> keys1 = map.keySet().iterator();

    }
    }



