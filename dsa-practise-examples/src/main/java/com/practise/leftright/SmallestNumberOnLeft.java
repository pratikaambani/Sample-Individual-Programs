package com.practise.leftright;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

//003 Compare with LargestNumberOnLeft
public class SmallestNumberOnLeft {
    public static void main(String[] args) {

        int[] numbers = new int[]{7, 2, 9, 3, 7, 2, 5, 9, 4, 2, 6, 8};

        Vector<Integer> resultVector = new Vector<>();
        Stack<Integer> tempStack = new Stack<>();


        for (int i = 0; i < numbers.length - 1; i++) {
            if (tempStack.size() == 0) {
                resultVector.add(-1);
                tempStack.push(numbers[i]);
            } else if (tempStack.peek() > numbers[i]) {
                while (tempStack.size() > 0 && tempStack.peek() > numbers[i]) {
                    tempStack.pop();
                }

                if (tempStack.size() == 0) {
                    resultVector.add(-1);
                    tempStack.push(numbers[i]);
                } else {
                    resultVector.add(tempStack.peek());
                    tempStack.push(numbers[i]);
                }
            } else if (tempStack.peek() < numbers[i]) {
                resultVector.add(tempStack.peek());
                tempStack.push(numbers[i]);
            }
        }


        System.out.println(Arrays.toString(numbers));
        System.out.println(resultVector);
        System.out.println(tempStack);

    }
}
