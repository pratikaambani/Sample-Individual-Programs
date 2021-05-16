package com.practise.multithreading.common;

/**
 * Created by Pratik Ambani on 6/02/2018.
 */
public class MainApp2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner2());
        Thread thread2 = new Thread(new Runner2());

        thread1.start();
        thread2.start();
    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
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
