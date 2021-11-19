package com.practise.sample.exceptions;

/**
 * Created by Pratik Ambani on 12/07/2012.
 */
public class StackOverflowErrorExample {
    public static void main(String[] args) {
        recursiveMethod(1);
    }

    static private void recursiveMethod(int number) {
        System.out.println("number: " +number);
        if(number == 0)
            return;
        else
            recursiveMethod(++number);
    }
}
