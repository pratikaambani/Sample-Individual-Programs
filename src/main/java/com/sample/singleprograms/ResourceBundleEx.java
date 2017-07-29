package com.sample.singleprograms;

import java.util.ResourceBundle;

public class ResourceBundleEx {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("appres");

		String valueOfS2 = rb.getString("s2");
		String valueOfS1 = rb.getString("s1");

		System.out.println("value = " + valueOfS2);
		System.out.println("value = " + valueOfS1);
	}

}
