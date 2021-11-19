package com.practise.sample.threading;

public class JoinThread extends Thread {

    public static void main(String args[]) {

        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        JoinThread t3 = new JoinThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        t3.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("i = " + i);
        }
    }

}
