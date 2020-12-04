package com.ctci.tree;

public class PrintRootToLeafPaths {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println("Print Level Order Of Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println();
		System.out.println("All Root To Leaf Path : ");
		printPaths(root);
		
	}
	
	  public static void printPaths(TreeNode root)  
	    { 
	        int path[] = new int[1000]; 
	        printPathsRecur(root, path, 0); 
	    } 
	
	    public static void printPathsRecur(TreeNode node, int path[], int pathLen)  
	    { 
	        if (node == null) 
	            return; 
	   
	        path[pathLen] = node.data; 
	        pathLen++; 
	   
	        if (node.left == null && node.right == null) 
	            printArray(path, pathLen); 
	        else 
	        { 
	            printPathsRecur(node.left, path, pathLen); 
	            printPathsRecur(node.right, path, pathLen); 
	        } 
	    } 
	   
	   public static void printArray(int ints[], int len)  
	    { 
	        int i; 
	        for (i = 0; i < len; i++)  
	        { 
	            System.out.print(ints[i] + " "); 
	        } 
	        System.out.println(""); 
	    } 

}

/*
 * Print Level Order Of Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

All Root To Leaf Path : 
1 2 4 8 
1 2 4 9 
1 2 5 10 
1 2 5 11 
1 3 6 12 
1 3 6 13 
1 3 7 14 
1 3 7 15 

 * */
