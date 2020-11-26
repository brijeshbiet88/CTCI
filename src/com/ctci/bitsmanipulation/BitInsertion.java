package com.ctci.bitsmanipulation;

public class BitInsertion {

	public static void main(String[] args) {
		int n = 256;
		int m = 5;
		//100000000 + 101 => 100010100
		int i = 2 , j = 4;
		int res = insersBits(n, m, i, j);
		System.out.println("Result after inserting bits of m in n : "+res);

	}
	
	
	public static int insersBits(int n , int m , int  i,int j) {
		int all1s = ~0;
		System.out.println("All 1s : "+all1s);
		int left = all1s << (j+1);
		System.out.println("Left : "+left);
		int right = ((1 << i) - 1);
		System.out.println("Right : "+right);
		int mask = left | right;
		System.out.println("Mask : "+mask);
		
		// Clear bits j through i then put M in there */
		int nCleared = n & mask;
		int mShifted = m << 1;
		System.out.println("Ncleared : "+nCleared+" MShifted : "+mShifted);
		return nCleared | mShifted;
	}

}
