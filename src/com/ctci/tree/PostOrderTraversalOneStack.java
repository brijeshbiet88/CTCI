package com.ctci.tree;

import java.util.Stack;

public class PostOrderTraversalOneStack {

	public static void main(String[] args) {

		TreeNode root = TreeUtils.get7NodeTree();
		System.out.println("Level Order Traversal Of Tree Using One Stack ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println();
		System.out.println("Post Order Traversal Of Tree Using One Stack ");
		traversePostOrder(root);
		
		System.out.println();
		System.out.println();
		TreeNode root2 = TreeUtils.get15NodeTree();
		System.out.println("Level Order Traversal Of Tree Using One Stack ");
		LevelOrderTraversal.traverseLevelorderNewLine(root2);
		System.out.println();
		System.out.println("Post Order Traversal Of Tree Using One Stack ");
		traversePostOrder(root2);
	}

	private static void traversePostOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				TreeNode temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data+" ");
					while (!stack.isEmpty() && stack.peek().right == temp) {
						temp = stack.pop();
						System.out.print(temp.data+" ");
					}
				} else {
					curr = temp;
				}
			}

		}

	}

}

/*
 * Level Order Traversal Of Tree Using One Stack 
1 
2 3 
4 5 6 7 

Post Order Traversal Of Tree Using One Stack 
4 5 2 6 7 3 1 

Level Order Traversal Of Tree Using One Stack 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Post Order Traversal Of Tree Using One Stack 
8 9 4 10 11 5 2 12 13 6 14 15 7 3 1 
 * */
