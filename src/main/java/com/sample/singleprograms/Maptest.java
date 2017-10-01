package com.sample.singleprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maptest {

	public static void main(String[] args) {
		Map<String, String> lists = new HashMap<String, String>();
		lists.put("1", "P");
		lists.put("2", "R");
		lists.put("3", "A");
		lists.put("4", "T");
		;
		;
		;
		lists.put("5", "I");
		lists.put("6", "K");

		System.out.println("FIFTH ELEMENT IS " + lists.get("5"));

		System.out.println("Does list contain s? " + lists.containsValue("K"));

		for (String key : lists.keySet()) {
			System.out.println("keys are  = = " + lists.get(key));
		}

		Set s = lists.entrySet();

		Iterator it = (Iterator) s.iterator();

		while (it.hasNext()) {
			System.out.println("values are " + it.next());
		}

		for (;;) {
			System.out.println("Tester");
		}

	}

}