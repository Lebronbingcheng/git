package test;

import graph.Graph;
import graph.Node;

public class Demo {
	public static void main(String[] args){
		Node[] nodes = new Node[9];
		for(int i = 0; i < 9; i++){
			nodes[i] = new Node(i);
		}
		Graph g7 = new Graph(nodes[7]);
		Graph g6 = new Graph(nodes[6],g7);
		Graph g3 = new Graph(nodes[3],g6,g7);
		Graph g8 = new Graph(nodes[8]);
		Graph g4 = new Graph(nodes[4],g8);
		Graph g5 = new Graph(nodes[5],g8);
		Graph g2 = new Graph(nodes[2],g4,g5);
		Graph g1 = new Graph(nodes[1],g2,g3);
		
		g1.removeEdge(g4, g8);
		g1.DepthFirstTraversal();
		System.out.println();
		g1.addEdge(g2, g8);
		g1.DepthFirstTraversal();	
	}
}
