package com.ctci.bitsmanipulation;

public class DecimaltoBinaryString {

	public static void main(String[] args) {
		System.out.println("-------------------Test Case 1--------------------------");
		double num = 0.125;
		System.out.println("Binary of Double "+num+" is : "+doubleToBinary(num));
		System.out.println();
		
		System.out.println("-------------------Test Case 2--------------------------");
		num = 0.0625;
		System.out.println("Binary of Double "+num+" is : "+doubleToBinary(num));
		System.out.println();
		
		System.out.println("-------------------Test Case 3--------------------------");
		num = 0.06296;
		System.out.println("Binary of Double "+num+" is : "+doubleToBinary(num));
		System.out.println();
		
		System.out.println("-------------------Test Case 4--------------------------");
		num = 0.03125;
		System.out.println("Binary of Double "+num+" is : "+doubleToBinary(num));
		System.out.println();
		
		System.out.println("-------------------Test Case 5--------------------------");
		num = 2.220;
		System.out.println("Binary of Double "+num+" is : "+doubleToBinary(num));
		System.out.println();

	}
	
	public static String doubleToBinary (double  num ) {
		StringBuilder binary = new StringBuilder();
		
		if(num > 1 || num < 0) {
			return "ERROR";
		}
		
		while(num > 0) {
			
			if(binary.length() >= 32) {
				return "ERROR";
			}
			num = num * 2;
			if(num >= 1) {
				num = num -1.0 ;
				binary.append(1);
			}else {
				binary.append(0);
			}
		}
		return binary.toString();
	}
}

/*
 * -------------------Test Case 1--------------------------
Binary of Double 0.125 is : 001

-------------------Test Case 2--------------------------
Binary of Double 0.0625 is : 0001

-------------------Test Case 3--------------------------
Binary of Double 0.06296 is : ERROR

-------------------Test Case 4--------------------------
Binary of Double 0.03125 is : 00001

-------------------Test Case 5--------------------------
Binary of Double 2.22 is : ERROR

 * */
