package com.practise.doubts;

/**
 * Created by Pratik Ambani on 21/10/2017.
 */
public class TrickyExamples {

    public static void main(String[] args) {

        //1
        String s3 = "MyExample";
        int start = 1;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.substring(start, end));

        //2
        System.loadLibrary("com.unique.TrickyExamples");
        System.out.println(new TrickyExamples().square(2));
    }

    //2
    public native int square(int i);

}
