package com.practise.doubts;

abstract class AAa {
    void me() {

    }
}

public class NewException {
    public static void main(String[] args) {
//        B b = new A(); //nope
        A a = new B();
    }
}


class Parent {

    void method() {
        System.out.println("This is from A");
    }
}

class Child extends Parent {

    void method() throws NullPointerException {
//    void method() throws Exception { //checked exception must be thrown by parent method as well
        System.out.println("This is from A");
    }

}
