package com.bptn.leetcode_challenge_team_8.leetcode.challenge1;

public class Solution {
	public double average(int[] salary) {
		double result, sum = 0;
		int min = salary[0];
		int max = salary[0];

		int length = (salary.length) - 2;

		for (int salaries : salary) {
			sum += salaries;
			if (salaries < min)
				min = salaries;
			if (salaries > max)
				max = salaries;
		}
		
		result =(sum-min-max)/length;
		return result;
	}
}
