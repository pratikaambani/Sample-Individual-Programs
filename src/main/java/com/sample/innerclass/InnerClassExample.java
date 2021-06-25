package com.sample.innerclass;

/**
 * Created by Pratik Ambani on 3/03/2018.
 */
class OuterClass {

    void outerClassMethod() {
        //5.
        final int value = 10;

        System.out.println("I'm from OuterClass outerClassMethod()");

        //4. Inner class inside OuterClass method
        // local to outerClassMethod() only
        class AnotherInnerClass {
            void innerMethod() {
                System.out.println("Value: " + value);
                System.out.println("Inside inner method");
            }
        }
        AnotherInnerClass anotherInnerClassObject = new AnotherInnerClass();
        anotherInnerClassObject.innerMethod();
    }


    class InnerClass {

        //1. Inner classes are associated with Objects,
        //so static methods are not allowed
/*
        public static void main(String[] args) {

        }
*/

        //      2. static int a = 10;
//      public static void innerClassMethod() {
        public void innerClassMethod() {
            System.out.println("I'm from nested InnerClass innerClassMethod()");
        }

    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        //3 calling  Nested Class methods
        OuterClass.InnerClass innerClassObject = new OuterClass().new InnerClass();
        innerClassObject.innerClassMethod();

        OuterClass outerClassObject = new OuterClass();
        outerClassObject.outerClassMethod();
    }
}
