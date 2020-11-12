package com.ctci.arraysandstrings;

public class PalindromicPermutation {

	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1----------------------");
		String str = "Rats live on no evil star";
		System.out.println("Is String= "+str+" ?Palindrome :"+isPermutationOfPalindrome(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 2----------------------");
		str = "car race";
		System.out.println("Is String= "+str+" ?Palindrome :"+isPermutationOfPalindrome(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 3----------------------");
		str = "Zeus was innocent";
		System.out.println("Is String= "+str+" ?Palindrome :"+isPermutationOfPalindrome(str));
		System.out.println();
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return checkAtMostOneBitSet(bitVector);
	}
	
	/* Toggle the ith bit in the integer. */
	public static int toggle(int bitVector, int index) {
		if (index < 0) return bitVector;
		
		int mask = 1 << index;
		if ((bitVector & mask) == 0) {
			bitVector |= mask;
		} else {
			bitVector &= ~mask;
		}
		return bitVector;
	}
	
	/* Create bit vector for string. For each letter with value i,
	 * toggle the ith bit. */
	public static int createBitVector(String phrase) {
		int bitVector = 0;
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}
	
	/* Check that at most one bit is set by subtracting one from the 
	 * integer and ANDing it with the original integer. */
	public static boolean checkAtMostOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}
	
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
}

/*
--------------------Test Case 1----------------------
Is String= Rats live on no evil star ?Palindrome :true

--------------------Test Case 2----------------------
Is String= car race ?Palindrome :true

--------------------Test Case 3----------------------
Is String= Zeus was innocent ?Palindrome :false

 * */
