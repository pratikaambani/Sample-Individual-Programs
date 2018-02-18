package com.practise.doubts;

/**
 * Created by AmbaniP on 19/08/2017.
 */
public class DiamondOperator {
    public static void main(String args[]) {
        DiamondTest example = new DiamondTest();
        example.test();
    }
}

class Foo<X> {

    Foo(X x) {

    }

    Foo<X> get(X x) {
        return this;
    }
}

class DiamondTest {
    void test() {
        Foo<?> f1 = new Foo(1).get(""); //pass - can pass String where Object is expected
//      Foo<?> f2 = new Foo<>(1).get(""); //fail - cannot pass String where Integer is expected
    }
}