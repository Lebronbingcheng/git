package test;

import graph.Graph;

public class Demo {
	public static void main(String[] args){
		Graph g = new Graph(1,2,3,4,5);	
		g.creatEdge(1, 4);
		g.creatEdge(1, 5);
		g.creatEdge(2, 4);
		g.creatEdge(2, 5);
	    g.creatEdge(3, 4);
		//g.printEdgeArray();
	    //g.insertNode(6, 5);
	    //g.printEdgeArray();
	    g.deleteNode(2);
	    g.printEdgeArray(); 
	}
}
