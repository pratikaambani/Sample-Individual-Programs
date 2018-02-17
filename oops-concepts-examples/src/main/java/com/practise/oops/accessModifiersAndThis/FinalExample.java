package com.practise.oops.accessModifiersAndThis;

public class FinalExample {

    private final int NUMBER;
    private int sum;

    public FinalExample(int a) {
        NUMBER = a;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("Sum = %d \n", sum);
    }

}
