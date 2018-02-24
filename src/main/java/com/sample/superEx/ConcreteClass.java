package com.sample.superEx;

/**
 * Created by Pratik Ambani on 24/02/2018.
 */
abstract class AbstractClass {

    public AbstractClass() {
        System.out.println("Inside Abs Constructor");
    }

    void sayHello() {
        System.out.println("sayHello");
    }

    abstract void getRange();
}

class ConcreteClass extends AbstractClass {

    public ConcreteClass() {
        System.out.println("ConcreteClass");
    }

    public static void main(String[] args) {

/*
        ConcreteClass concreteClassObject1 = new AbstractClass();
        concreteClassObject1.getRange();
        concreteClassObject1.sayHello();

        AbstractClass abstractClassObject2 = new AbstractClass();
        abstractClassObject2.getRange();
        abstractClassObject2.sayHello();
*/

        ConcreteClass concreteClassObject2 = new ConcreteClass();
        concreteClassObject2.getRange();
        concreteClassObject2.sayHello();

        AbstractClass abstractClassObject1 = new ConcreteClass();
        abstractClassObject1.getRange();
        abstractClassObject1.sayHello();

    }

    @Override
    void sayHello() {
        System.out.println("sayHello");
    }


    @Override
    void getRange() {
        System.out.println("I'm inside range");
    }
}
