package com.sample.singleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class MainClass {
	public  static void main(String args[]) {
		String orig[] = { "1st", "2nd", "3rd", "4th", "5th", "1st", "2nd", "3rd", "4th", "5th" };
		String act[] = { "2nd", "3rd", "6th" };
		List origList = new ArrayList(Arrays.asList(orig));
		List actList = Arrays.asList(act);

		System.out.println(origList.retainAll(actList));
		System.out.println(origList);
	}
}
