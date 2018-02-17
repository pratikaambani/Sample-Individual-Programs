package com.practise.oops.overloading;

class Overloading2 {
    public static void main(String args[]) {

        Overloading2 o2 = new Overloading2();

        o2.mul(7, 4);
        o2.mul(7.4, 4.7);

    }

    void mul(int a, int b) {
        System.out.println("mul is :-" + a * b);
    }

    void mul(double a, double b) {
        System.out.println("mul is :-" + a * b);
    }

}