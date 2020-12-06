package com.ctci.tree;

public class IdenticalTrees {

	public static void main(String[] args) {
		TreeNode root1 = TreeUtils.get15NodeTree();
		TreeNode root2 = TreeUtils.get15NodeTree();
		TreeNode root3 = TreeUtils.get7NodeTree();
		System.out.println("Are T1 nd T2 Identicals : "+areIdenticals(root1 , root2));
		System.out.println("Are T1 nd T3 Identicals : "+areIdenticals(root1 , root3));
	}

	public static boolean areIdenticals(TreeNode root1, TreeNode root2) {
		
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 == null || root2 == null) {
			return false;
		}
		
		if(root1.data != root2.data) {
			return false;
		}
		
		
		return areIdenticals(root1.left, root2.left) && areIdenticals(root1.right, root2.right);
	}

}
