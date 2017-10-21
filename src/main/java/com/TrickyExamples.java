package com;

/**
 * Created by Pratik Ambani on 21/10/2017.
 */
public class TrickyExamples {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);
        System.out.println("s1 == s2 is:" + (s1 == s2));

        String s3 = "MyExample";
        int start = 1;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.substring(start, end));

    }
}
