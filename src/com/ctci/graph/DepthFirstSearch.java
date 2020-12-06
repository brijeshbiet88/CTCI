package com.ctci.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {

	public static void main(String[] args) {
		GraphNode start = GraphUtils.getGraph();
		System.out.println("Print Graph :");
		GraphUtils.printGraph(start);
		GraphUtils.clearVisitedGraph(start);
		System.out.println();
		System.out.println("Print Graph Using Depth First Search:");
		depthFirstSearch(start);
	}

	private static void depthFirstSearch(GraphNode start) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(start);
		while (!stack.isEmpty()) {

			GraphNode tmp = stack.pop();
			tmp.visited = true;
			System.out.print(tmp.data + " ");
			ArrayList<GraphNode> children = tmp.getChildren();
			for (int i = 0; i < children.size(); i++) {
				if (!children.get(i).visited) {
					stack.push(children.get(i));
					children.get(i).visited = true;
				}
			}

		}

	}	
}

/*
 * Print Graph :
Adjacency List of Vertex 1
Head--> 2--> 3

Adjacency List of Vertex 2
Head--> 1--> 3--> 4--> 6

Adjacency List of Vertex 3
Head--> 1--> 6

Adjacency List of Vertex 4
Head--> 3--> 5

Adjacency List of Vertex 6
Head--> 

Adjacency List of Vertex 5
Head--> 4--> 6


Print Graph Using Depth First Search:
1 3 6 2 4 5 
 * */
