package com.practise.ds;

public class CustomStackExample {

    static int[] members;
    private int top;
    private final int maxSize;

    public CustomStackExample(int i) {
        top = -1;
        maxSize = i;
        members = new int[maxSize];
    }

    public static void main(String[] args) {
        CustomStackExample customStack = new CustomStackExample(5);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);

//        StackOverflowError
//        customStack.push(6);

        customStack.pop();

        System.out.println(customStack.peek());
        System.out.println(customStack.isFull());
        System.out.println(customStack.isEmpty());

        //TODO: Stack using LinkedList

    }

    private void push(int a) {
        members[++top] = a;
    }

    private void pop() {
        members[top] = members[top - 1];
    }

    private int peek() {
        return members[top];
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

}
