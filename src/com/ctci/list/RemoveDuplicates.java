package com.ctci.list;

import java.util.HashSet;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ListNode start = ListUtil.getList2();
		System.out.println("Original List : ");
		ListUtil.print(start);
		start = removeDuplicates(start);
		System.out.println("List After Removing Duplicate Nodes : ");
		ListUtil.print(start);
		
		System.out.println("===================Method 2======================");

		ListNode start2 = ListUtil.getList2();
		System.out.println("Original List : ");
		ListUtil.print(start2);
		start2 = removeDuplicates2(start2);
		System.out.println("List After Removing Duplicate Nodes : ");
		ListUtil.print(start2);
	}

	private static ListNode removeDuplicates(ListNode start) {
		ListNode tmp1 = start;
		ListNode tmp2;
		while(tmp1 != null && tmp1.getNext() != null) {
			tmp2 = tmp1;
			while(tmp2.getNext() != null) {
				
				if(tmp2.getNext().getData() == tmp1.getData()) {
					tmp2.setNext(tmp2.getNext().getNext());
				}else {
					tmp2 = tmp2.getNext();
				}
			}
			tmp1 = tmp1.getNext();
		}
		return start;
	}
	
	private static ListNode removeDuplicates2(ListNode start) {
		ListNode tmp = start;
		ListNode prev = null;
		HashSet<Integer> set = new HashSet<Integer>();
		while(tmp != null) {
			
			if(set.contains(tmp.data)) {
				prev.setNext(tmp.getNext());
			}else {
				prev = tmp;
				set.add(tmp.data);
			}
			tmp = tmp.getNext();
		}
		return start;
	}

}

/*
Original List : 
10->2->8->5->4->5->2->5->8->2->Null
List After Removing Duplicate Nodes : 
10->2->8->5->4->Null
 * */
