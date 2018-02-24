package com.sample.staticExample;

/**
 * Created by Pratik Ambani on 15/11/2017.
 */
public class StaticClass {
// Top level static class not allowed in Java
// public static class StaticClass {

    private static int value = 10;

    public static void main(String[] args) {
        System.out.println(NestedClass.value);
        System.out.println(value);
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    static class NestedClass {

        static int value = 20;

        public static void main(String[] args) {
            System.out.println(value);
            System.out.println(StaticClass.value);
            System.out.println(NestedClass.class);

            NestedClass nestedClass = new NestedClass();
            System.out.println(nestedClass.add(4, 5));

            StaticClass staticClass = new StaticClass();
            System.out.println(staticClass.add(5, 6));
        }

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

    }
}
