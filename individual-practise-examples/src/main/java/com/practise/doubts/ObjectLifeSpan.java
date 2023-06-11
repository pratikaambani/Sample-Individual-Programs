package com.practise.doubts;

import java.util.ArrayList;
import java.util.List;

//TODO Check CLI
public class ObjectLifeSpan {
    public static void main(String[] args) {
        List<Integer> list = null;
        populate(list);
        System.out.println(list);
    }

    private static void populate(List<Integer> list) {
        if(null == list) {
            list = new ArrayList<>();
        }
        for(int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
}
