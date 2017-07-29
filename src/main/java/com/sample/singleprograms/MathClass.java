package com.sample.singleprograms;

public class MathClass {

	public static void main(String[] args) {
		
		double d1 = 5.45;
		
		
		System.out.println("d1 = " +Math.floor(d1));
		System.out.println("d2 = " +Math.ceil(d1));
		
		
		int random = (int) (Math.random()*100);
		System.out.println("Get me some random value ------> " +random);


	}

}
