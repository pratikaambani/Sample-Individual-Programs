package com.practise.doubts;

import java.util.ArrayList;
import java.util.List;

public final class Employee {

	private final int id;
	private final String name;
	private final List<String> subjectList;

	public Employee(int id, String name, List<String> subjectList) {
		super();
		this.id = id;
		this.name = name;
		this.subjectList = subjectList;
		// when we use Collections.unmodifiableList after that we change
		// colletion we get java.lang.UnsupportedOperationException
		// this.subjectList = Collections.unmodifiableList(subjectList);

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getSubjectList() {
		return new ArrayList<String>(subjectList);
		// return subjectList;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", subjectList="
				+ subjectList + "]";
	}

}
