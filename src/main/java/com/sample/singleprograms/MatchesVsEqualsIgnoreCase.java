package com.sample.singleprograms;



public class MatchesVsEqualsIgnoreCase {

	public static void main(String[] args) {

		System.out.println("Start");

		String hello = "hello";

		System.out.println("Matches Ex -- " + hello.matches(".*e.*"));

		System.out.println("EqualsIgnoreCase Ex -- "
				+ hello.equalsIgnoreCase(".*e.*"));

	}

}
