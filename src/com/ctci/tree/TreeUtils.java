package com.ctci.tree;

public class TreeUtils {
	
	public static TreeNode get7NodeTree() {
		TreeNode root = new TreeNode(1);
		
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		
		root.setLeft(node2);
		root.setRight(node3);
		
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node3.setLeft(node6);
		node3.setRight(node7);
		
		return root;
	}

	
	public static void preOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void postOrder(TreeNode root) {
		if(root == null) {
			return ;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}
