package com.sample.singleprograms;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateLocaleGetinstance {

	public static void main(String[] args) {

		Locale locale1 = Locale.ITALY;

		TimeZone tz1 = TimeZone.getTimeZone("GMT");
		Calendar cal1 = Calendar.getInstance(tz1, locale1);

		Locale locale2 = Locale.GERMANY;
		TimeZone tz2 = TimeZone.getTimeZone("EST");
		Calendar cal2 = Calendar.getInstance(tz2, locale2);

		String tzname1 = tz1.getDisplayName();
		String tzname2 = tz2.getDisplayName();

		String name1 = locale1.getDisplayName();
		String name2 = locale2.getDisplayName();

		System.out.println("GMT and Canada: " + tzname1 + " " + name1);
		System.out.println("EST and Germany: " + tzname2 + " " + name2);

		System.out.println("EST and Germany: " + cal1);
		System.out.println("EST and Germany: " + cal2);
	}
}