package com.sample.singleprograms;

/**
 * Created by AmbaniP on 13/08/2017.
 */
public class RecursionExample {
    public static void main(String argss[]) {

        RecursionExample recursionExample = new RecursionExample();

        System.out.println(recursionExample.recursiveFunction(6, 8));
    }

    public int recursiveFunction(int a, int b) {
        if(a==b)
            return a;
        else if (b>a)
            return recursiveFunction(a, b-a);
        else return recursiveFunction(a-b, b);
    }
}
