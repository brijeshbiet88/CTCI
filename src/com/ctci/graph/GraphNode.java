package com.ctci.graph;

import java.util.ArrayList;

public class GraphNode {

	public Integer data;
	public boolean visited;
	ArrayList<GraphNode> children ;
	
	public GraphNode(Integer data) {
		super();
		this.data = data;
		visited = false;
		children = new ArrayList<GraphNode>();
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public ArrayList<GraphNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<GraphNode> children) {
		this.children = children;
	}
	
	@Override
	public String toString() {
		return "GraphNode [data=" + data + "]";
	}
	
}
