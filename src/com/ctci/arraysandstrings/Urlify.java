package com.ctci.arraysandstrings;

public class Urlify {

	public static void main(String[] args) {
		System.out.println("-----------------Test Case 1------------------------");
		String str = "Mr John Smith      ";
		char[] urlifiedString = urlify(str);
		System.out.print("Urlified String of String "+str+" is :");
		for(int i = 0 ; i < urlifiedString.length ; i++) {
			System.out.print(urlifiedString[i]);
		}
		System.out.println();
		
		System.out.println("-----------------Test Case 2------------------------");
		str = "Brijesh Kumar Gupta    ";
		char[] urlifiedString2 = urlify(str);
		System.out.print("Urlified String of String "+str+" is :");
		for(int i = 0 ; i < urlifiedString2.length ; i++) {
			System.out.print(urlifiedString2[i]);
		}
		System.out.println();
		
		System.out.println("-----------------Test Case 3------------------------");
		str = "RajatKumarGupta";
		char[] urlifiedString3 = urlify(str);
		System.out.print("Urlified String of String "+str+" is :");
		for(int i = 0 ; i < urlifiedString3.length ; i++) {
			System.out.print(urlifiedString3[i]);
		}
		System.out.println();
		
		System.out.println("-----------------Test Case 4------------------------");
		str = "Rajat   Kumar  Gupta          ";
		char[] urlifiedString4 = urlify(str);
		System.out.print("Urlified String of String "+str+" is :");
		for(int i = 0 ; i < urlifiedString4.length ; i++) {
			System.out.print(urlifiedString4[i]);
		}
		System.out.println();
		
		System.out.println("-----------------Test Case 5------------------------");
		str = "Odd Even  ";
		char[] urlifiedString5 = urlify(str);
		System.out.print("Urlified String of String "+str+" is :");
		for(int i = 0 ; i < urlifiedString5.length ; i++) {
			System.out.print(urlifiedString5[i]);
		}
		System.out.println();
	}
	
	
	/*Assuming that the String contains Enough Spaces in the end to accomodate urlified characters*/
	private static char[] urlify(String str) {
		char[] strArr = str.toCharArray();
		int trueLength = findTrueLength(strArr);
		int spaceCount = findSpaceCount(strArr, trueLength);
		int lastIndex = trueLength + spaceCount * 2;
		for (int i = trueLength; i >= 0 && lastIndex >= 0; i--) {
			if(str.charAt(i) != ' ') {
				strArr[lastIndex--] = str.charAt(i);
			}else {
				strArr[lastIndex--] = '0';
				strArr[lastIndex--] = '2';
				strArr[lastIndex--] = '%';
			}
		}
		return strArr;
	}

	private static int findSpaceCount(char[] strArr, int trueLength) {
		int spaceCount = 0;
		for (int i = 0; i <= trueLength; i++) {
			if (strArr[i] == ' ') {
				spaceCount++;
			}
		}
		return spaceCount;
	}

	private static int findTrueLength(char[] strArr) {
		for(int i = strArr.length -1 ; i >=0 ; i--) {
			if(strArr[i] != ' ') {
				return i;
			}
		}
		
		return -1;
	}
}
/*
-----------------Test Case 1------------------------
Urlified String of String Mr John Smith       is :Mr%20John%20Smith  
-----------------Test Case 2------------------------
Urlified String of String Brijesh Kumar Gupta     is :Brijesh%20Kumar%20Gupta
-----------------Test Case 3------------------------
Urlified String of String RajatKumarGupta is :RajatKumarGupta
-----------------Test Case 4------------------------
Urlified String of String Rajat   Kumar  Gupta           is :Rajat%20%20%20Kumar%20%20Gupta
-----------------Test Case 5------------------------
Urlified String of String Odd Even   is :Odd%20Even

 * 
 * */
