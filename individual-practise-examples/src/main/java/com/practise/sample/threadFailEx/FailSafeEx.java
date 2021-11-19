package com.practise.sample.threadFailEx;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeEx {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> mValue = new ConcurrentHashMap<String, String>();
        mValue.put("Apple", "iPhone");
        mValue.put("HTC", "HTC one");
        mValue.put("Samsung", "S55");

        mValue.keySet().forEach(s -> {
            System.out.println(mValue.get(s));
            mValue.put("Sony", "Xperia Z");
        });
    }
}