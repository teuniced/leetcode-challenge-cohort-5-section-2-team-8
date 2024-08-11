package com.bptn.leetcode_challenge_team_8.leetcode.challenge4;

//Importing the necessary util packages
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();

		// Test case 1: Adding 2 numbers that is formed from a linked list
		// (2,4,3) to 243 and (5,4,3) to 564
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println("Test case 1: " + listNodeToLinkedList(result));

		// Test case 2: Adding 2 numbers that is formed from a linked list
		// (9,9,9,9,9,9,9) to 9999999 and (9,9,9,9) to 9999
		ListNode l3 = new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		ListNode result2 = solution.addTwoNumbers(l3, l4);
		System.out.println("Test case 2: " + listNodeToLinkedList(result2));

		// The execution time of the method - This is to check for the time complexity
		// of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");
	}

	// Private static helper method to print out the LinkedList objects instead of
	// ListNode objects
	// This method converts a ListNode to a LinkedList
	private static LinkedList<Integer> listNodeToLinkedList(ListNode node) {
		// Initializing a new LinkedList to store the values
		LinkedList<Integer> values = new LinkedList<>();
		// Conditional statement to traverse the ListNode until it is empty,
		// then adding the current node's value to the LinkedList
		while (node != null) {
			values.add(node.val);
			node = node.next;
		}
		return values;
	}
}
