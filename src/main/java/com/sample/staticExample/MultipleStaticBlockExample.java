package com.sample.staticExample;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class MultipleStaticBlockExample {
    static int a = 4;

    static {
        System.out.println("inside static block");
        System.out.println("a: " + a);
    }

    {
        System.out.println("inside block" + a++);
    }

    public static void main(String[] args) {
        MultipleStaticBlockExample example1 = new MultipleStaticBlockExample();
        MultipleStaticBlockExample example2 = new MultipleStaticBlockExample();
        MultipleStaticBlockExample example3 = new MultipleStaticBlockExample();
        MultipleStaticBlockExample example4 = new MultipleStaticBlockExample();
    }
}
