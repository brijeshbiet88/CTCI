package com.ctci.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewTree {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtils.get15NodeTree();
		System.out.println("Print Level Order Of Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println();
		System.out.println("Left View Of Tree : ");
		rightView(root);
	}

	private static void rightView(TreeNode root) {

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
			
			if(tmp.right != null) {
				q.add(tmp.right);
			}
			
			if(tmp.left != null) {
				q.add(tmp.left);
			}
			n--;
			}
			System.out.println();
		}
		
	}
}
/*
 *Print Level Order Of Tree : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Left View Of Tree : 
1 
3 
7 
15  
 */
