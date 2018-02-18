package com.practise.oops.overriding;

class ParentClassExample {

    ParentClassExample() {
        System.out.println("Constructor ParentClassExample()");
    }

    public void demo1() {
        System.out.println("Inside method of ParentClassExample");
    }

    public void demo2() {
        System.out.println("Inside another method of ParentClassExample.");
    }
}

public class ChildClassExample extends ParentClassExample {

    ChildClassExample() {
        System.out.println("Constructor of ChildClassExample()");
    }

    public static void main(String args[]) {

        System.out.println("This is example of Method Overriding");

        ParentClassExample parentInstance1 = new ChildClassExample();
        parentInstance1.demo1();
        parentInstance1.demo2();
        System.out.println("\n It is reference of class - " + parentInstance1.getClass().getSimpleName() + "\n");

        ParentClassExample parentInstance2 = new ParentClassExample();
        parentInstance2.demo1();
        parentInstance2.demo2();
        System.out.println("\n It is reference of class - " + parentInstance2.getClass().getSimpleName() + "\n");

        ChildClassExample childInstance1 = new ChildClassExample();
        childInstance1.demo1();
        childInstance1.demo2();
        System.out.println("\n It is reference of class - " + childInstance1.getClass().getSimpleName() + "\n");

        //invalid scenario, throws exception
        ChildClassExample childInstance2 = (ChildClassExample) new ParentClassExample();
        childInstance2.demo1();
        childInstance2.demo2();
        System.out.println("\n It is reference of class - " + childInstance2.getClass().getSimpleName() + "\n");

    }

    public void demo2() {
        System.out.println("Inside another method of ChildClassExample.");
    }

    @Override
    public void demo1() {
        System.out.println("Inside method of ChildClassExample");
    }
}
