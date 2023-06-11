package com.practise.oops.overloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Third extends Thread {
    public static void main(String[] args) {

//        m3();
//        m2();
//        m1();
    }

    private static void m3() {
        Third testDemon = new Third();
        testDemon.setDaemon(false);
        testDemon.start();
        testDemon.setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println("Running daemon");
    }

    private static void m2() {
        boolean b = check(new ArrayList(), al -> al.isEmpty(   ));
//        boolean b = check(new ArrayList(),  al -> al.isEmpty());
        System.out.println(b ? "Yes" : "No");
    }

    public static boolean check (List l, Predicate<List> p) {
        return p.test(l);
    }

    private static void m1() {
        Integer[] array = new Integer[] {10, 3, 10, 2, 20};
        List<Integer> ll = Arrays.asList(array);

        OptionalDouble avg = ll.stream()
                .mapToInt(c -> c*c)
                .filter(c-> c >= 10).average();

        if (avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }
    }
}
