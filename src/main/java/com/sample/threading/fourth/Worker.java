package com.sample.threading.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Pratik Ambani on 14/02/2018.
 */
public class Worker {

    Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void stage1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public void stage2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void process() {
        for (int i = 0; i<1000;i++) {
            stage1();
            stage2();
        }
    }


    public void main() {
        System.out.println("Hello World");
        System.out.println("Starting");

        long start = System.currentTimeMillis();
        //process();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        thread.start();

        long end = System.currentTimeMillis();


        System.out.println("Time taken: " +(end-start));

        System.out.println("List1: " +list1.size()+ " and List2: " +list2.size());
    }
}
