package com.ctci.tree;

public class SubTree {

	public static void main(String[] args) {
		TreeNode root1 = TreeUtils.get15NodeTree();
		TreeNode root2 = TreeUtils.get7NodeTree();
		
		System.out.println("Leval Order Traversal Of Tree T1 : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root1);
		System.out.println();
		System.out.println("Leval Order Traversal Of Tree T2 : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root2);
		System.out.println("Is T2 subtree of T1 ? : "+checkSubtree(root1 , root2));
		
		
		TreeNode root3 = root1.left;
		System.out.println("Leval Order Traversal Of Tree T3 : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root3);
		System.out.println("Is T3 subtree of T1 ? : "+checkSubtree(root1 , root3));
		
		TreeNode root4 = root1.left;
		root4.right.setLeft(new TreeNode(2));
		System.out.println("Leval Order Traversal Of Tree T4 : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root4);
		System.out.println("Is T4 subtree of T1 ? : "+checkSubtree(root1 , root4));
	}

	private static boolean checkSubtree(TreeNode root1, TreeNode root2) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		getOrderString(root1 , sb1);
		getOrderString(root2 , sb2);
		
		System.out.println("ordered String 1 : "+sb1.toString());
		System.out.println("ordered String 2 : "+sb2.toString());
		System.out.println();
		return sb1.toString().indexOf(sb2.toString()) != -1 ? true : false;
	}

	private static void getOrderString(TreeNode root , StringBuilder sb) {
		if(root == null) {
			sb.append("X ");
			return;
		}
		
		sb.append(root.data+" ");
		getOrderString(root.left, sb);
		getOrderString(root.right, sb);
	}

}

/*
 * Leval Order Traversal Of Tree T1 : 
1 
2 3 
4 5 6 7 
8 9 10 11 12 13 14 15 

Leval Order Traversal Of Tree T2 : 
1 
2 3 
4 5 6 7 
ordered String 1 : 1 2 4 8 X X 9 X X 5 10 X X 11 X X 3 6 12 X X 13 X X 7 14 X X 15 X X 
ordered String 2 : 1 2 4 X X 5 X X 3 6 X X 7 X X 

Is T2 subtree of T1 ? : false
Leval Order Traversal Of Tree T3 : 
2 
4 5 
8 9 10 11 
ordered String 1 : 1 2 4 8 X X 9 X X 5 10 X X 11 X X 3 6 12 X X 13 X X 7 14 X X 15 X X 
ordered String 2 : 2 4 8 X X 9 X X 5 10 X X 11 X X 

Is T3 subtree of T1 ? : true
Leval Order Traversal Of Tree T4 : 
2 
4 5 
8 9 2 11 
ordered String 1 : 1 2 4 8 X X 9 X X 5 2 X X 11 X X 3 6 12 X X 13 X X 7 14 X X 15 X X 
ordered String 2 : 2 4 8 X X 9 X X 5 2 X X 11 X X 

Is T4 subtree of T1 ? : true
 * */
