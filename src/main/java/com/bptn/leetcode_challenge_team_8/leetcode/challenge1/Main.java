package com.bptn.leetcode_challenge_team_8.leetcode.challenge1;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		// Test case 1: Testing the method with an array of integers
		int[] salary1 = { 1000, 2000, 3000 };
		System.out.println("Test case 1: " + solution.average(salary1));

		// Test case 2:Testing the method with an array of integers
		int[] salary2 = { 8000, 9000, 2000, 3000, 6000, 1000 };
		System.out.println("Test case 2: " + solution.average(salary2));

		// Test case 3: Testing the method with an array of integers
		int[] salary3 = { 4000, 3000, 1000, 2000 };
		System.out.println("Test case 3: " + solution.average(salary3));

		// The execution time of the method - This is to check for the time complexity
		// of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");

	}

}
