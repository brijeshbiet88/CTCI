package com.ctci.list;

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

}

/*
Original List : 
10->2->8->5->4->5->2->5->8->2->Null
List After Removing Duplicate Nodes : 
10->2->8->5->4->Null
 * */
