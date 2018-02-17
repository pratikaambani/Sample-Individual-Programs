package com.sample.exceptions;

/**
 * Created by Pratik Ambani on 2/11/2017.
 */
public class TrickyExamples {

    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        try {
            System.out.println("1");
            return;
 //           throw new Exception();
        } catch (Exception e) {
            System.out.println("2 " +e);
            throw new Exception();
        } finally {
            System.out.println("3");
            System.out.println("Return of finally always works except System.exit(0)");
            return;
        }
    }
}