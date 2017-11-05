package com.unique;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */
public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello");
//        System.out.println(toString());
    }

    //This block won't compile because toString is available in parent class(Object class)
/*
    public static String toString() {
        System.out.println(toString());
        return null;
    }

    public static int hashCode() {
        System.out.println(toString());
        return 1;
    }
*/

}
