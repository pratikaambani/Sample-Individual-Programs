package com.practise.sample.stringManipulation;

import java.util.StringTokenizer;

public class StringSplitAndTokenuizer {

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Dont use StringTokenizer, rather use split() of String class");
        while (st.hasMoreTokens()) {
            System.out.println("WordWise using StringTokenizer = " + st.nextToken());
        }

		String str = "This is String , split by StringTokenizer, created by pratik";
		System.out.println(" Split by space ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println(" Split by comma ',' ");
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}


		String ss = "Dont use StringTokenizer, rather use split() of String class";
        for (String separate : ss.split(" ")) {
            System.out.println("Using Split()= " + separate);
        }

    }

}
