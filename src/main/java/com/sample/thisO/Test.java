package com.sample.thisO;

public class Test {

	int a = 20;

	Test(int a) {
		System.out.println(this.a + a);
		this.a = a;

		System.out.println(a + a);
	}
}
