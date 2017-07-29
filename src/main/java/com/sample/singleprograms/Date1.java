package com.sample.singleprograms;

import java.util.Date;

public  class Date1 {
	public  static void main(String args[]) {

		java.util.Date d1 = new java.util.Date();
		System.out.println(d1);

		long miliSec = System.currentTimeMillis();

		java.util.Date d2 = new java.util.Date(miliSec);
		System.out.println(d2);

		java.sql.Date sDate = new java.sql.Date(miliSec);
		System.out.println(sDate);
		
		System.out.println(d1.toString());

	}

}
