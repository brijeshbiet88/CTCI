package com.ctci.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenGraphNodes {

	public static void main(String[] args) {
		GraphNode head = GraphUtils.getGraph();
		System.out.println("Print Graph :");
		GraphUtils.printGraph(head);
		GraphUtils.clearVisitedGraph(head);
		
		System.out.println("---------------------------Test Case 1 -------------------------------");
		GraphNode start = head.getChildren().get(1);
		GraphNode end = head.getChildren().get(1).getChildren().get(1);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		GraphUtils.clearVisitedGraph(head);
		System.out.println();
		
		
		System.out.println("---------------------------Test Case 2 -------------------------------");
		start = head.getChildren().get(0).getChildren().get(3);
		end = head.getChildren().get(1).getChildren().get(1);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		GraphUtils.clearVisitedGraph(head);
		System.out.println();
		
		System.out.println("---------------------------Test Case 3 -------------------------------");
		start = head.getChildren().get(0).getChildren().get(0).getChildren().get(0);
		end = head.getChildren().get(1).getChildren().get(1);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		GraphUtils.clearVisitedGraph(head);
		System.out.println();
		
		System.out.println("---------------------------Test Case 4 -------------------------------");
		start = head.getChildren().get(1).getChildren().get(1).getChildren().get(0);
		end = head.getChildren().get(1).getChildren().get(1);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		GraphUtils.clearVisitedGraph(head);
		System.out.println();
		
		System.out.println("---------------------------Test Case 5 -------------------------------");
		start = head.getChildren().get(0).getChildren().get(2);
		end = head.getChildren().get(0).getChildren().get(3);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		GraphUtils.clearVisitedGraph(head);
		System.out.println();
		
		System.out.println("---------------------------Test Case 6 -------------------------------");
		end = head.getChildren().get(0).getChildren().get(2);
		start = head.getChildren().get(0).getChildren().get(3);
		System.out.println("There is a Route Between "+start.data+" and "+end.data+" ? "+search(start, start, end));
		System.out.println();
		
	}
	
	public static boolean search(GraphNode head, GraphNode start, GraphNode end) {

		Queue<GraphNode> q = new LinkedList<GraphNode>();
		if (start == end) {
			return true;
		}
		q.add(start);
		while (!q.isEmpty()) {

			GraphNode tmp = q.poll();
			tmp.visited = true;
			ArrayList<GraphNode> children = tmp.getChildren();
			for (int i = 0; i < children.size(); i++) {
				if (!children.get(i).visited) {
					q.add(children.get(i));
					if (children.get(i) == end) {
						return true;
					}
				}
			}

		}

		return false;
	}

}
/*
 * Print Graph :
Adjacency List of Vertex 1
Head--> 2--> 3

Adjacency List of Vertex 2
Head--> 1--> 3--> 4--> 6

Adjacency List of Vertex 3
Head--> 1--> 2

Adjacency List of Vertex 4
Head--> 3--> 5

Adjacency List of Vertex 6
Head--> 

Adjacency List of Vertex 5
Head--> 4--> 5--> 6

---------------------------Test Case 1 -------------------------------
There is a Route Between 3 and 2 ? true

---------------------------Test Case 2 -------------------------------
There is a Route Between 6 and 2 ? false

---------------------------Test Case 3 -------------------------------
There is a Route Between 2 and 2 ? true

---------------------------Test Case 4 -------------------------------
There is a Route Between 1 and 2 ? true

---------------------------Test Case 5 -------------------------------
There is a Route Between 4 and 6 ? true

---------------------------Test Case 6 -------------------------------
There is a Route Between 6 and 4 ? false


 * */