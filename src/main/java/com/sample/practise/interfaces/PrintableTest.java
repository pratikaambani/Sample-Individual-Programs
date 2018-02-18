package com.sample.practise.interfaces;

public class PrintableTest {
	public static void main(String[] args) {
		Person p = new Person();
		Stock s = new Stock();

		p.printAll();
		s.printAll();

		Printable pr = p;
		pr.printAll();

		pr = s;
		pr.printAll();

	}
}