package com.ctci.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get7NodeTree();
		System.out.println("Level Order Traversal Of Tree:");
		traverseLevelorder(root);
		System.out.println();
		System.out.println("Level Order Traversal Of Tree Each Level :");
		traverseLevelorderNewLine(root);
	}

	private static void traverseLevelorderNewLine(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int n = 0;
		while(!q.isEmpty()) {
			n = q.size();
			
			while(n > 0) {
			
			TreeNode tmp = q.poll();
			System.out.print(tmp.data+" ");
			
			if(tmp.left != null) {
				q.add(tmp.left);
			}
			
			if(tmp.right != null) {
				q.add(tmp.right);
			}
			n--;
			}
			System.out.println();
		}
		
	}

	private static void traverseLevelorder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			TreeNode tmp = q.poll();
			System.out.print(tmp.data + " ");

			if (tmp.left != null) {
				q.add(tmp.left);
			}

			if (tmp.right != null) {
				q.add(tmp.right);
			}

		}

	}

}

/*
Level Order Traversal Of Tree:
1 2 3 4 5 6 7 
Level Order Traversal Of Tree Each Level :
1 
2 3 
4 5 6 7 

*/
