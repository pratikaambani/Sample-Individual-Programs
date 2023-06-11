package com.practise.sample.staticExample;

public class StaticNull {
    public static void main(String[] args) {
        StaticNull staticNull = null;
        staticNull.getValueFromStaticBlock();

        StaticNull.getValueFromStaticBlock();
    }

    public static void getValueFromStaticBlock() {
        System.out.println("Yo!");
    }
}
