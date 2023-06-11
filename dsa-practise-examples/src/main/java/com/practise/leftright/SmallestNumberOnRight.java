package com.practise.leftright;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

//004 Compare with SmallestNumberOnLeft
public class SmallestNumberOnRight {
    public static void main(String[] args) {

        int[] numbers = new int[]{7, 2, 9, 3, 7, 2, 5, 9, 4, 2, 6, 8};

        Vector<Integer> resultVector = new Vector<>();
        Stack<Integer> tempStack = new Stack<>();


        System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length - 1; i > 0; i--) {
            if (tempStack.size() == 0) {
                tempStack.push(numbers[i]);
                resultVector.add(-1);
            } else if (numbers[i] < tempStack.peek()) {
                while (tempStack.size() > 0 && tempStack.peek() > numbers[i]) {
                    tempStack.pop();
                }

                if (tempStack.size() == 0) {
                    resultVector.add(-1);
                } else {
                    resultVector.add(tempStack.peek());
                }
                tempStack.push(numbers[i]);
            } else if (numbers[i] > tempStack.peek()) {
                resultVector.add(tempStack.peek());
                tempStack.push(numbers[i]);
            }


            System.out.println(resultVector);
            System.out.println(tempStack);

        }
    }
}