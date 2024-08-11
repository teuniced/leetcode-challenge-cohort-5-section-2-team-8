package com.bptn.leetcode_challenge_team_8.leetcode.challenge4;


public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Create a temporary head node
		ListNode head = new ListNode();
		ListNode current = head;
		int carry = 0;

		// Traversing both listnode lists simultaneously
		while (l1 != null || l2 != null || carry != 0) {

			int val1 = 0, val2 = 0;
			if (l1 != null)
				val1 = l1.val;
			if (l2 != null)
				val2 = l2.val;

			// Calculating the carry and sum value
			int sum = val1 + val2 + carry;
			carry = sum / 10;

			// Creating a new node with the digit of sum
			current.next = new ListNode(sum % 10);

			// Reassigning the nodes in both lists if available
			current = current.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		return head.next;
	}
}
