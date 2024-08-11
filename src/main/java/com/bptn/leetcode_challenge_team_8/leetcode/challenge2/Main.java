package com.bptn.leetcode_challenge_team_8.leetcode.challenge2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Created an instance of Solution to access the sortedSquares method
		Solution solution = new Solution();

		// Test case 1 : Testing the method with an array of positive and negative
		// numbers
		int[] nums1 = { -4, -1, 0, 3, 10 };

		// Print the result after sorting the square of the array elements
		System.out.println("Test case 1: " + Arrays.toString(solution.sortedSquares(nums1)));

		// Test case 2 : Testing the method with another array of positive and negative
		// numbers
		int[] nums2 = { -7, -3, 2, 3, 11 };
		// Print the result after sorting the square of the array elements
		System.out.println("Test case 2: " + Arrays.toString(solution.sortedSquares(nums2)));

		// Test case 3 : Testing the method with a mix of positive and negative numbers
		int[] nums3 = { 8, -1, 2, 9, 14 };

		// Print the result after sorting the square of the array elements
		System.out.println("Test case 3: " + Arrays.toString(solution.sortedSquares(nums3)));

		// The execution time of the method - This is to check for the time complexity
		// of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");

	}

}
