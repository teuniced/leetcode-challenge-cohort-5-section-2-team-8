package com.bptn.leetcode_challenge_team_8.leetcode.challenge4;

//Importing the necessary util packages
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();

		// Test case 1
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println("Test case 1: " + listNodeToString(result));

		// Test case 2
		ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9))));
		ListNode result2 = solution.addTwoNumbers(l3, l4);
		System.out.println("Test case 2: " + listNodeToString(result2));

		
		
		// The execution time of the method - This is to check for the time complexity of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");
	}

	// Private static helper method to print out the linkedlist objects instead of ListNode objects
	private static LinkedList<Integer> listNodeToString(ListNode node) {
		LinkedList<Integer>  values = new LinkedList<>();
		while (node != null) {
			values.add(node.val);
			node = node.next;
		}
		return values;
	}
 
}
