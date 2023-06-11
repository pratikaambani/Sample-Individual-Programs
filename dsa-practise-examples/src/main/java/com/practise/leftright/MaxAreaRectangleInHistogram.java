package com.practise.leftright;

import java.util.Vector;

//007
public class MaxAreaRectangleInHistogram {
    public static void main(String[] args) {

/*ABCD(m)
1        |   0   |   1   |   1   |   0   |
2        |   1   |   1   |   1   |   1   |
3        |   1   |   1   |   1   |   1   |
4(n)     |   1   |   1   |   0   |   1   |

        1. Check B column ==> 4*1
        2. Check (B1, C1) to (B3, C3) column ==> 3*2 ==> 6
        3. Check (B1, C1) to (B4, C4) column ==> 4*2 ==> 8

        Divide this 2D setup in 1D histogram(Program 6)

        Horizontal
            H1 ==> Histogram of 0110 ==> 2
            H2 ==> Histogram of 1221 ==> 4
            H3 ==> Histogram of 2332 ==> 8
            H4 ==> Histogram of 3401 (base cannot be zero for building, hawa me nai rah sakta, hence C4 and D4 is 0)==> 4

            Max of this is ==> H3 is answer ==> "8"

*/

        Vector<Integer> vector;

        int[][] numbers = new int[][]{
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}
        };
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();

        }

    }
}





