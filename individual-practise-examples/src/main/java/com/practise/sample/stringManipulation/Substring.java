package com.practise.sample.stringManipulation;

public class Substring {
	public static void main(String args[]) {

		String alphabets = "abcdefghijklmnopqerstuvwxyz";

		String subSet = alphabets.substring(3);

		String subStr = alphabets.substring(alphabets.indexOf("p"));

		System.out.println("alphabets = " + alphabets);

		String requiredValue = alphabets.substring(0, alphabets.indexOf("p"));

		System.out.println("subSet = " + subSet);
		System.out.println("subStr = " + subStr);

		System.out.println("requiredValue = " + requiredValue);

	}

}
