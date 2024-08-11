package com.bptn.leetcode_challenge_team_8.leetcode.challenge5;

public class Solution {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	    ListNode head = new ListNode();
	        
	    	//null checking
	        if(list1 == null && list2 == null) return null;  
	        if(list1 == null) return list2;
	        if(list2 == null) return list1;
	        
	      //comparing and merging
	        if(list1.val > list2.val) { 
	            head = list2;
	            list2 = list2.next;
	        }
	        else {
	            head = list1;
	            list1 = list1.next;
	        }
	        
	        head.next = mergeTwoLists(list1, list2);
	        return head;
	    }
	}


