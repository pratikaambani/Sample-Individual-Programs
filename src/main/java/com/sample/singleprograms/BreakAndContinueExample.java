package com.sample.singleprograms;

/**
 * Created by Pratik Ambani on 19/11/2017.
 */
public class BreakAndContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) {
                //terminate whole iteration and goes outside loop if i is 5 or 7
                //break;

                //exits from current loop and goes to next value in iteration
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("Loop is over.");
    }
}