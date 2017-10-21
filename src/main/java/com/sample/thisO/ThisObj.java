package com.sample.thisO;

public class ThisObj {

    public static void main(String[] args) {
        // When we pass an object, as parameter to the output statement
        // internally toString() method of that
        // object will be called
        Test t = new Test(10);
        System.out.println("value = " + t.a);
    }
}

class Test {
    int a = 20;

    Test(int a) {
        System.out.println(this.a + a);
        this.a = a;
        System.out.println(a + a);
    }
}