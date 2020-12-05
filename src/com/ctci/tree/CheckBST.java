package com.ctci.tree;

public class CheckBST {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.getBst();
		System.out.println("Print Tree :");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		System.out.println("Is the Tree Valid Bst ? : "+checkBst(root));
		System.out.println("Is the Tree Valid Bst method 2 ? : "+checkBst2(root));
		
		System.out.println();
		
		TreeNode root2 = new TreeNode(20);
		root2.setLeft(new TreeNode(10));
		root2.setRight(new TreeNode(30));
		root2.left.setRight(new TreeNode(25));
		System.out.println("Print Tree :");
		LevelOrderTraversal.traverseLevelorderNewLine(root2);
		System.out.println("Is the Tree Valid Bst ? : "+checkBst(root2));
		System.out.println("Is the Tree Valid Bst method 2 ? : "+checkBst2(root2));
		System.out.println();
		
	}
	
	static Integer lastNum = null; 

	private static Boolean checkBst(TreeNode root) {
		if (root == null) {
			return true;
		}

		if (!checkBst(root.left))
			return false;

		if (lastNum != null && root.data <= lastNum) {
			return false;
		}

		lastNum = root.data;

		if (!checkBst(root.right)) {
			return false;
		}
		return true;
	}
	
	private static Boolean checkBst2(TreeNode root) {
		Integer min = null , max = null ;
		return checkBst2(root , min , max);
	}

	private static Boolean checkBst2(TreeNode root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}
		
		if((min != null && root.data <= min) || (max != null && root.data >= max))
			return false;
		
		if((!checkBst2(root.left, min, root.data)) || (!checkBst2(root.right, root.data, max)))
			return false;
		
		return true;
	}

}
/*
 Print Tree :
4 
2 6 
1 3 5 7 
Is the Tree Valid Bst ? : true
Is the Tree Valid Bst method 2 ? : true

Print Tree :
20 
10 30 
25 
Is the Tree Valid Bst ? : false
Is the Tree Valid Bst method 2 ? : false

 * */