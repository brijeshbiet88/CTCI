package com.ctci.bitsmanipulation;

public class NumberOfSetBits {

	public static void main(String[] args) {
		System.out.println("----------------------Test Case 1----------------------");
		int num = 242;
		System.out.println("Number of Set Bits in Number : "+num+" is "+findNumberOfSetBits(num));
		System.out.println();
		
		System.out.println("----------------------Test Case 2----------------------");
		num = 4094;
		System.out.println("Number of Set Bits in Number : "+num+" is "+findNumberOfSetBits(num));
		System.out.println();
		
		System.out.println("----------------------Test Case 3----------------------");
		num = 256;
		System.out.println("Number of Set Bits in Number : "+num+" is "+findNumberOfSetBits(num));
		System.out.println();
		
		System.out.println("----------------------Test Case 4----------------------");
		num = 19;
		System.out.println("Number of Set Bits in Number : "+num+" is "+findNumberOfSetBits(num));
		System.out.println();
		
		System.out.println("----------------------Test Case 5----------------------");
		num = 0;
		System.out.println("Number of Set Bits in Number : "+num+" is "+findNumberOfSetBits(num));
		System.out.println();

	}

	private static int findNumberOfSetBits(int num) {
		int noOfSetBits = 0;
		while(num > 0) {
			if((num & 1) == 1) {
				noOfSetBits++;
			}
			num >>>= 1;
		}
		
		return noOfSetBits;
	}

}

/*
 * ----------------------Test Case 1----------------------
Number of Set Bits in Number : 242 is 5

----------------------Test Case 2----------------------
Number of Set Bits in Number : 4094 is 11

----------------------Test Case 3----------------------
Number of Set Bits in Number : 256 is 1

----------------------Test Case 4----------------------
Number of Set Bits in Number : 19 is 3

----------------------Test Case 5----------------------
Number of Set Bits in Number : 0 is 0
*/
