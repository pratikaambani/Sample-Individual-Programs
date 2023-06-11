package com.practise.oops.overloading;

public class Sample<T> {


    public static void main(String[] args) {
        Sample<Number> ss = new Sample<>();
        ss.add(new Integer(1));
        ss.add(new Double(1.0));
    }

    void add(T t) {
        System.out.println("Yp");
    }
}
