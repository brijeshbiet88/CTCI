package com.ctci.tree;

public class SubTree2 {

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
		System.out.println("Leval Order Traversal Of Tree T1 : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root1);
		System.out.println("Is T4 subtree of T1 ? : "+checkSubtree(root1 , root4));

	}

	private static Boolean checkSubtree(TreeNode root1, TreeNode root2) {
		if(root2 == null) {
			return true;
		}
		return subTree(root1 , root2);
	}

	private static Boolean subTree(TreeNode root1, TreeNode root2) {
		if(root1 == null) {
			return false;
		}else if(root1.data == root2.data && IdenticalTrees.areIdenticals(root1, root2)) {
			return true;
		}
		return subTree(root1.left, root2) || subTree(root1.right, root2);
	}

}
