package com.sample.threadFailEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastEx {

	public static void main(String[] args) {
		Map<String, String> mValue = new HashMap<String, String>();
		mValue.put("One", "This ");
		mValue.put("Two", "is ");
		mValue.put("Three", "test");
		mValue.put("Four", "Example.");

		Iterator it = mValue.keySet().iterator();

		while (it.hasNext()) {
			System.out.println(mValue.get(it.next()));
			mValue.put("Six", "This won't be printed.");
		}

	}

}