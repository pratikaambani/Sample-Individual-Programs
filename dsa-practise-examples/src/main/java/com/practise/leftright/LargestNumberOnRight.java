package com.practise.leftright;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;


//https://www.youtube.com/playlist?list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd
//001
public class LargestNumberOnRight {
    public static void main(String[] args) {

        System.out.println("This is foundation");
        int[] numbers = new int[]{7, 2, 9, 3, 7, 2, 5, 9, 4, 2, 6, 8};

        Vector<Integer> resultVector = new Vector<>();
        Stack<Integer> tempStack = new Stack<>();

        for (int i = numbers.length - 1; i > 0.; i--) {
            if (tempStack.size() == 0) {
                resultVector.add(-1);
                tempStack.push(numbers[i]);
            } else if (tempStack.peek() > numbers[i]) {
                tempStack.push(numbers[i]);
                resultVector.add(numbers[i+1]);
            } else if (tempStack.peek() < numbers[i]) {
                while (tempStack.size() > 0 && tempStack.peek() <= numbers[i]) {
                    tempStack.pop();
                }
                if (tempStack.size() == 0) {
                    resultVector.add(-1);
                } else {
                    resultVector.add(tempStack.peek());
                }
                tempStack.push(numbers[i]);
            }

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(resultVector);
        System.out.println(tempStack);

    }
}
