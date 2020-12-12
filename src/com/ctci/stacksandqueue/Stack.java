package com.ctci.stacksandqueue;

public class Stack {

	int [] s ;
	int size ;
	int top ;
	
	public Stack () {
		size = 3;
		s = new int[size];
		top = -1;
	}
	
	public void push(int num) {
		if(top == size -1) {
			System.out.println("Stack Overflow");
			return;
		}
		System.out.println("Pushed "+num);
		s[++top] = num;
	}
	
	public int pop() throws Exception{
		if(top == -1) {
			System.out.println("Stack Underflow");
			throw new Exception("Stack Underflow");
		}
		System.out.println("Popped "+s[top]);
		return s[top--] ;
	}
	
	public static void main(String[] args) throws Exception{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}

/*
 * Pushed 1
Pushed 2
Pushed 3
Stack Overflow
Popped 3
Popped 2
Popped 1
Stack Underflow
Exception in thread "main" java.lang.Exception: Stack Underflow
	at com.ctci.stacksandqueue.Stack.pop(Stack.java:27)
	at com.ctci.stacksandqueue.Stack.main(Stack.java:42)

 * */
