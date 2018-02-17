package com.practise.oops.overloading;

class Overloading5 {
    public static void main(String args[]) {
        Overloading5 obj = new Overloading5();
        System.out.println("uncomment below line");
//		obj.sum(20, 20);// now ambiguity
    }

    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }
}

// type proportion compile time error