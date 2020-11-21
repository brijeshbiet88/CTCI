package com.ctci.arraysandstrings;

import com.ctci.miscellaneous.MatrixUtil;

public class RotateMatrix90Degree {
	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
		int n = matrix.length;
		
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original Matrix :");
		MatrixUtil.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		System.out.println("Rotated Matrix :");
		MatrixUtil.printMatrix(matrix);
	}
	
	
}

/*
 * Original Matrix :
1  2  3  
4  5  6  
7  8  9  

Rotated Matrix :
7  4  1  
8  5  2  
9  6  3  
 * */
