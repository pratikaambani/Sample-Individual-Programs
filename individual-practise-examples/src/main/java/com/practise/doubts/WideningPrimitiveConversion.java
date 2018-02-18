package com.practise.doubts;

/**
 * Created by Pratik Ambani on 8/12/2017.
 */
public class WideningPrimitiveConversion {
    public static void main(String[] args) {

        withPlus();
        System.out.println("\n");
        withoutPlus();
    }

    private static void withoutPlus() {
        System.out.print("Y" + "O");
        System.out.print('L');
        System.out.print('O');
    }

    private static void withPlus() {
        System.out.print("Y" + "O");
        System.out.print('L' + 'O');
    }
}
