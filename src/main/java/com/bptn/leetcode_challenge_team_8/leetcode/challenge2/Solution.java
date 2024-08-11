package com.bptn.leetcode_challenge_team_8.leetcode.challenge2;

import java.util.Arrays;

// This class contains the method to sort the squares of Integers in a sorted array
public class Solution {

	// Method to return an array of the squares of the element in the input array,
	// sorted in ascending order
	public int[] sortedSquares(int[] nums) {

		// Creating the new array to store the squared values, same length as the input
		// array
		int[] sorted = new int[nums.length];

		// Using a traditional for loop to loop through each element in the input array

		for (int i = 0; i < nums.length; i++) {
			// Square each element and store it in the new array
			sorted[i] = nums[i] * nums[i];
		}

		Arrays.sort(sorted);
		// Return the sorted array.
		return sorted;
	}

}
