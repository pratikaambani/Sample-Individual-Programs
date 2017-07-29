package com.sample.overloading;


public class OverridingExperiment {

	public static void main(String[] args) {

		System.out.println("Overriding");

		OverridingExperiment oE = new OverridingExperiment();

		// float f = oE.addValues(1, 2);

		// System.out.println("f = " +f);

	}

	float addValues(float a, float b) {
		return a + b;
	}

	float addValues(float a, int b) {
		return a * a + b * b;
	}

	float addValues(int a, float b) {
		return a * a + b * b;
	}

}
