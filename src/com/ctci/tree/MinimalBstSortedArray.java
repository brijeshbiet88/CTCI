package com.ctci.tree;

public class MinimalBstSortedArray {

	public static void main(String[] args) {
		int [] a = {1 , 2 ,3 ,4 , 5 , 6 , 7 , 8, 9};
		TreeNode root = createMinimalBst(a);
		System.out.println("Print Tree  :");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		
		System.out.println("Print In Order Traversal : ");
		TreeUtils.inOrder(root);
	}

	private static TreeNode createMinimalBst(int[] a) {
		return createMinimalBST(a , 0 , a.length -1);
	}

	private static TreeNode createMinimalBST(int[] a, int start, int end) {
		if(end < start)
		return null;
		
		int mid = start + (end - start)/2;
		TreeNode node = new TreeNode(a[mid]);
		node.left = createMinimalBST(a, start, mid -1);
		node.right = createMinimalBST(a, mid + 1, end); 
		
		return node;
	}

}

/*
 *  Print Tree  :
5 
2 7 
1 3 6 8 
4 9 
Print In Order Traversal : 
1 2 3 4 5 6 7 8 9 
 * */
