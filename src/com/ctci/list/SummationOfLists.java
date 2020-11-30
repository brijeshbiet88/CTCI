package com.ctci.list;

import com.ctci.miscellaneous.ListNode;
import com.ctci.miscellaneous.ListUtil;

public class SummationOfLists {

	public static void main(String[] args) {
		ListNode num1 = new ListNode(9);
		num1.setNext(new ListNode(5));
		num1.next.setNext(new ListNode(8));
		num1.next.next.setNext(new ListNode(7));

		ListNode num2 = new ListNode(7);
		num2.setNext(new ListNode(2));
		num2.next.setNext(new ListNode(3));
		
		System.out.println("List 1 : ");
		ListUtil.print(num1);
		
		System.out.println("List 2 : ");
		ListUtil.print(num2);
		
		System.out.println("List 1 After Reversing: ");
		num1 = ListUtil.reverse(num1);
		ListUtil.print(num1);
		
		System.out.println("List 2 After Reversing: ");
		num2 = ListUtil.reverse(num2);
		ListUtil.print(num2);
		
		System.out.println("Summation Of Lists : ");
		ListNode summation = add(num1 , num2);
		summation = ListUtil.reverse(summation);
		ListUtil.print(summation);
		
	}

	private static ListNode add(ListNode num1, ListNode num2) {
		int carry = 0;
		int sum = 0;
		ListNode result = null;
		ListNode tmp = null;
		if(num1 == null) {
			return num2;
		}
		
		if(num2 == null) {
			return num1;
		}
		while(num1 != null && num2 != null) {
			sum = num1.data + num2.data + carry ;
			carry = sum / 10;
			sum = sum % 10;
			num1 = num1.next;
			num2 = num2.next;
			
			if(result == null) {
				result = new ListNode(sum);
				tmp = result;
			}else {
				tmp.setNext(new ListNode(sum));
				tmp = tmp.next;
			}
			
		}
		
		while(num1 != null) {
			sum = carry + num1.data;
			carry = sum / 10;
			sum = sum % 10;
			num1 = num1.next;
			tmp.setNext(new ListNode(sum));;
			tmp = tmp.next;
		}
		
		while(num2 != null) {
			sum = carry + num2.data;
			carry = sum / 10;
			sum = sum % 10;
			num2 = num2.next;
			tmp.setNext(new ListNode(sum));;
			tmp = tmp.next;
		}
		
		if (carry == 1) {
			ListNode carryNode = new ListNode(carry);
			tmp.setNext(carryNode);
		}
		
		return result;
	}
}
/*List 1 : 
9->5->8->7->Null
List 2 : 
7->2->3->Null
List 1 After Reversing: 
7->8->5->9->Null
List 2 After Reversing: 
3->2->7->Null
Summation Of Lists : 
1->0->3->1->0->Null
*/