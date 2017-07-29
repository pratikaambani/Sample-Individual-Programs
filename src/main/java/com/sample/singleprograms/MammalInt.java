package com.sample.singleprograms;


public class MammalInt implements Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt mml = new MammalInt();
		mml.eat();
		mml.sleep();

		System.out.println("Value of a from interface = " + MammalInt.a);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("tyhey eat");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("they sleep");
	}

}
