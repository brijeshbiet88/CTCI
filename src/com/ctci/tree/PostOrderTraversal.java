package com.ctci.tree;

import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.get7NodeTree();
		System.out.println("Post Order Traversal Of Tree:");
		traversePostorder(root);

	}

	private static void traversePostorder(TreeNode root) {
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		
		if (root == null) 
            return; 
  
        s1.push(root); 
  
        while (!s1.isEmpty()) { 
            TreeNode temp = s1.pop(); 
            s2.push(temp); 
  
            if (temp.left != null) 
                s1.push(temp.left); 
            if (temp.right != null) 
                s1.push(temp.right); 
        } 
  
        while (!s2.isEmpty()) { 
            TreeNode temp = s2.pop(); 
            System.out.print(temp.data + " "); 
        } 
	}

}
/*
Post Order Traversal Of Tree:
4 5 2 6 7 3 1 
*/
