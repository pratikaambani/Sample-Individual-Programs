package com.practise.oops.inheritance;

import java.io.IOException;

public class AnotherParent {

    public int getAge() {
        return 5;
    }

    public Integer getId() throws IOException {
        return 6;
    }

    public static String getName() {
        return "Pratik";
    }

}


class AnotherChild extends AnotherParent {

//    01. Not possible
/*
    @Override
    public Integer getAge() {
        return super.getAge();
    }
*/

//    02. Not possible
/*
    @Override
    public int getId() {
        return super.getId();
    }
*/

//    03. Cannot override static method
/*
    @Override
    public String getName() {
        return super.getName();
    }
*/

//    04. We can use same method, but can't annotate with @Override and super.methodName();
/*
    public static String getName() {
        return getName();
    }
*/

//    05. Cannot throw parent exception of the exception thrown in parent class method
/*
    @Override
    public Integer getId() throws Exception {
        return super.getId();
    }
*/

}