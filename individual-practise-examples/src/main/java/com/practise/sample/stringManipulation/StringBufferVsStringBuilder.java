package com.practise.sample.stringManipulation;

/**
 * Created by Pratik Ambani on 26/11/2017.
 */
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int number = 99999999;
        long startTime;

        {
            StringBuffer sb = new StringBuffer();
            startTime = System.currentTimeMillis();
            for (int i = number; i-- > 0; ) {
                sb.append("");
            }
            System.out.println("StringBuffer: " + (System.currentTimeMillis() - startTime));
        }

        {
            StringBuilder sb = new StringBuilder();
            startTime = System.currentTimeMillis();
            for (int i = number; i-- > 0; ) {
                sb.append("");
            }
            System.out.println("StringBuilder: " + (System.currentTimeMillis() - startTime));
        }
    }
}