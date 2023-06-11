package com.practise.oops.overloading;

public class Overloading6 {
    public static void main(String[] args) {

    }

    public int getValue() {
        return 1;
    }

    //Not possible to override with different return type
/*
    public String getValue() {
        return "value";
    }
*/


    //Not possible to override with Wrapper return type
/*
    private Integer getValue() {
        return 123;
    }
*/

}
