package com.ctci.list;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class Partition {

	public static void main(String[] args) {
		ListNode start = new ListNode(3);
		start.setNext(new ListNode(5));
		start.next.setNext(new ListNode(8));
		start.next.next.setNext(new ListNode(5));
		start.next.next.next.setNext(new ListNode(10));
		start.next.next.next.next.setNext(new ListNode(2));
		start.next.next.next.next.next.setNext(new ListNode(1));
		
		System.out.println("Original List : ");
		ListUtil.print(start);
		ListNode partitionedList = partition(start, 5); 
		
		System.out.println("Partitioned List : ");
		ListUtil.print(partitionedList);
	}
	
	public static ListNode partition(ListNode node, int x) {
		ListNode beforeStart = null;
		ListNode beforeEnd = null;
		ListNode afterStart = null;
		ListNode afterEnd = null;
		
		/* Partition list */
		while (node != null) {
			ListNode next = node.next;
			node.next = null;
			if (node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}	
			node = next;
		}
		
		/* Merge before list and after list */
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}

}
/*
 * Original List : 
3->5->8->5->10->2->1->Null
Partitioned List : 
3->2->1->5->8->5->10->Null
 * */
