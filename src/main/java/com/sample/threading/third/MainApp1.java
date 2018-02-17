package com.sample.threading.third;

/**
 * Created by Pratik Ambani on 14/02/2018.
 */
public class MainApp1 {
    public static void main(String args[]) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printTable(5);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printTable(100);
            }
        });

        thread1.start();
        thread2.start();
    }

    static void printTable(int number) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(number * count);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}