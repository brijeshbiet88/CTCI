package com.ctci.graph;

public class PrintGraph {

	public static void main(String[] args) {
		GraphNode start = GraphUtils.getGraph();
		System.out.println("Print Graph :");
		GraphUtils.printGraph(start);

	}

}
