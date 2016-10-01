package Migong;

import java.util.ArrayList;
import java.util.List;

public class Migong {
	int[][] mg;
	int[][] edge;
	Node[] array;
	
	public Migong(int[][] mg){
		this.mg = mg;
		this.array = this.toNodeArray(mg);
		this.edge = this.toEdgeArray(this.array, mg);
	}
	
	public void printMg(int[][] mg){
		for(int i = 0; i < mg.length; i++){
			for(int a = 0; a < mg[i].length; a++){
				System.out.print(mg[i][a] + " ");
			}
			System.out.println();
		}
	}
	
	public Node[] toNodeArray(int[][] mg){
		List<Node> list = new ArrayList<Node>();
		for(int i = 0 ; i < mg.length; i++){
			for(int j = 0; j < mg[i].length; j++){
				if(mg[i][j] == 0){
					list.add(new Node(i,j));
				}
			}
		}
		Node[] array = new Node[list.size()];
		for(int i = 0; i < array.length; i++){
			array[i] = list.get(i);
		}
		return array;
	}
	
	public int[][] toEdgeArray(Node[] array, int[][] mg){
		int[][] edgeArray = new int[array.length][array.length];
		for(int a = 0; a < array.length; a++){
			int x = array[a].x;
			int y = array[a].y;
			int[] edge = new int[4];
			edge[0] = findNode(x+1, y, array);
			edge[1] = findNode(x-1, y, array);
			edge[2] = findNode(x, y+1, array);
			edge[3] = findNode(x, y-1, array);
			for(int ad : edge){
				if(ad != -1){
					edgeArray[a][ad] = 1;
				}
			}
		}
		return edgeArray;
	}
	
	public void depTravel(Node p, int[][] edge, Node[] array){
		int test = 1;
		for(int i = 0; i < array.length; i++){
			test = test * array[i].visited;
		}
		if(test == 1){
			return;
		}
		if(p.visited == 0){
			p.visited = 1;
			System.out.print("(" + p.x + "," + p.y + ")");
		}
		for(int i = 0 ; i < edge[findIndex(p,array)].length; i++){
			if(edge[findIndex(p,array)][i] == 1 && array[i].visited != 1){
				this.depTravel(array[i], edge, array);
			}
		}
	}
	List<Node> list = new ArrayList<Node>();
	public List<Node> findPath(Node start, Node end){	
		for(int i = 0; i < edge[findIndex(start,array)].length; i++){
			if(edge[findIndex(start, array)][findIndex(end, array)] == 1){
				list.add(start);
				list.add(end);
				return list;
			}
		}
		if(start.visited == 0){
			start.visited = 1;
			list.add(start);
		}
		for(int i = array.length-1; i > 0; i--){
			if(edge[findIndex(start,array)][i] == 1 && array[i].visited != 1){
				findPath(array[i], end);
				break;
			}
		}
		return list;
	}
		
	private int findNode(int x, int y, Node[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i].x == x && array[i].y == y){
				return i;
			}
		}
		return -1;
	}
	
	private static int findIndex(Node p, Node[] array){
		for(int i = 0; i < array.length; i++){
			if(p.x == array[i].x && p.y == array[i].y){
				return i;
			}
		}
		return -1;
	}

}
