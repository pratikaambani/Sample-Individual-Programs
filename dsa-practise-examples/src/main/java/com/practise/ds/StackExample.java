package com.practise.ds;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        enable debug mode
//         Stack class methods: push, pop, peek | search, empty

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        stack.push("G");
        stack.push("H");

//        checks whether stack is empty
        System.out.println(stack.empty());

//        gives latest member of stack
        System.out.println(stack.peek());

//        gives position
        stack.search("P");

//        removes the element on top of stack
        stack.pop();
    }
}
