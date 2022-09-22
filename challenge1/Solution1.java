package com.revature.challenge1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution1 {
	
	// Gets the Second Largest Integer from a set of 3 integers

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		int numOfCases = myScan.nextInt();
		int[] output = new int[numOfCases];
		
		for(int i = 0; i < numOfCases; i++) {
			
			Integer[] array = new Integer[3];
			
			for(int j = 0; j < 3; j++) {
				
				array[j] = myScan.nextInt();
			
			}
			
			Arrays.sort(array, Collections.reverseOrder());
			output[i] = array[1];
			
		}
		
		for(int i : output) {
			System.out.println(i);
		}
		
		
		myScan.close();
	}

}
