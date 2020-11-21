package com.ctci.arraysandstrings;

import com.ctci.miscellaneous.MatrixUtil;

public class ZeroMatrix {
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}		
	}

	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}			
	
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];	
		boolean[] column = new boolean[matrix[0].length];

		// Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = true; 
					column[j] = true;
		 		}
			}
		}
		
		// Nullify rows
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				nullifyRow(matrix, i);
			}
		}
		
		// Nullify columns
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				nullifyColumn(matrix, j);
			}
		}
	}	
	
	
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 0 }, { 2, 0, 3, 6 }, { 1, 1, 1, 1 }, { 7, 8, 9, 4 } };	

		System.out.println("Original Matrix :");
		MatrixUtil.printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		System.out.println("Zero Matrix : ");
		MatrixUtil.printMatrix(matrix);
	}
}

/*
 * Original Matrix :
1  2  3  0  
2  0  3  6  
1  1  1  1  
7  8  9  4  

Zero Matrix : 
0  0  0  0  
0  0  0  0  
1  0  1  0  
7  0  9  0  

 * */
