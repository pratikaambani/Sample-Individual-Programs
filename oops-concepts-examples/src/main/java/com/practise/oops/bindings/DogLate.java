package com.practise.oops.bindings;

class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class DogLate extends Animal {
    public static void main(String args[]) {
        Animal a = new DogLate();
        a.eat();
    }

    void eat() {
        System.out.println("dog is eating...");
    }
}