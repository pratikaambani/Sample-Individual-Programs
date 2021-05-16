package com.practise.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Sorting Hashmap base on values using comparator
 * 
 * @author Pratik Ambani
 * 
 */
public class HashmapSortingBaseonValue {

	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		// Filling up map
		hmap.put("Pratik", 100);
		hmap.put("Ankit", 200);
		hmap.put("Bhavik", 50);
		hmap.put("Viral", 150);
		hmap.put("Gaurav", 80);
		System.out.println("BEFORE SORTING");
		System.out.println("=================");
		for (Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		sortingMapUsingComparator(hmap);
		sortingMapUsingTreeMap(hmap);
	}

	/**
	 * 
	 * Sorting Hashmap base on value using set-> List -> comparator
	 * 
	 * @param hmap
	 */
	private static void sortingMapUsingComparator(Map<String, Integer> hmap) {
		Set<Entry<String, Integer>> set = hmap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);
		// Implement anonymous comparator
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> entry1,
                               Entry<String, Integer> entry2) {

				return entry1.getValue() - entry2.getValue();
			}
		});

		System.out.println("Sorting using Set -> List ");
		System.out.println("=================");
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

	/**
	 * Sort Hashmap base on value using Treemap.
	 * <p>
	 * 1. Construct treemap using comparator which sort map base on value.
	 * </p>
	 * <p>
	 * 2. Add elements in Treemap using Hashmap
	 * </p>
	 * .
	 * 
	 * @param hmap
	 */
	private static void sortingMapUsingTreeMap(Map<String, Integer> hmap) {
		MapSortingComparator mapSortingComparator = new MapSortingComparator(
				hmap);
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(
				mapSortingComparator);
		tmap.putAll(hmap);
		System.out.println("Sorting using treemap ");
		System.out.println("======================");
		for (Entry<String, Integer> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}

/**
 * 
 * @author Pratik Ambani
 * 
 */
class MapSortingComparator implements Comparator<String> {

	private Map<String, Integer> map;

	public MapSortingComparator(Map<String, Integer> hmap) {
		this.map = hmap;
	}

	@Override
	public int compare(String o1, String o2) {
		return map.get(o1) - map.get(o2);
	}

}