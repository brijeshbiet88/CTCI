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
	
	public static TreeNode get15NodeTree() {
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
		
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		
		node4.setLeft(node8);
		node4.setRight(node9);
		
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		
		node5.setLeft(node10);
		node5.setRight(node11);
		
		TreeNode node12 = new TreeNode(12);
		TreeNode node13 = new TreeNode(13);
		
		node6.setLeft(node12);
		node6.setRight(node13);
		
		TreeNode node14 = new TreeNode(14);
		TreeNode node15 = new TreeNode(15);
		
		node7.setLeft(node14);
		node7.setRight(node15);
		
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
