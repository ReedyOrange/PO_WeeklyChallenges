package com.revature.challengeB;

public class SolutionB {

	public static void main(String[] args) {
		
		//Expected Results
		
		//canPartition([2, 8, 4, 1]) ➞ true
		// 8 = 2 x 4 x 1

		//canPartition([-1, -10, 1, -2, 20]) ➞ false

		//canPartition([-1, -20, 5, -1, -2, 2]) ➞ true
		
		int [] array = {2,8,4,1};
		System.out.println(canPartition(array));

		int [] array2 = {-1,-10,1,-2,20};
		System.out.println(canPartition(array2));

		int [] array3 = {-1,-20,5,-1,-2,2};
		System.out.println(canPartition(array3));

	}
	
	public static boolean canPartition(int[] array) {
		
		int toIgnore = 0;
		int ignoreOnce = 0; // To prevent skipping over duplicate numbers
		
		for(int i : array) {
			
			toIgnore = i;
			ignoreOnce = 0;
			int product = 1;
			
			for(int j : array) {
				
				if((toIgnore == j) && (ignoreOnce == 0)) {
					
					// do nothing
					ignoreOnce++;
					
				}
				else {
					
					product = product * j;
					
				}
				
			}
			
			if(toIgnore == product) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
