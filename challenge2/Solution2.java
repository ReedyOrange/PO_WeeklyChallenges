package com.revature.challenge2;

import java.util.Scanner;

public class Solution2 {

	// Gets the Sum of all digits in a String
	
	public static void main(String[] args) {
		
		int numCases = 0;
		
		Scanner myScan = new Scanner(System.in);
		numCases = myScan.nextInt();
		
		int[] output = new int[numCases];
		
		for(int i = 0; i < numCases; i++) {
			
			String input = myScan.next();
			int sum = 0;
			
			for(int j = 0; j < input.length(); j++) {
				
				if(Character.isDigit(input.charAt(j))) {
					sum = sum + Character.getNumericValue(input.charAt(j));
				}
				
			}
			
			output[i] = sum;
			
		}
		
		for(int i : output) {
			System.out.println(i);
		}
		
		myScan.close();
		
	}

}
