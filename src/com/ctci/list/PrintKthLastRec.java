package com.ctci.list;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class PrintKthLastRec {

	public static void main(String[] args) {
		ListNode start = ListUtil.getList2();
		System.out.println("Original List : ");
		ListUtil.print(start);
		int k = 2;
		printKthLast(start , k  );
	}

	private static int printKthLast(ListNode start, int k) {
		if(start == null) {
			return 0;
		}
		int index = printKthLast(start.next, k) + 1;
		
		if(index == k ) {
			System.out.println("Kth Last Node : "+ start.data);
		}
		
		return index;
	}

}

/*
Original List : 
10->2->8->5->4->5->2->5->8->2->Null
Kth Last Node : 8
 * */
