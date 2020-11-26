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
		
		System.out.println();
	
		int[][] matrix2 = { { 1, 2, 0,8 }, { 2, 0, 3, 6 }, { 1, 1, 1, 1 }, { 7, 8, 9, 4 } };
		System.out.println("Original Matrix :");
		MatrixUtil.printMatrix(matrix2);
		
		setZeros2(matrix2);
		
		System.out.println();
		System.out.println("Zero Matrix : ");
		MatrixUtil.printMatrix(matrix2);
	}
	
		
	
	public static void setZeros2(int[][] matrix) {
		 boolean rowZero = false;
	        boolean colZero = false;
	    
	        for(int j = 0 ; j < matrix[0].length ; j++) {
	            if(matrix[0][j] == 0){
	                rowZero = true;
	                break;
	            }
	           }
	        
	         for(int i = 0 ; i < matrix.length ; i++) {
	            if(matrix[i][0] == 0){
	                colZero = true;
	                break;
	            }
	           }
	        
	        for(int i = 1 ; i < matrix.length ; i++) {
	            for(int j = 1 ; j < matrix[0].length ; j++) {
	              if(matrix[i][j] == 0){
	                  matrix[i][0] = 0;
	                  matrix[0][j] = 0;
	              }
	            }
	        }
	        
	        for(int i = matrix.length -1 ; i >0 ; i--) {
	            for(int j = matrix[0].length -1 ;j > 0 ;j--) {
	              if(matrix[i][0] == 0 || matrix[0][j] == 0 ){
	                  matrix[i][j] = 0;
	              }
	            }
	        }
	        
	        if(rowZero){
	            for(int j = 0 ; j < matrix[0].length ; j++ ){
	                matrix[0][j] = 0;
	            }
	        }
	        
	        if(colZero){
	            for(int i = 0 ; i < matrix.length ; i++ ){
	                matrix[i][0] = 0;
	            }
	        }
	}	
	
}

/*
Original Matrix :
1  2  3  0  
2  0  3  6  
1  1  1  1  
7  8  9  4  

Zero Matrix : 
0  0  0  0  
0  0  0  0  
1  0  1  0  
7  0  9  0  

Original Matrix :
1  2  0  8  
2  0  3  6  
1  1  1  1  
7  8  9  4  

Zero Matrix : 
0  0  0  0  
0  0  0  0  
1  0  0  1  
7  0  0  4  

 * */
