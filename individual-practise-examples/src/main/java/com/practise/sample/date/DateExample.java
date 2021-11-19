package com.practise.sample.date;

import java.util.Date;

public class DateExample {
	public static void main(String args[]) {

		sqlAndUtil();

		getDateDetails();


	}

	private static void sqlAndUtil() {
		Date d1 = new Date();
		System.out.println(d1);

		long miliSec = System.currentTimeMillis();

		Date d2 = new Date(miliSec);
		System.out.println(d2);

		java.sql.Date sDate = new java.sql.Date(miliSec);
		System.out.println(sDate);

		System.out.println(d1.toString());
	}

	private static void getDateDetails() {
		Date d = new Date();

		System.out.println("Date is = " + d);
		System.out.println("Date is = " + d.getDate());
		System.out.println("Date is = " + d.getDay());
		System.out.println("Date is = " + d.toString());
		System.out.println("Date is = " + d.getTime());
		System.out.println("Date is = " + d.getTimezoneOffset());
		System.out.println("Date is = " + d.toLocaleString());
		System.out.println("Date is = " + d.toGMTString());
	}

}
