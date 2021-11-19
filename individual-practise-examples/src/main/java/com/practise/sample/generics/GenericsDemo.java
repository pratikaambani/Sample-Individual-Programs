package com.practise.sample.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Pratik Ambani on 7/02/2018.
 */

public class GenericsDemo {

    public static void validateTillStringType(Collection<? super String> collection) {
        //Wild card with Lower bound
        // Accept collection of objects of type string or SUPER-CLASS of String
    }

    public static void validateStringTypes(Collection<? extends String> collection) {
        //Wild card with Upper bound
        // Accept collection of objects of type string or SUB-CLASS of String
    }

    public static void main(String[] args) {
        GenericsDemo.validateTillStringType(new ArrayList<Object>());//OK

//      GenericsDemo.validateTillStringType(new ArrayList<Integer>());//Error

//      GenericsDemo.validateStringTypes(new ArrayList<Object>());//Error

        GenericsDemo.validateStringTypes(new ArrayList<String>());//OK
    }
}
