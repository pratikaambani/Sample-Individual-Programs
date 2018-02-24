package com.practise.oops.inheritance;

/**
 * Created by Pratik Ambani on 2/11/2017.
 */
class Parent {

    public void A() {
        System.out.println("PA");
    }

    private void B() {
        System.out.println("PB");
    }

    protected void C() {
        System.out.println("PC");
    }

    void D() {
        System.out.println("PD");
    }

}

public class Child extends Parent {

    public static void main(String args[]) {

        System.out.println("Scope Sequence: public > protected > default > private");

        Child child1 = new Child();
        child1.A();
        child1.B();
        child1.C();
        child1.D();

        Parent parent1 = new Parent();
        parent1.A();
        // This will throw compile time error
        //parent1.B();
        parent1.C();
        parent1.D();

        Parent parent2 = new Child();
        parent2.A();
        // This will throw compile time error
        //parent2.B();
        parent2.C();
        parent2.D();

        //Can't do this
        //Child child2 = new Parent();

    }

    @Override
    public void A() {
        System.out.println("CA");
    }

    //@Override
    //method does not override or implement a method from a supertype
    private void B() {
        System.out.println("CB");
    }

    @Override
    protected void C() {
        System.out.println("CC");
    }

    @Override
    void D() {
        System.out.println("CD");
    }
}