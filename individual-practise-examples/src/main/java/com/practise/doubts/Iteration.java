package com.practise.doubts;

import java.util.Arrays;
import java.util.List;
/**
 * Created by Pratik Ambani on 21/10/2017.
 */

class Iteration {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
    public static void main(String args[]) {
        List<Double> ld = Arrays.asList();
 //       addnumbers(10.4);
        System.out.println("getList(2)");
    }
}