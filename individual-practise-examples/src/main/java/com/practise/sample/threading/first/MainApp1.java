package com.practise.sample.threading.first;

/**
 * Created by Pratik Ambani on 14/02/2018.
 */

class Runner1 extends  Thread {
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println(i+" times");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}

public class MainApp1 {
    public static void main(String[] args) {
        Runner1 runner = new Runner1();
        runner.start();
    }
}
