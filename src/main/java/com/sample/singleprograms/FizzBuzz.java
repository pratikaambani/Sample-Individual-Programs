package com.sample.singleprograms;

/**
 * Created by Pratik Ambani on 2/10/2017.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println("Printing values");

        for (int a = 0; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (a % 3 == 0 ) {
                System.out.print(" Fizz ");
            } else if (a % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(" " +a+ " ");
            }

        }
    }
}
