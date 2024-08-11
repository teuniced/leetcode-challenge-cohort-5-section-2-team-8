package com.bptn.leetcode_challenge_team_8.leetcode.challenge1;

//This class contains the solution to solve the challenge
public class Solution {
	// This method calculates the average salaries excluding the min and max
	// salaries.
	public double average(int[] salary) {

		// Initializing the variables and the final calculated average
		// and the return type as stated from leetcode.
		double result, sum = 0;

		// Initializing the variables with the first element of the
		// salary array before it begins its iteration across the loop
		int min = salary[0];
		int max = salary[0];

		// Calculating the length for average which excludes min and max
		int length = (salary.length) - 2;

		// iterating through all salaries using a for each loop
		for (int salaries : salary) {
			sum += salaries;
			// Conditional statement to update the min salary if a lower/higher salary
			// is found when looping across the index
			if (salaries < min)
				min = salaries;
			if (salaries > max)
				max = salaries;
		}
		// Calculating the average salary excluding the min and max salaries.
		result = (sum - min - max) / length;
		return result;
	}
}
