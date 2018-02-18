package com.practise.doubts;


public class LongVSLongOutputTime {

    public static void main(String[] args) {

        System.out.println("Advantage of using primitive types");
        Long sum = 0L; // uses Long, not long
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
