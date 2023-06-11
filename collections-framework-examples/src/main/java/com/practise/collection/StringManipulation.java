/*
package com.practise.collection;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {
    public static void main(String[] args) {

*/
/*
        AABBBCBBAACCE
        A2 B3 C1 B2 A2 C2 E
*//*


        String value = "AABBBCBBAACCE";
        char[] chars = value.toCharArray();

        Map members = new HashMap();
        for (int a = 0; a < chars.length-1; a++) {
            int count = 1;

            if (chars[a] == chars[a+1]) {
                count++;
                ++a;
            }
            System.out.println(chars[a] + " " +count);
        }


*/
/*
        for (int a = 0; a < chars.length-1; a++) {
            int count = 1;

            if (chars[a] == chars[a+1]) {
                count++;
                ++a;
            }
            System.out.println(chars[a] + " " +count);
        }
*//*


    }
}
//A
//2
//B
//2
//B
//1
//C
//1
//B
//2
//A
//2
//C
//2
//*/
