package com.java7;

abstract class AAa {
    void me() {

    }
}

public class NewException {
    public static void main(String[] args) {
//        B b = new A(); //nope
        com.java7.A a = new com.java7.B();
    }
}


class A {

    void method() {
        System.out.println("This is from A");
    }
}

class B extends com.java7.A {

    void method() throws NullPointerException {
//    void method() throws Exception { //checked exception must be thrown by parent method as well
        System.out.println("This is from A");
    }

}
