package com.ctci.list;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class TraverseList {

	public static void main(String[] args) {
		ListNode start = ListUtil.getList();
		System.out.println("Print List : ");
		ListUtil.print(start);
		start = ListUtil.getList2();
		System.out.println("Print List 2 : ");
		ListUtil.print(start);
	}

}
/*
 *Print List : 
1->2->3->3->4->5->Null
Print List 2 : 
10->2->8->5->4->5->2->5->8->Null
 * */
 