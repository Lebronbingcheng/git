package Shortest;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	public int num;
	public int[] nodeArray;
	public int[][] edgeArray;
	
	public Graph(){}
	public Graph(int num){
		this.num = num;
		nodeArray = new int[num];
	}
	
	public Graph(int...array){
		this.num = array.length;
		nodeArray = array;
		edgeArray = new int[num][num];
	}
	
	//build the connection between NODES
	public void creatEdge(int start, int end, int weight){
		int index1 = findIndex(start);
		int index2 = findIndex(end);
		if(index1 != -1 && index2 != -1){
			edgeArray[index1][index2] = weight;
		}
	}
	
	//Find out the index in the nodeArray, depending on the value
	private int findIndex(int data){
		for(int i=0; i < nodeArray.length; i++){
			if(nodeArray[i] == data){
				return i;
			}
		}
		return -1;
	}
	/*goal: find the related nodes depending on the value of a node 
	 * input: the value of a node
	 * output: the weight of related nodes. if the weight is 0,it means that there is no 
	 *         connection between the two nodes, then let the position is 9999 
	 * */
	private int[] findRelated(int data){
		int[] array = new int[nodeArray.length];
		int index = findIndex(data);
		for(int i = 0; i < edgeArray[index].length; i++){
			if(edgeArray[index][i] == 0){
			 	array[i] = 9999;
			}else{
				array[i] = edgeArray[index][i];
			}
		}
		return array;
	}
	
	/*updata the array. "start" is temp shortest path, and let it pass the "path"
	 * when the length that passing "path" is shorter, updata the array  */
	private int[] getShort(int[] start, int path){
		int[] array_path = findRelated(path);
		int[] array = start;
		int index2 = findIndex(path);
		int start_path = start[index2];
		for(int i = 0; i < array_path.length; i++){
			if(start_path + array_path[i] < array[i]){
				array[i] = start_path + array_path[i];
			}
		}
		return array;
	}
	
	/*find the minimum weight from "start" to nodes in list */
	private int getMin(int start,List<Integer> list){
		int[] arr = findRelated(start);
		int[] index = new int[list.size()];
		for(int i = 0; i < index.length; i++){
			index[i] = findIndex(list.get(i));
		}
		int min = arr[index[0]];
		int in = 0;
		for(int i = 0; i < index.length; i++){
			if(min > arr[index[i]]){
				min = arr[index[i]];
				in = index[i];
			}
		}
		
		return nodeArray[in];
	}
	
	/*Dijkstra */
	public int[] Dijkstra(int start){
		int[] array = findRelated(start);
		//list concludes the nodes that are not tested
		List<Integer> list = new ArrayList<Integer>();
		for(int a : nodeArray){
			list.add(a);
		}
		list.remove((Object)start);
		int temp = start;
		int min = 0;
		while(list.size() != 0){
			min = getMin(temp, list);
			array = getShort(array, min);
			list.remove((Object)min);
			int index1 = findIndex(temp);
			int index2 = findIndex(min);
			//if the edgeArray[i][j]==0, it means that there is no connection;
			//the cycle should break
			if(edgeArray[index1][index2] == 0){
				break;
			}
			temp = min;
			
		}
		return array;
	}

	//´òÓ¡±ßÊý×é
	public void printEdgeArray(){
		for(int i = 0; i < edgeArray.length; i++){
			for(int j = 0; j < edgeArray[i].length; j++){
				System.out.print(edgeArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int[] getNodeArray() {
		return nodeArray;
	}
	public void setNodeArray(int[] nodeArray) {
		this.nodeArray = nodeArray;
	}
	public int[][] getEdgeArray() {
		return edgeArray;
	}
	public void setEdgeArray(int[][] edgeArray) {
		this.edgeArray = edgeArray;
	}
}
