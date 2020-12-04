package com.ctci.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println("Print Level Order Of Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println();
		System.out.println("Left View Of Tree : ");
		leftView(root);
	}

	private static void leftView(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int n = 0;
		while(!q.isEmpty()) {
			n = q.size();
			int count = 0;
			while(n > 0) {
			count++;
			TreeNode tmp = q.poll();
			if(count == 1)
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
}
