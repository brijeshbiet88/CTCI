package com.ctci.miscellaneous;

public class MatrixUtil {
	
	public static void printMatrix(int [][] mat) {
		
		for(int i = 0 ; i < mat.length;i++) {
			for(int j = 0 ; j < mat[0].length ; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
