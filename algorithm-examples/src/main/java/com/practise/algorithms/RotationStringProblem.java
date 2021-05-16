package com.practise.algorithms;

/**
 * Take two input from the user 1) number of rotations 2) Direction of the
 * rotation (right/left) if no of rotation is 2 and direction is (right) and
 * word is "hello". output should be "lohel" Ask in oracle india
 * 
 * @author Pratik Ambani
 * 
 */
public class RotationStringProblem {

	public static void main(String[] args) {
		int rotation = 2;
		String direction = "LEFT";
		String data = "hello";
		rotation(rotation, direction, data);
	}

	public static void rotation(int rotation, String direction, String data) {
		char[] charArray = data.toCharArray();
		char tmpArray[] = new char[charArray.length];
		while (rotation > 0) {
			if (direction.equals("LEFT")) {
				tmpArray[tmpArray.length - 1] = charArray[0];
				for (int i = 1; i < charArray.length; i++) {
					tmpArray[i - 1] = charArray[i];
				}

			} else {
				tmpArray[0] = charArray[charArray.length - 1];
				for (int i = 1; i < charArray.length; i++) {
					tmpArray[i] = charArray[i - 1];
				}
			}
			System.arraycopy(tmpArray, 0, charArray, 0, tmpArray.length);
			rotation--;
		}
		System.err.println(tmpArray);

	}
}