package com.unique;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class ObjectLifecycle {

    static int  a = 16;

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(a);
    }


}

class ChildClass extends MiddleClass {
    int a;

    public ChildClass() {
        a = 2;
        System.out.println("ChildClass Constructor");
    }
}

class MiddleClass extends ParentClass {
    int a;

    public MiddleClass() {
        a = 3;
        System.out.println("MiddleClass Constructor");
    }
}

class ParentClass {
    int a;

    public ParentClass() {
        a = 4;
        System.out.println("ParentClass Constructor");
    }
}
