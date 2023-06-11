package com.practise.doubts;

public class Wrapper {

    public static void main(String[] args) {

        //Why Wrapper classes?

        // Change the value in Method:
        //      Java supports only call by value.
        //      So, if we pass a primitive value, it will not change the original value.
        //      But, if we convert the primitive value in an object, it will change the original value.

        //Serialization:
        //      We need to convert the objects into streams to perform the serialization.
        //      If we have a primitive value, we can convert it in objects through the wrapper classes.

        //Synchronization:
        //      Java synchronization works with objects in Multithreading.

        //java.util package:
        //      The java.util package provides the utility classes to deal with objects.

        //Collection Framework:
        //      Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

        //Generics Framework:
        //      Accepts only Wrappers, not primitives.


        autoboxing();

        unboxing();
    }

    private static void unboxing() {
        Integer a = new Integer(3);
        int i = a.intValue();//converting Integer to int explicitly
    }

    private static void autoboxing() {
        boolean married = true;

        char charVal = 1;
        byte byteVal = 2;
        short shortVal = 3;
        int age = 12;
        long longVal = 14;
        float floatVal = 24;
        double doubleVal = 34;
//        These aren't considered objects and represent raw values. They're stored directly on the stack
//        System.out.println(charVal instanceof Character);


        Character charValue = Character.valueOf(charVal);
        Byte byteValue = Byte.valueOf(byteVal);
        Short shortValue = Short.valueOf(shortVal);
        Integer integerValue = Integer.valueOf(age);
        Long longValue = Long.valueOf(longVal);
        Float floatValue = Float.valueOf(floatVal);
        Double doubleValue = Double.valueOf(doubleVal);
        System.out.println(charValue instanceof Character);

    }
}
