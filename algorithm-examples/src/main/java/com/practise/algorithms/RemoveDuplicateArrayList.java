package com.practise.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove duplicate elements stored in ArrayList
 * 
 * @author Pratik Ambani
 */

public class RemoveDuplicateArrayList {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(1);

		System.out.println("Array List which contains duplicate elements ");
		System.out.println(list);

		System.out.println("After removing Duplicate from  Array List ");

		// Using set API we can remove duplicates elements from the list
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);

	}

}
