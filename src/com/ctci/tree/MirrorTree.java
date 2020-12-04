package com.ctci.tree;

public class MirrorTree {
	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree:");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		root = convertToMirror(root);
		System.out.println("Level Order Traversal Of Tree After Mirror :");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
	}

	private static TreeNode convertToMirror(TreeNode root) {
		if (root == null) return root;
		if(root.left == null && root.right == null) {
			return root;
		}
		TreeNode temp = convertToMirror(root.right);
		root.setRight(convertToMirror(root.left));
		root.setLeft(temp);
		return root;
	}
}
/*
 *Level Order Traversal Of Tree:
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 
Level Order Traversal Of Tree After Mirror :
1 
3 2 
7 6 5 4 
15 14 13 12 11 10 9 8 
 
 * */
