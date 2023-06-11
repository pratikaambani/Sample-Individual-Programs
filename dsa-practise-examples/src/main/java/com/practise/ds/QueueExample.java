package com.practise.ds;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        enable debug mode
//         Queue interface methods: add/offer, poll/remove, element/peek,
    
        Queue<String> queue = new LinkedList<>();
//        to add
        queue.offer("A");
//        same as offer, but throws exception in failure scenario
        queue.add(null);
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.add("F");
        queue.add("G");
        queue.add("H");
        queue.offer("I");

        queue.poll();
//        same as poll, but throws exception if queue is empty
        queue.remove();

        queue.peek();
//        same as peek, but throws exception if queue is empty
        queue.element();




    }
}
