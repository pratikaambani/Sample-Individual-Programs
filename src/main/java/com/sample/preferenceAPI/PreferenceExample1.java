package com.sample.preferenceAPI;

import java.util.prefs.Preferences;

public  class PreferenceExample1 {
	private Preferences prefs;

	public  void setPreference() {
		// This will define a node in which the preferences can be stored
		prefs = Preferences.userRoot().node(this.getClass().getName());
		String ID1 = "Test1";
		String ID2 = "Test2";
		String ID3 = "Test3";

		// First we will get the values
		// Define a boolean value
		System.out.println(prefs.getBoolean(ID1, false));
		// Define a string with default "Hello World
		System.out.println(prefs.get(ID2, "Hello Abd"));
		// Define a integer with default 50
		System.out.println(prefs.getInt(ID3, 13));

		// now set the values
		prefs.putBoolean(ID1, true);
		prefs.put(ID2, "Hello Mumbai");
		prefs.putInt(ID3, 51);

		// Delete the preference settings for the first value
		prefs.remove(ID1);

	}

	public  static void main(String[] args) {
		PreferenceExample1 test = new PreferenceExample1();
		test.setPreference();
	}
}
