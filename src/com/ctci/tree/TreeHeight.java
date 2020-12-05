package com.ctci.tree;

public class TreeHeight {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println(" Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println("Height of Tree : "+TreeUtils.findHeight(root));
		System.out.println();
		
		TreeNode root2 = TreeUtils.get7NodeTree();
		System.out.println(" Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root2);
		System.out.println("Height of Tree : "+TreeUtils.findHeight(root2));
		System.out.println();
		
		TreeNode root3 = TreeUtils.get7NodeTree();
		root3.left.right.setLeft(new TreeNode(8));
		root3.left.right.left.setRight(new TreeNode(9));
		System.out.println(" Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root3);
		System.out.println("Height of Tree : "+TreeUtils.findHeight(root3));
		
	}
}
/*
 * Print Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 
Height of Tree : 3

 Print Tree : 
1 
2 3 
4 5 6 7 
Height of Tree : 2

 Print Tree : 
1 
2 3 
4 5 6 7 
8 
9 
Height of Tree : 4

 */
