package com.ctci.list;

import java.util.HashSet;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class ListWithLoop {

	public static void main(String[] args) {
		ListNode start1 = ListUtil.getList();
		boolean isLoop = findIfLoop(start1);
		System.out.println("Does Linked List Has Loop : "+isLoop);
		
		ListNode start = ListUtil.getListWithLoop();
		isLoop = findIfLoop(start);
		System.out.println("Does Linked List Has Loop : "+isLoop);
		System.out.println("Print List With Loop ");
		printListWithLoop(start);

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

	private static boolean findIfLoop(ListNode start) {
		ListNode slow = start , fast = start;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
	}

}
/*
Does Linked List Has Loop : false
Does Linked List Has Loop : true
Print List With Loop 
1->2->3->4->5->6->7->8->9->4

 * */
