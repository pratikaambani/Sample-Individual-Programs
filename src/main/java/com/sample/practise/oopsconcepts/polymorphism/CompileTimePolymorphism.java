package com.sample.practise.oopsconcepts.polymorphism;

class SuperClass {

    int mul(int a, int b) {
        return a * b;
    }

    int mul(int a, int b, int c) {
        return a * b * c;
    }

}

public class CompileTimePolymorphism extends SuperClass {

    public static void main(String args[]) {

        System.out.println("Compile Time Polymorphism");
        System.out.println("Nothing but Method Overloading.");

        CompileTimePolymorphism sO = new CompileTimePolymorphism();

        System.out.println("Multiplication of 2 vars = " + sO.mul(3, 5));

        System.out.println("Multiplication of 3 vars = " + sO.mul(3, 5, 7));

    }
}
