package com.ctci.arraysandstrings;

public class OneAway {
	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1----------------------");
		String str1 = "cat";
		String str2 = "rat";
		System.out.println("Are Strings "+str1+" And :"+str2+" One Edit Away ? "+oneEditAway(str1 , str2));
		System.out.println();
		
		System.out.println("--------------------Test Case 2----------------------");
		str1 = "care";
		str2 = "race";
		System.out.println("Are Strings "+str1+" And :"+str2+" One Edit Away ? "+oneEditAway(str1 , str2));
		System.out.println();
		
		System.out.println("--------------------Test Case 3----------------------");
		str1 = "cart";
		str2 = "art";
		System.out.println("Are Strings "+str1+" And :"+str2+" One Edit Away ? "+oneEditAway(str1 , str2));
		System.out.println();
		
		System.out.println("--------------------Test Case 4----------------------");
		str1 = "red";
		str2 = "read";
		System.out.println("Are Strings "+str1+" And :"+str2+" One Edit Away ? "+oneEditAway(str1 , str2));
		System.out.println();
		
		System.out.println("--------------------Test Case 5----------------------");
		str1 = "same";
		str2 = "same";
		System.out.println("Are Strings "+str1+" And :"+str2+" One Edit Away ? "+oneEditAway(str1 , str2));
		System.out.println();
		
		
	}

	public static boolean oneEditAway(String first, String second) {
		/* Length checks. */
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}
		
		/* Get shorter and longer string.*/
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				/* Ensure that this is the first difference found.*/
				if (foundDifference) return false;
				foundDifference = true;
				if (s1.length() == s2.length()) { // On replace, move shorter pointer
					index1++;
				}
			} else {
				index1++; // If matching, move shorter pointer 
			}
			index2++; // Always move pointer for longer string 
		}
		return true;
	}
}

/*
 * --------------------Test Case 1----------------------
Are Strings cat And :rat One Edit Away ? true

--------------------Test Case 2----------------------
Are Strings care And :race One Edit Away ? false

--------------------Test Case 3----------------------
Are Strings cart And :art One Edit Away ? true

--------------------Test Case 4----------------------
Are Strings red And :read One Edit Away ? true

--------------------Test Case 5----------------------
Are Strings same And :same One Edit Away ? true

 * */
