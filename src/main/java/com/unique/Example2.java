package com.unique;

/**
 * Created by Pratik Ambani on 4/11/2017.
 */

public class Example2 {

    public static String foo() {
        System.out.println("Test foo called");
        return "";
    }

    //nul.reference should throw exception but this won't
    //Reason: foo is static
    // obj.foo when compiles it directly changes reference from obj.foo to ClassName.foo
    public static void main(String args[]) {
        Example2 obj = null;
        System.out.println(obj.foo());
    }
}