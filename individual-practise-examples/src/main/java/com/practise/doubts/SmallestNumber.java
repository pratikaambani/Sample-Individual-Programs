package com.practise.doubts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Created by Pratik Ambani on 11/10/2017.
 */

public class SmallestNumber {

    static String num;
    static int getSmallestNumber() {

        int n = 811295172;

        int a = n % 10;


        return 5;
    }


    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter writer = null;
        if(fileName != null) {
            writer = new BufferedWriter(new FileWriter(fileName));
        } else {
            writer = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
/*
        res = getSmallestNumber();
        writer.write(res);
*/
        writer.newLine();
        writer.close();
    }
}
