package com.ctci.tree;

import java.util.Stack;

public class TraversalNonRec {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get7NodeTree();
		System.out.println("InOrder Traversal Of Tree:");
		traverseInorder(root);
		System.out.println();
		System.out.println("PreOrder Traversal Of Tree:");
		traversePreorder(root);
		System.out.println();

	}

	private static void traverseInorder(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode tmp = root;
		while (true) {

			while (tmp != null) {
				stack.add(tmp);
				tmp = tmp.left;
			}

			if (stack.isEmpty()) {
				break;
			}

			if (tmp == null) {
				tmp = stack.pop();
				System.out.print(tmp.data + " ");
				tmp = tmp.right;
			}
		}
	}
	
	private static void traversePreorder(TreeNode root) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode tmp = root;
		while (true) {

			while (tmp != null) {
				System.out.print(tmp.data+" ");
				stack.add(tmp);
				tmp = tmp.left;
			}

			if (stack.isEmpty()) {
				break;
			}

			if (tmp == null) {
				tmp = stack.pop();
				tmp = tmp.right;
			}
		}
	}

}

/*
InOrder Traversal Of Tree:
4 2 5 1 6 3 7 
PreOrder Traversal Of Tree:
1 2 4 5 3 6 7 
*/
