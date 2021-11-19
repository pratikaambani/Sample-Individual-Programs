package com.practise.sample.threading.second;

import java.util.Scanner;

/**
 * Created by Pratik Ambani on 14/02/2018.
 */

class Processor extends Thread {

    private boolean running = true;
//    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("infinite");
            System.out.println("name: " +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

public class MainApp1 {
    public static void main(String[] args) {
        Processor processor1 = new Processor();
        processor1.start();

        Processor processor2 = new Processor();
        processor2.start();

        System.out.println("Press any key to stop execution");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        if (key == 1) {
            processor1.shutdown();
            processor2.shutdown();
        }
    }
}
