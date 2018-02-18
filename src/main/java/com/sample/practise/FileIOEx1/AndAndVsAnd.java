package com.sample.practise.FileIOEx1;

public class AndAndVsAnd {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		String xBinay = Integer.toBinaryString(x);
		String yBinay = Integer.toBinaryString(y);

		System.out.println("Uncomment below line");
//		String z = Integer.toBinaryString(y) & Integer.toBinaryString(y);
//		System.out.println("z = " +z);
		
		if(x>0 && x<50) {
			System.out.println("Yep, Inside range.");
		}
		
		if(x>0 & x<50) {
			System.out.println("Yep, Inside range.");
		}
		
		

	}

}
