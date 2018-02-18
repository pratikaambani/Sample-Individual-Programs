package com.practise.oops.overriding;

class ParentClass {

    ParentClass() {
        System.out.println("Constructor ParentClass()");
    }

    public void demo1() {
        System.out.println("Inside method of ParentClass");
    }

    public void demo2() {
        System.out.println("Inside another method of ParentClass.");
    }
}

public class ChildClass extends ParentClass {

    ChildClass() {
        System.out.println("Constructor of ChildClass()");
    }

    public static void main(String args[]) {

        System.out.println("This is example of Method Overriding");

        ParentClass parentInstance1 = new ChildClass();
        parentInstance1.demo1();
        parentInstance1.demo2();
        System.out.println("\n It is reference of class - " + parentInstance1.getClass().getSimpleName() + "\n");

        ParentClass parentInstance2 = new ParentClass();
        parentInstance2.demo1();
        parentInstance2.demo2();
        System.out.println("\n It is reference of class - " + parentInstance2.getClass().getSimpleName() + "\n");

        ChildClass childInstance1 = new ChildClass();
        childInstance1.demo1();
        childInstance1.demo2();
        System.out.println("\n It is reference of class - " + childInstance1.getClass().getSimpleName() + "\n");

        //invalid scenario, throws exception
        ChildClass childInstance2 = (ChildClass) new ParentClass();
        childInstance2.demo1();
        childInstance2.demo2();
        System.out.println("\n It is reference of class - " + childInstance2.getClass().getSimpleName() + "\n");

    }

    public void demo2() {
        System.out.println("Inside another method of ChildClass.");
    }

    @Override
    public void demo1() {
        System.out.println("Inside method of ChildClass");
    }
}
