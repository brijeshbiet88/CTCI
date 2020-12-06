package com.ctci.graph;

public class PrintGraph {

	public static void main(String[] args) {
		GraphNode start = GraphUtils.getGraph();
		System.out.println("Print Graph :");
		GraphUtils.printGraph(start);

	}

}
/*
 *Print Graph :
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

 
 * */
 