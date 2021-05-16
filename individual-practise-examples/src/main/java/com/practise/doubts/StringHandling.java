package com.practise.doubts;

import java.util.ArrayList;
import java.util.List;

public class StringHandling {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("c++");
		Employee employee = new Employee(1, "Pratik", l);
		System.out.println(employee.toString());
		l = employee.getSubjectList();
		l.add("JAVA");
		System.out.println(employee.toString());

	}

}
