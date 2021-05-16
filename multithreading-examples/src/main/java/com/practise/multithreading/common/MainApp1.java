package com.practise.multithreading.common;

/**
 * Created by Pratik Ambani on 6/02/2018.
 */

public class MainApp1 {
    public static void main(String[] args) {
        Runner1 runner11 = new Runner1();
        runner11.start();

        Runner1 runner12 = new Runner1();
        runner12.start();
    }
}

class Runner1 extends Thread {

    @Override
    public synchronized void run() {
        System.out.println("Hi from run()");
        for (int i=0; i<15; i++) {
            System.out.println("Number: " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
