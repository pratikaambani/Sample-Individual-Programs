package com.practise.doubts;

/**
 * Created by Pratik Ambani on 21/09/2017.
 */
public class PrintCurrentMethod {
    public static void main(String[] args) {
        sampleMethod();
    }

    private static void sampleMethod() {
        System.out.println("Name: " +Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
