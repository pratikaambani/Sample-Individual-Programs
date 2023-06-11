package com.practise.ds;

import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.enQueue(1);
        Queue.enQueue(2);
        Queue.enQueue(3);
        System.out.println(q.toString());

        System.out.println(Queue.deQueue());
        System.out.println(Queue.deQueue());
        System.out.println(Queue.deQueue());
    }
}


class Queue {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enQueue(int x) {

        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        s1.push(x);

        while ((!s2.isEmpty())) {
            s1.push(s2.peek());
            s2.pop();
        }
    }


    static int deQueue() {
        int a = s1.peek();
        s1.pop();
        return a;
    }

    public static Stack<Integer> getS1() {
        return s1;
    }

    public static void setS1(Stack<Integer> s1) {
        Queue.s1 = s1;
    }

    public static Stack<Integer> getS2() {
        return s2;
    }

    public static void setS2(Stack<Integer> s2) {
        Queue.s2 = s2;
    }

    @Override
    public String toString() {
        return s1.toString();
    }
}