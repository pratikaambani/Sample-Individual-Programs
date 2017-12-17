package com.sample.practise.oopsconcepts.accessModifiersAndThis;

public class Access {

	private int a = 1;
	private int b = 2;
	private int c = 3;

	public void setValues(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toHour() {
		String g = "a = " + a + " b = " + b + " c = " + c;
		return g;
	}

	public String toMin() {
		String f = "a = " + a * 10 + " b = " + b * 10 + " c = " + c * 10;
		return f;
	}

}
