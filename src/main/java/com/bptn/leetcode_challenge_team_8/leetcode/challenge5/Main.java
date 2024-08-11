package com.bptn.leetcode_challenge_team_8.leetcode.challenge5;

//Importing the necessary util packages
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();

		// Test case 1
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode result = solution.mergeTwoLists(list1, list2);
		System.out.println("Test case 1: " + listNodeToLinkedList(result));

		// Test case 2: Merging an empty list with a non-empty list as per the test case
		// provided by leetcode
		ListNode list3 = null;
		ListNode list4 = new ListNode(0);
		ListNode result2 = solution.mergeTwoLists(list3, list4);
		System.out.println("Test case 2: " + listNodeToLinkedList(result2));

		// The execution time of the method - This is to check for the time complexity
		// of the method
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println("Execution time: " + duration + " milliseconds");
	}

	// Private static helper method to print out the linkedlist objects instead of
	// ListNode objects
	private static LinkedList<Integer> listNodeToLinkedList(ListNode node) {
		LinkedList<Integer> values = new LinkedList<>();
		while (node != null) {
			values.add(node.val);
			node = node.next;
		}
		return values;
	}

}
