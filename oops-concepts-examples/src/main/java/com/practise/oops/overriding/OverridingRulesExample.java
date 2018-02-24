package com.practise.oops.overriding;

import java.io.IOException;

/**
 * Created by Pratik Ambani on 18/02/2018.
 */
class SuperClass {

    //1. If the superclass method does not declare an exception,
    // subclass overridden method cannot declare the checked exception.
    void sayHello1() {
        System.out.println("Hello World");
    }

    //2. If the superclass method does not declare an exception,
    // subclass overridden method cannot declare the checked exception
    // but can throw unchecked exception.
    void sayHello2() {
        System.out.println("Hello World");
    }

    //3. if parent throws, then subclass method can throw
    //          3.1. either same exception
    //          3.2. sub exception,
    //          3.3. but can't throw parent exception
    void sayHello3() throws IOException {
        System.out.println("Hello World");
    }

    //4. subclass doesnt throw exception, it will work
    void sayHello4() throws IOException {
        System.out.println("Hello World");
    }

    class SubClass extends SuperClass {

        //1.
/*
    @Override
    void sayHello1() throws IOException {
        System.out.println("Hello World");
    }
*/

        //2.
        @Override
        void sayHello2() throws ArrayIndexOutOfBoundsException {
            System.out.println("Hello World");
        }

        //3.
        //3.1 same
        @Override
        void sayHello3() throws IOException {
            System.out.println("Hello World");
        }

        //3.2 sub
/*
    @Override
    void sayHello3() throws FileNotFoundException{
        System.out.println("Hello World");
    }
*/

        //3.3 can't parent
/*
    @Override
    void sayHello3() throws Exception{
        System.out.println("Hello World");
    }
*/

        @Override
        void sayHello4() {
            System.out.println("Hello World");
        }

    }

}


public class OverridingRulesExample {

    public static void main(String[] args) {

    }

}