package com.practise.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given Array contains String object.sort the array base on String length
 * 
 * @author Pratik Ambani
 */
public class ArraySorting {

	public static void main(String arg[]) {

		int MAX_SIZE = 5;
		String strArray[] = new String[MAX_SIZE];
		strArray[0] = "abcdefghi";
		strArray[1] = "a";
		strArray[2] = "abce";
		strArray[3] = "ab";
		strArray[4] = "abc";

		System.out.println("Before Sorting  ");
		System.out.println("================");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		Arrays.sort(strArray, new Comparator<String>() {

			// logic for string sorting base on string length
//			@Override
			public int compare(String o1, String o2) {
				// Ascending order
				// return o1.length() - o2.length();
				// Descending order
				return o2.length() - o1.length();
			}
		});

		System.out.println("After Sorting");
		System.out.println("================");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
