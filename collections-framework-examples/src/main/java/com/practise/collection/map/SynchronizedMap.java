package com.practise.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pratik Ambani on 5/12/2017.
 */
public class SynchronizedMap {
    public static void main(String[] args) {
        Map<Integer, Object> map = new HashMap();
        Map synchronizedMap = Collections.synchronizedMap(map);
        synchronizedMap.put(1, null);
    }
}