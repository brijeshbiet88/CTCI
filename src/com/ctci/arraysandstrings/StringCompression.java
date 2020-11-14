package com.ctci.arraysandstrings;

public class StringCompression {

	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			/* If next character is different than current, append this char to result.*/
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------Test Case 1----------------------");
		String str = "aa";
		System.out.println(str);
		System.out.println(compress(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 2----------------------");
		str = "aaa";
		System.out.println(str);
		System.out.println(compress(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 3----------------------");
		str = "same";
		System.out.println(str);
		System.out.println(compress(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 4----------------------");
		str = "aabbcccDDdd";
		System.out.println(str);
		System.out.println(compress(str));
		System.out.println();
		
		System.out.println("--------------------Test Case 5----------------------");
		str = "vvvDDDttg";
		System.out.println(str);
		System.out.println(compress(str));
		System.out.println();
		
	}
}

/*
 * --------------------Test Case 1----------------------
aa
aa

--------------------Test Case 2----------------------
aaa
a3

--------------------Test Case 3----------------------
same
same

--------------------Test Case 4----------------------
aabbcccDDdd
a2b2c3D2d2

--------------------Test Case 5----------------------
vvvDDDttg
v3D3t2g1


 * */
