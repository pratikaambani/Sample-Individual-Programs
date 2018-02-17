package com.sample.singleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        long start = System.nanoTime();

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
        }
        long finish = System.nanoTime();
        long d = (finish - start) / 1000000;

        System.out.println("Used " + d);
    }
}
