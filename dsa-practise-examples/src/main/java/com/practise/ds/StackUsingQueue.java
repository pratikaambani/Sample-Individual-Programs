package com.practise.ds;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

class Stack {

    static Queue<Integer> q1 = new LinkedList();
    static Queue<Integer> q2 = new LinkedList();

    static int push(int a) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        q1.offer(a);
        while ((!q2.isEmpty())) {
            q1.add(q2.poll());
        }

        return a;
    }

    static int pop() {
        return q1.poll();
    }

}
