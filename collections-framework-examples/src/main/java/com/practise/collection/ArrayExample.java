package com.practise.collection;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //1
        int[] integerArray1 = new int[5];
        integerArray1[0] = 0;
        integerArray1[1] = 1;
        integerArray1[2] = 2;
        integerArray1[3] = 3;
        integerArray1[4] = 4;
        System.out.println(Arrays.toString(integerArray1));

        //2
        int[] integerArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(integerArray2));

        //3
        int[] integerArray3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(integerArray3));

        //4
        String[] stringArray1 = new String[]{"A", "B", "C", "D"};
        System.out.println(Arrays.toString(stringArray1));

    }

}
