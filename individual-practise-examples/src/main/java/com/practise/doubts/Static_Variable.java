package com.practise.doubts;

public class Static_Variable {
    static int a;

    // int a;

    Static_Variable() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {

        Static_Variable t1 = new Static_Variable();
        Static_Variable t2 = new Static_Variable();
        Static_Variable t3 = new Static_Variable();

        t1.sum();
        t2.sum();
        t3.sum();
    }

    void sum() {
        a++;
        System.out.println(a);
    }
}