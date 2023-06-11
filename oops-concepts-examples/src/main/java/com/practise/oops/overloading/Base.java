package com.practise.oops.overloading;

class Base {
    int number;
    Base(int i) { number = i; }
}
class Child extends Base {
    int count;
    Child(int count, int num) {
        super(num);
        this.count = count;
    }
    //#1 Insert Line here
    Child(int count) {
        super(0);
        this.count = count;
    }
}

