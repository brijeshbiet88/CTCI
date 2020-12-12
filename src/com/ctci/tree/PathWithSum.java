 package com.ctci.tree;

import java.util.HashMap;

public class PathWithSum {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		System.out.println("Level Order Traversal Of Tree : ");
		LevelOrderTraversal.traverseLevelorderNewLine(root);
		
		int targetSum = 8;
		int noOfPaths = countPathsWithSum(root , targetSum);
		System.out.println("Total Number Of Paths With Given Sum : "+noOfPaths);
	}

	private static int countPathsWithSum(TreeNode root, int targetSum) {
		return countPathsWithSum(root, targetSum , 0 , new HashMap<Integer, Integer> ());
	}

	private static int countPathsWithSum(TreeNode node, int targetSum, int runningSum, HashMap<Integer, Integer> pathCount) {
		
		if(node == null) return 0;
		runningSum += node.data ;
		int sum = runningSum - targetSum;
		int totalPaths = pathCount.getOrDefault(sum, 0);
		if(runningSum == targetSum) {
			totalPaths++;
		}
		
		incrementHashTable(pathCount , runningSum , 1);
		totalPaths += countPathsWithSum(node.left, targetSum , runningSum , pathCount);
		totalPaths += countPathsWithSum(node.right, targetSum , runningSum , pathCount);
		incrementHashTable(pathCount, runningSum, -1);
		return totalPaths;
	}

	private static void incrementHashTable(HashMap<Integer, Integer> hashTable, int key, int delta) {
		int newCount = hashTable.getOrDefault(key, 0) + delta;
		if(newCount == 0) {
			hashTable.remove(key);
		}else {
			hashTable.put(key, newCount);
		}
	}

}
/*
 * Level Order Traversal Of Tree : 
11 
5 -3 
3 2 11 
3 -2 1 
Total Number Of Paths With Given Sum : 4 
 */