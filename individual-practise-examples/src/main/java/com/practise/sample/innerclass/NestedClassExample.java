package com.practise.sample.innerclass;

/**
 * Created by Pratik Ambani on 3/03/2018.
 */

//They are like static member of outer class
class OuterClassExample {
    private static void outerMethod() {
        System.out.println("Inside outerMethod()");
    }

    static class NestedClassExample {
        public static void main(String[] args) {
            System.out.println("Inside NestedClass method");
            outerMethod();
        }
    }

}
