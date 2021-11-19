package com.practise.sample.stringManipulation;

public class StringClass {

    public static void main(String args[]) {


        String s1 = new String("Pratik");
        String s2 = new String("Pratik");
        String s3 = new String("Ambani");
        System.out.println(s1 = s2);
        System.out.println(s1 = s3);

        String s5 = "Pratik";
        String s6 = "Pratik";
        String s7 = new String("Pratik");
        final String s8 = s7.intern();
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);
        System.out.println(s7 == s8);
        System.out.println(s5 == s7);
        System.out.println(s5 == s8);


        String aTz = "abcg";
        String dTz = "abcdefg";

        String sIntern = dTz.intern();
        System.out.println(sIntern);

        System.out.println(aTz.compareTo(dTz));
        System.out.println(dTz.compareTo(aTz));

        String name = "Pratik";
        String firstName = "Pratik";
        String abc = "abczsghdhbdfogdbnfog";

        System.out.println(name.length());
        System.out.println(abc.length());

        System.out.println(name.length() - abc.length());

        System.out.println(name.compareTo(firstName));
        System.out.println(name.compareTo(abc));

        System.out.println("name = " + name);
        System.out.println("firstname = " + firstName);

        System.out.println(firstName.charAt(3));
        System.out.println(abc.codePointAt(0));
        System.out.println(abc.codePointAt(1));
        System.out.println(abc.codePointAt(2));
        System.out.println(abc.codePointCount(0, 4));

        System.out.println("abc = " + abc);

        String formattedString = String.format("value is %f2", 21.435);
        System.out.println("abc = " + formattedString);

        System.out.println(abc.contains("abc"));

        System.out.println(abc.concat("def"));

        String fullSentence = "I am working for Reliance Communications";

        System.out.println("fullSentence = " + fullSentence);

        String[] a1 = fullSentence.split(" ");
        String[] a2 = fullSentence.split("\\s");
        // Splits whole Sentence String by String

        System.out.println(a1.length);

        for (String s : a1) {
            System.out.println("a1 waala = " + s);
        }

        for (String s : a2) {
            System.out.println("a2 waala = " + s);
        }

        String i = new String("intern");

        String intern = "intern";

        String copyIntern = i.intern();

        System.out.println("intern = " + intern);
        System.out.println("Copy intern = " + copyIntern);

        System.out.println("intern and copy intern = " + intern == copyIntern);
        System.out.println("intern and copy intern = " + i == copyIntern);
        System.out.println("intern and copy intern = " + i == intern);

        String immutable = "immutable";
        System.out.println(immutable);
        immutable.concat("Concatation");

        System.out.println(immutable);

        String Z4 = "0000";
        String Z5 = "00000";
        System.out.println("Response: " + Z5.contains(Z4));

    }

}
