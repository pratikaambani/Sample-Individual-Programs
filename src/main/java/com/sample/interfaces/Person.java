package com.sample.interfaces;

class Person implements Printable {
	private String name = "Pratik";
	private int age = 22;

	public  void printAll() {
		System.out.println("Name is " + name + ", age is " + age);
	}
}

class Stock implements Printable {
	private String tickerSymbol = "tickerSymbol";
	private int shares = 100;
	private int currentPrice = 4000;

	public  void printAll() {
		System.out.println(tickerSymbol + " " + shares + " shares at "
				+ currentPrice);
		System.out.println("Value: " + currentPrice * shares);
	}

	public  void sell() {
		System.out.println(tickerSymbol + " sold");
	}
}