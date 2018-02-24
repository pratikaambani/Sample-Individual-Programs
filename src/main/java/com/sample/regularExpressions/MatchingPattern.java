package com.sample.regularExpressions;

import java.util.regex.Pattern;

public class MatchingPattern {
    public static void main(String args[]) {
        System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
        System.out.println(Pattern.matches(".s", "aaas"));
        System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is
        // not s)
        System.out.println(Pattern.matches(".s", "mst"));// false (has more than
        // 2 char)
        System.out.println(Pattern.matches(".s", "amms"));// false (has more
        // than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));
        // true (3rd char is
        // s)
        System.out.println("-------------------------------");

        String including = "[abcd]";
        System.out.println(Pattern.matches(including, "b"));

        String notIncluding = "^[abcd]";
        System.out.println(Pattern.matches(notIncluding, "ab"));

        String aToz = "[a-z]";
        System.out.println(Pattern.matches(aToz, "p"));
        System.out.println(Pattern.matches(aToz, "P"));

    }
}