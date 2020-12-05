package com.ctci.graph;

import java.util.ArrayList;

public class GraphNode {

	public Integer data;
	ArrayList<GraphNode> children ;
	
	public GraphNode(Integer data) {
		super();
		this.data = data;
		children = new ArrayList<GraphNode>();
	}

	@Override
	public String toString() {
		return "GraphNode [data=" + data + "]";
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
	
	
}
