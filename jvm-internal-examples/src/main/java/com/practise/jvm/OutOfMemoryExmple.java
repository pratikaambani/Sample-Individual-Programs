package com.practise.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * Below class is example of ava.lang.OutOfMemoryError: Java heap space
 * 
 * @author Pratik Ambani
 * 
 */
public class OutOfMemoryExmple {

	public static void main(String[] args) {

		List<String> l = new LinkedList<String>();

		// Enter infinite loop which will add a String to the list: l on each
		// iteration.
		do {

			l.add(new String("Hello, World"));
		} while (true);
	}

}
