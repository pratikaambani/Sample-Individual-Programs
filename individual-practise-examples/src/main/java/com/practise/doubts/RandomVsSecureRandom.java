package com.practise.doubts;

import java.security.SecureRandom;
import java.util.Random;

public class RandomVsSecureRandom {

	public static void main(String args[]) {

		Random r = new Random();
		System.out.println("Random is more predictable" + r.nextInt());

		SecureRandom sr = new SecureRandom();
		System.out.println("Secure Random is less predictable = " + sr.nextInt());

	}
}
