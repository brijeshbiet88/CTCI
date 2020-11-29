package com.ctci.miscellaneous;

public class ListUtil {

	public static void print(ListNode start) {

		ListNode tmp = start;

		while (tmp != null) {
			System.out.print(tmp.data + "->");
			tmp = tmp.next;
		}
		System.out.println("Null");
	}

	public static ListNode getList() {
		ListNode start = new ListNode(1);
		start.setNext(new ListNode(2));
		start.next.setNext(new ListNode(3));
		start.next.next.setNext(new ListNode(3));
		start.next.next.next.setNext(new ListNode(4));
		start.next.next.next.next.setNext(new ListNode(5));
		return start;
	}
	
	public static ListNode getList2() {
		ListNode start = new ListNode(10);
		start.setNext(new ListNode(2));
		start.next.setNext(new ListNode(8));
		start.next.next.setNext(new ListNode(5));
		start.next.next.next.setNext(new ListNode(4));
		start.next.next.next.next.setNext(new ListNode(5));
		start.next.next.next.next.next.setNext(new ListNode(2));
		start.next.next.next.next.next.next.setNext(new ListNode(5));
		start.next.next.next.next.next.next.next.setNext(new ListNode(8));
		return start;
	}
}
