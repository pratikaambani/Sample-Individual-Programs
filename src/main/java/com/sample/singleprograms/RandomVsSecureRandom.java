package com.sample.singleprograms;

import java.util.Random;

import java.security.SecureRandom;

public class RandomVsSecureRandom {

	public static void main(String args[]) {

		Random r = new Random();
		System.out.println("Random is more predictable" + r.nextInt());

		SecureRandom sr = new SecureRandom();
		System.out.println("Secure Random is less predictable = " + sr.nextInt());

	}
}
