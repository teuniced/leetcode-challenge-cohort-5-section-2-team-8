package com.bptn.leetcode_challenge_team_8.leetcode.challenge3;

public class Main {

	public static void main(String[] args) {

		//Created an instance of Solution to get the missingNumbers 
		Solution solution = new Solution();
		
		// Test case 1: Testing the method with an array of integers
		int[] nums1 = { 3, 0, 1 };
		System.out.println("Test case 1: " + solution.missingNumber(nums1));

		// Test case 2
		int[] nums2 = { 0, 1 };
		System.out.println("Test case 2: " + solution.missingNumber(nums2));

		// Test case 3
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println("Test case 3: " + solution.missingNumber(nums3));

		//The execution time of the method - This is to check for the time complexity of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");
	}
}
