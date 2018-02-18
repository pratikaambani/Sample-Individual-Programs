package com.practise.doubts;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class CovariantReturnTypeExample {

    CovariantReturnTypeExample get() {
        System.out.println("CovariantReturnTypeExample#get");
        return this;
    }
}

class AnotherClass extends CovariantReturnTypeExample {
    AnotherClass get() {
        System.out.println("AnotherClass#get");
        return this;
    }

    void message() {
        System.out.println("example of covarient return type");
    }

    public static void main(String[] args) {
        System.out.println("A co-variant return type allows to override a super class method that returns a type that sub " +
                "class type of super class method’s return type. It is to minimize up casting and down casting.");
        new AnotherClass().get().message();

    }
}