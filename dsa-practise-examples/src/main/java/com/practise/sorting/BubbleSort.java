package com.practise.sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = new int[]{6, 3, 9, 5, 2, 8};

        int[][] twoDimArray = {
                {1, 2, 3, 4, 5, 6, 7, 89},
                {9, 8, 7, 6, 5, 4, 3, 2, 1},
                {8, 3, 9, 2, 7, 1, 6, 3, 0}
        };

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
