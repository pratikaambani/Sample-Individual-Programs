package com.practise.algorithms;

/**
 * find whether a number is palindrome or not. Here two approch 1.Loop 2.
 * recursion
 * 
 * @author Pratik Ambani
 * 
 */
public class CheckPalimdriomNumber {

	static int sum = 0;

	public static void main(String[] args) {
		int number = 121;
		if (numCheckUsingIteration(number)) {
			System.out.println("Given Number is Palimdrom :" + number);
		} else {
			System.err.println("Given Number is not Palimdrom :" + number);
		}

		int total = numCheckUsingRecursion(number);
		if (number == total) {
			System.out.println("Given number is palimdrom using recursion :"
					+ number);
		} else {
			System.err.println("Given Number is not palimdrom using recursion:"
					+ number);
		}
	}

	/**
	 * Check number is palimdrom or not using recusrion
	 * 
	 * @param num
	 * @return
	 */
	public static int numCheckUsingRecursion(int num) {
		int reminder = 0;
		if (num != 0) {
			reminder = num % 10;
			sum = sum * 10 + reminder;
			numCheckUsingRecursion(num / 10);
		}
		return sum;

	}

	/**
	 * check number is palimdrom or not using loop
	 * 
	 * @param num
	 * @return
	 */
	public static boolean numCheckUsingIteration(int num) {
		
		int sum = 0;
		int temp = num;
		boolean flag = false;
		while (num > 0) {
			int reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}
		if (temp == sum) {
			flag = true;
		}
		return flag;
	}
}
