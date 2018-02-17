package com.sample.threading.first;

/**
 * Created by Pratik Ambani on 14/02/2018.
 */

class Runner2 implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(i+ " times");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MainApp2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner2());
        thread1.start();
        Thread thread2 = new Thread(new Runner2());
        thread2.start();
    }

}
