package com.ctci.tree;

public class CheckBalanced {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println("Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println("If The Tree is Balanced ? "+checkBalanced(root));
		
		TreeNode root2 = TreeUtils.get7NodeTree();
		System.out.println("Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root2);
		System.out.println("If The Tree is Balanced ? "+checkBalanced(root2));
		
		TreeNode root3 = TreeUtils.get7NodeTree();
		root3.left.right.setLeft(new TreeNode(8));
		root3.left.right.left.setRight(new TreeNode(9));
		System.out.println("Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root3);
		System.out.println("If The Tree is Balanced ? "+checkBalanced(root3));
		
		TreeNode root4 = TreeUtils.get7NodeTree();
		root4.left.right.setRight(new TreeNode(8));
		root4.right.left.setRight(new TreeNode(9));
		System.out.println("Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root4);
		System.out.println("If The Tree is Balanced ? "+checkBalanced(root4));
		
		TreeNode root5 = TreeUtils.get7NodeTree();
		root5.left.right.setRight(new TreeNode(8));
		System.out.println("Print Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root5);
		System.out.println("If The Tree is Balanced ? "+checkBalanced(root5));
	}

	public static boolean checkBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		
		int lHeight = TreeUtils.findHeight(root.left);
		int rHeight = TreeUtils.findHeight(root.right);
		
		if(Math.abs(lHeight - rHeight) > 1) {
			return false;
		}
		return true;
	}
}
/*
 *Print Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 
If The Tree is Balanced ? true
Print Tree : 
1 
2 3 
4 5 6 7 
If The Tree is Balanced ? true
Print Tree : 
1 
2 3 
4 5 6 7 
8 
9 
If The Tree is Balanced ? false
Print Tree : 
1 
2 3 
4 5 6 7 
8 9 
If The Tree is Balanced ? true
Print Tree : 
1 
2 3 
4 5 6 7 
8 
If The Tree is Balanced ? true
 
 */
