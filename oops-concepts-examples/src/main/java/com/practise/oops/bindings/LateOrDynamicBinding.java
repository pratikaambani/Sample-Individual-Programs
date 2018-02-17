package com.practise.oops.bindings;

public class LateOrDynamicBinding {

    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        Vehicle v = new Car();
        v.start();
        v.aa();
    }
}

class Vehicle {

    public void start() {
        System.out.println("Inside Vehcle class");
    }

    public void aa() {

    }
}

class Car extends Vehicle {

    public void start() {
        System.out.println("Inside Car class");
    }

    public void are() {
        System.out.println("Inside Car class");
    }
}
