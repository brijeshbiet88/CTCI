package com.ctci.list;

import java.util.HashSet;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class ListLoopStart {
	
	public static ListNode FindBeginning(ListNode head) {
		ListNode slow = head;
		ListNode fast = head; 
		
		// Find meeting point
		while (fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		// Error check - there is no meeting point, and therefore no loop
		if (fast == null || fast.next == null) {
			return null;
		}else {
			System.out.println("Meeting  Point : "+fast.data);
		}

		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps
		/* from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start. */
		slow = head; 
		while (slow != fast) { 
			slow = slow.next; 
			fast = fast.next; 
		}
		
		// Both now point to the start of the loop.
		return fast;
	}
	
	public static void main(String[] args) {
		ListNode start = ListUtil.getListWithLoop();
		printListWithLoop(start);
		ListNode loop = FindBeginning(start);
		if (loop == null) {
			System.out.println("No Cycle.");
		} else {
			System.out.println("Starting Point : "+loop.data);
		}
	}
	
	private static void printListWithLoop(ListNode start) {
		HashSet<ListNode> set = new HashSet<ListNode>();
		ListNode temp = start;
		
		while(!set.contains(temp)) {
			System.out.print(temp.data+"->");
			set.add(temp);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
