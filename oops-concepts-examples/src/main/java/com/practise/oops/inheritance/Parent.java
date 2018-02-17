package com.practise.oops.inheritance;

/**
 * Created by Pratik Ambani on 2/11/2017.
 */
public class Parent {

    public static void A() {
        System.out.println("PA");
    }

    private static void B() {
        System.out.println("PB");
    }

    protected static void C() {
        System.out.println("PC");
    }

    static void D() {
        System.out.println("PD");
    }

}

class Child extends Parent {

    public static void main(String args[]) {
        A();
        B();
        C();

        //parent
        D();

        Parent parent = new Parent();
        parent.A();
        // This will throw compile time error
        // parent.B();
        parent.C();

    }

    public static void A() {
        System.out.println("CA");
    }

    private static void B() {
        System.out.println("CB");
    }

    protected static void C() {
        System.out.println("CC");
    }
}