package com.ctci.tree;

public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get7NodeTree();
		System.out.println("PreOrder Traversal Of Tree:");
		TreeUtils.preOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal Of Tree:");
		TreeUtils.inOrder(root);
		System.out.println();
		System.out.println("PostOrder Traversal Of Tree:");
		TreeUtils.postOrder(root);
	}

}
/*
 *PreOrder Traversal Of Tree:
1 2 4 5 3 6 7 
InOrder Traversal Of Tree:
4 2 5 1 6 3 7 
PostOrder Traversal Of Tree:
4 5 2 6 7 3 1  
 */