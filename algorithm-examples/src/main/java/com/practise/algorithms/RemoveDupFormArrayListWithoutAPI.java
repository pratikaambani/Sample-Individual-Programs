package com.practise.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Find out duplicate elements from the ArrayList
 * <p>
 * <b>Input : </b> [1, 1, 2, 2, 3, 1, 4, 4, 1]
 * </p>
 * <p>
 * <b>Output:</b>
 * </p>
 * [1, 2, 3, 4]
 * 
 * @author Pratik Ambani
 * 
 */
public class RemoveDupFormArrayListWithoutAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> DataElement = new ArrayList<Integer>();
		DataElement.add(1);
		DataElement.add(1);
		DataElement.add(2);
		DataElement.add(2);
		DataElement.add(3);
		DataElement.add(1);
		DataElement.add(4);
		DataElement.add(4);
		DataElement.add(1);
		System.out.println("Before Processing");
		System.out.println("=================");
		System.out.println(DataElement.toString());
		groupByDuplicate(DataElement);

	}

	/**
	 * Core logic for Removing duplicate elements from ArrayList
	 * 
	 * @param list
	 */
	static void groupByDuplicate(List<Integer> list) {

		System.out.println("After Removing  Duplicates");
		System.out.println("==========================");
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list.toString());
	}
}
