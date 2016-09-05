package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private Node begin;
	private List<Graph> list;
	
	public Graph(){
		begin = null;
		list = null;
	}
	
	public Graph(Node node){
		begin = node;
		list = null;
	}
	public Graph(Node node, Graph...graphs){
		list = new ArrayList<Graph>();
		begin = node;
		for(Graph g : graphs){
			list.add(g);
		}
	}
	public Graph(Node node, Node...nodes){
		list = new ArrayList<Graph>();
		begin = node;
		for(Node n : nodes){
			Graph g = new Graph(n);
			list.add(g);
		}
	}
	
	//Depth-First Traversal
	public void DepthFirstTraversal(){
		if(!begin.isStatus()){
			begin.setStatus(true);
			System.out.print(begin.getData()+" ");
		}	
		if(list != null){
			for(Graph n : list){
				n.DepthFirstTraversal();
			}
		}
	}
	
	//Breadth-first Search Traversing 
	/*public void BreadthFirstTraversal(){
		System.out.print(begin.getData()+" ");
		if(list != null){
			for(Graph n : list){
				n.begin.setStatus(true);
				System.out.print(n.begin.getData() + " ");
			}
		}
	}*/
	
	//remove an edge
	public boolean removeEdge(Graph a, Graph b){
		return this.findGraph(a).list.remove(this.findGraph(b));
	}
	
	//add an edge
	public boolean addEdge(Graph a, Graph b){
		return this.findGraph(a).list.add(this.findGraph(b));
	}
	
	public Graph findGraph(Graph g){
		if(this == g){
			return this;
		}
		if(list != null){
			for(Graph a : list){
				return a.findGraph(g);
			}
		}
		return null;
	}

	public Node getBegin() {
		return begin;
	}

	public void setBegin(Node begin) {
		this.begin = begin;
	}

	public List<Graph> getList() {
		return list;
	}

	public void setList(List<Graph> list) {
		this.list = list;
	}
}
