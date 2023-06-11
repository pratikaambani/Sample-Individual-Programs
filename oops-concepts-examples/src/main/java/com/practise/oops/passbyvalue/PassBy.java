package com.practise.oops.passbyvalue;

public class PassBy {
    int data = 50;

    public static void main(String[] args) {
        PassBy op = new PassBy();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);

    }

    void change(int data) {
        System.out.println("Within change() method: " + data);
        data = data + 100;//changes will be in the local variable only
        System.out.println("Within change() method: " + data);
    }
}
