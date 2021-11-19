package com.practise.sample.stringManipulation;


import java.util.Date;

public class intVSInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer capsInt1 = new Integer(5);
		Integer capsInt2 = new Integer(17);

		int smallint1 = capsInt1.intValue();
		int smallint2 = capsInt2.intValue();

		System.out
				.println("smallint1 + smallint2 = " + (smallint1 + smallint2));

		Integer xy = new Integer(smallint1 + smallint2);

		System.out.println("xy = " + xy);
		System.out.println("xy = " + (capsInt1 + capsInt2));

	}

}
