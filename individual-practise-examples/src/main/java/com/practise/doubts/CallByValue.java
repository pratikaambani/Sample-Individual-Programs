package com.practise.doubts;


public class CallByValue {

    int val = 50;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CallByValue cbv = new CallByValue();

        System.out.println(cbv.val);

        cbv.square(25);

        System.out.println(cbv.val);

    }

    int square(int val) {
        val = val * val;
        return val;
    }

}
