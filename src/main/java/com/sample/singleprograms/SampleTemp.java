package com.sample.singleprograms;

/**
 * Created by AmbaniP on 16/08/2017.
 */
public class SampleTemp {

    public static void main(String args[]) {
        new SampleTemp().addAccess();

        boolean ignorePin = false;
        if(ignorePin) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }

    }

    public void addAccess() {
        boolean ignorePin = true;
        try {
            System.out.println("Inside try" +5/0);
        }catch (Exception e){
            ignorePin = false;
            System.out.println("ignorePin1: " +ignorePin);
        }

        System.out.println("ignorePin2: " +ignorePin);
    }
}
