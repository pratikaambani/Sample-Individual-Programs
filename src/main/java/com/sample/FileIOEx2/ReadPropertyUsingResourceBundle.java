package com.sample.FileIOEx2;

import java.util.ResourceBundle;

public class ReadPropertyUsingResourceBundle {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("AppResources");

		System.out.println(" First Name = " + rb.getString("FirstName"));

		System.out.println(" Last Name = " + rb.getString("LastName"));

	}

}
