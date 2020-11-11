package com.ctci.arraysandstrings;

public class IsUnique {

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		int testCase = 0;
		for (String word : words) {
			
			System.out.println("-----------------Test Case "+ ++testCase +"--------------------");
			System.out.println("Does Word "+word + " has all Unique Characters : " + isUniqueString(word));
			System.out.println();
		}

	}

	private static boolean isUniqueString(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			int setBit = 1 << val;
			if ((checker & setBit) > 0) 
				return false;
			checker |= setBit;
		}
		return true;
	}

}
/*
-----------------Test Case 1--------------------
Does Word abcde has all Unique Characters : true

-----------------Test Case 2--------------------
Does Word hello has all Unique Characters : false

-----------------Test Case 3--------------------
Does Word apple has all Unique Characters : false

-----------------Test Case 4--------------------
Does Word kite has all Unique Characters : true

-----------------Test Case 5--------------------
Does Word padle has all Unique Characters : true
 
 * */
