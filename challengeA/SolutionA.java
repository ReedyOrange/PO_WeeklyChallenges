package com.revature.challengeA;

import java.util.Arrays;
import java.util.Collections;

public class SolutionA {
// Write a method to sort the digits of each element in an array
//	by ascending or descending order
	
	
	public static void main(String[] args) {

		int[] array = {515, 341, 98, 44, 211};

		reorderDigits(array, "asc");

		System.out.println("---AFTER FUNCTION---");

		for (int i : array) {
			System.out.println(i);
		}

	}

	public static void reorderDigits(int[] array, String order) {

		if (order.equals("asc")) {

			// LOGIC HERE

			for (int i = 0; i < array.length; i++) {

				array[i] = orderNumber(array[i], order);

			}

			return;

		}

		if (order.equals("desc")) {

			// LOGIC HERE

			for (int i = 0; i < array.length; i++) {

				array[i] = orderNumber(array[i], order);

			}

			return;

		}

		System.out.println("function cannot process: '" + order + "'");

	}

	public static int orderNumber(int theNum, String order) {

		String tempNum = Integer.toString(theNum);
		int size = tempNum.length();

		Integer[] tempArray = new Integer[size];

		int index = 0;
		while (theNum > 0) {
			int temp = theNum % 10;
			theNum = theNum / 10;

			tempArray[index] = temp;
			index++;
		}

		if (order.equals("asc")) {

			Arrays.sort(tempArray);

			int returnNumber = 0;
			int multiplyBy10 = size - 1;

			for (int i : tempArray) {

				returnNumber = returnNumber + (i * (int) Math.pow(10, multiplyBy10));
				multiplyBy10--;

			}

			return returnNumber;

		}

		if (order.equals("desc")) {

			Arrays.sort(tempArray, Collections.reverseOrder());

			int returnNumber = 0;
			int multiplyBy10 = size - 1;

			for (int i : tempArray) {

				returnNumber = returnNumber + (i * (int) Math.pow(10, multiplyBy10));
				multiplyBy10--;

			}

			return returnNumber;

		}

		return 0;

	}

}
