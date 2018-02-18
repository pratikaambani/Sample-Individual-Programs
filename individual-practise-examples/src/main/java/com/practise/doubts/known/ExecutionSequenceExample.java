package com.practise.doubts.known;

class ParentClass {

    static {
        clear();
        System.out.println("1. Inside Static of ParentClass");
        clear();
    }

    {
        System.out.println("3. Non-static block of ParentClass");
        clear();
    }

    ParentClass() {
        System.out.println("4. Constructor of ParentClass");
        clear();
    }

    public static void clear() {
        System.out.println("---------------------------");
    }

}

class ChildClass extends ParentClass {

    static {
        System.out.println("2. Inside Static of ChildClass");
        clear();
    }

    {
        System.out.println("5. Non-static block of ChildClass");
        clear();
    }

    ChildClass() {
        System.out.println("6. Constructor of ChildClass");
        clear();
    }

}

public class ExecutionSequenceExample {

    public static void main(String[] args) {
        ChildClass t = new ChildClass();
        ChildClass t2 = new ChildClass();
    }

}