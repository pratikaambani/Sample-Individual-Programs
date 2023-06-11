package com.practise.leftright;

import java.util.Stack;

//005
public class StockPrice {
    public static void main(String[] args) {

        int[] numbers = new int[]{70, 80, 20, 90, 30, 70, 20, 50, 90, 40, 20, 60, 80};

        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            if (tempStack.size() == 0) {
                tempStack.add(numbers[i]);
            } else if (numbers[i] > tempStack.peek()) {
                tempStack.push(numbers[i]);
            } else if (numbers[i] < tempStack.peek()) {
                while (tempStack.size() > 0) {
                    tempStack.pop();
                }
                tempStack.push(numbers[i]);
            }
            System.out.println("Number of time Price was " + numbers[i] + " or less than " + numbers[i] + " consecutively ==> " + tempStack.size());
        }

//        enhanced for
/*
        for (int number : numbers) {
            if (tempStack.size() == 0) {
                tempStack.add(number);
            } else if (number > tempStack.peek()) {
                tempStack.push(number);
            } else if (number < tempStack.peek()) {
                while (tempStack.size() > 0) {
                    tempStack.pop();
                }
                tempStack.push(number);
            }
            System.out.println("Number of time Price was " + number + " or less than " + number + " consecutively ==> " + tempStack.size());
        }
*/

    }
}
