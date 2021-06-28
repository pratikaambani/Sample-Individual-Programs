package com.sample.InitialReferenceClasses001;

interface I1 {

    public void print1();

    public void print2();
}

/**
 * Created by AmbaniP on 23/05/2017.
 */
public class SampleHelloWorld001 implements I1 {

    public static int randomNumber = 10;

    public static void main(String args[]) {
        System.out.println("Hello World!");

        String objectCount = new String("Sample");

        SampleReference002 object = new SampleReference002();

        System.out.println("This class Number value: " + randomNumber);
        System.out.println("SampleReference002 Number value: " + object.randomNumber);
        System.out.println("Reference Obj, Sum: " + object.sum(4, 5));

        for (long i = 0; i < 1000000000; i++) {
            SampleReference002 object1 = new SampleReference002();
            System.out.println(object1);
        }
    }

    private long sum(int a, int b) {
        return a + b;
    }

    public void print1() {
        System.out.println();

    }

    public void print2() {

    }
}

class C3 extends SampleHelloWorld001 {

}
