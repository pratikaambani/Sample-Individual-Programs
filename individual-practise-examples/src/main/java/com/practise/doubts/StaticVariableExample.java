package com.practise.doubts;

public class StaticVariableExample {
    static int a;

    // int a;

    StaticVariableExample() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {

        StaticVariableExample t1 = new StaticVariableExample();
        StaticVariableExample t2 = new StaticVariableExample();
        StaticVariableExample t3 = new StaticVariableExample();

        t1.sum();
        t2.sum();
        t3.sum();
    }

    void sum() {
        a++;
        System.out.println(a);
    }
}