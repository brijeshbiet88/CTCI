package com.ctci.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphUtils {
	
	public static GraphNode getGraph() {
		
		GraphNode vertex1 = new GraphNode(1);
		GraphNode vertex2 = new GraphNode(2);
		GraphNode vertex3 = new GraphNode(3);
		GraphNode vertex4 = new GraphNode(4);
		GraphNode vertex5 = new GraphNode(5);
		GraphNode vertex6 = new GraphNode(6);
		
		ArrayList<GraphNode> children1 = new ArrayList<GraphNode>();
		children1.add(vertex2);
		children1.add(vertex3);
		vertex1.setChildren(children1);
		
		ArrayList<GraphNode> children2 = new ArrayList<GraphNode>();
		children2.add(vertex1);
		children2.add(vertex3);
		children2.add(vertex4);
		
		vertex2.setChildren(children2);
		
		ArrayList<GraphNode> children3 = new ArrayList<GraphNode>();
		children3.add(vertex1);
		children3.add(vertex2);
		vertex3.setChildren(children3);
		
		ArrayList<GraphNode> children4 = new ArrayList<GraphNode>();
		children4.add(vertex3);
		children4.add(vertex5);
		vertex4.setChildren(children4);
		
		ArrayList<GraphNode> children5 = new ArrayList<GraphNode>();
		children5.add(vertex4);
		children5.add(vertex5);
		vertex5.setChildren(children5);
		
		ArrayList<GraphNode> children6 = new ArrayList<GraphNode>();
		children6.add(vertex5);
		children6.add(vertex4);
		vertex6.setChildren(children6);
		
		return vertex1;
	}
	
	public static void printGraph(GraphNode start) {
		Queue< GraphNode> q = new LinkedList<GraphNode>();
		HashSet<GraphNode> set = new HashSet<GraphNode>();
		q.add(start);
		int vertex = 0;
		while(!q.isEmpty()) {
			
			GraphNode tmp = q.poll();
			
			ArrayList<GraphNode> children = tmp.getChildren();
			System.out.println("Adjacency List of Vertex "+vertex);
			System.out.print("Head--> ");
			for(int i = 0 ; i < children.size() ; i++) {
				if(i < children.size() -1)
					System.out.print(children.get(i).data+"--> ");
				else {
					System.out.print(children.get(i).data);
				}
				if(!set.contains(children.get(i))) {
					q.add(children.get(i));
					set.add(children.get(i));
				}
			}
			System.out.println("\n");
			vertex++;
		}
	}
}

/*
 * Print Graph :
Adjacency List of Vertex 0
Head--> 2--> 3

Adjacency List of Vertex 1
Head--> 1--> 3--> 4

Adjacency List of Vertex 2
Head--> 1--> 2

Adjacency List of Vertex 3
Head--> 2--> 3

Adjacency List of Vertex 4
Head--> 3--> 5

Adjacency List of Vertex 5
Head--> 4--> 5

 * */
