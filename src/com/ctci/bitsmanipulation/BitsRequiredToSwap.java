package com.ctci.bitsmanipulation;

public class BitsRequiredToSwap {

	public static int bitSwapRequired(int a, int b) {
		int count = 0;
		int c = a ^ b;
		while (c != 0) {
			count += c & 1; // Increment count if c ends with a 1
			c >>>= 1; // Shift right by 1
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("-----------Test Case 1----------------------");
		int a = -23432;
		int b = 512132;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		System.out.println();
		
		System.out.println("-----------Test Case 2----------------------");
		a = 21;
		b = 19;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		System.out.println();
		
		System.out.println("-----------Test Case 3----------------------");
		a = 64;
		b = 3;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		System.out.println();
		
		System.out.println("-----------Test Case 4----------------------");
		a = 31;
		b = 7;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		System.out.println();
		
		System.out.println("-----------Test Case 5----------------------");
		a = 127;
		b = 63;
		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println("Required number of bits: " + bitSwapRequired(a, b));
		System.out.println();
	}
}

/*
 * -----------Test Case 1----------------------
-23432: 11111111111111111010010001111000
512132: 1111101000010000100
Required number of bits: 23

-----------Test Case 2----------------------
21: 10101
19: 10011
Required number of bits: 2

-----------Test Case 3----------------------
64: 1000000
3: 11
Required number of bits: 3

-----------Test Case 4----------------------
31: 11111
7: 111
Required number of bits: 2

-----------Test Case 5----------------------
127: 1111111
63: 111111
Required number of bits: 1

 * */
