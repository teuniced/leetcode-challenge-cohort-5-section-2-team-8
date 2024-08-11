package com.bptn.leetcode_challenge_team_8.leetcode.challenge3;

public class Solution {

	//This class contains the method to find the missingNumber
	public int missingNumber(int[] nums) {
		
		//Gets the length of the array
		int length = nums.length;
		int expectedSum = (length * (length + 1)) / 2;
		int actualSum = 0;

		//Using the enhanced for loop, iterate through the array
		for (int num : nums) {
			actualSum += num;
		}

		//returns the only number in the range that is missing from the array
		return expectedSum - actualSum;
	}

}
