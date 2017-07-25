package com.sample.singleprograms;

import java.util.StringTokenizer;

public class StringSplitAndTokenuizer {

	public static void main(String args[]) {

		StringTokenizer st = new StringTokenizer("Dont use this class, rather use split() of String class");

		while (st.hasMoreTokens()) {
			System.out.println("WordWise using StringTokenizer = " + st.nextToken());
		}
		
		String ss = "Dont use this class, rather use split() of String class";
		
		for (String separate : ss.split(" ")) {
			
			System.out.println("Using Split()= " +separate);			
		}
		
	}
}
