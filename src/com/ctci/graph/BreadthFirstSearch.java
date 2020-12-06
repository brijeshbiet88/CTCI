package com.ctci.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public static void main(String[] args) {
		GraphNode start = GraphUtils.getGraph();
		System.out.println("Print Graph :");
		GraphUtils.printGraph(start);
		GraphUtils.clearVisitedGraph(start);
		System.out.println();
		System.out.println("Print Graph Using Breadth First Search:");
		depthFirstSearch(start);
	}

	private static void depthFirstSearch(GraphNode start) {

		Queue< GraphNode> q = new LinkedList<GraphNode>();
		q.add(start);
		while(!q.isEmpty()) {
			
			GraphNode tmp = q.poll();
			tmp.visited = true;
			ArrayList<GraphNode> children = tmp.getChildren();
			System.out.print(tmp.data+" ");
			for(int i = 0 ; i < children.size() ; i++) {
				if(!children.get(i).visited ) {
					q.add(children.get(i));
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


Print Graph Using Breadth First Search:
1 2 3 4 6 5 
*/
