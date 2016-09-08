package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
	
	//建立结点之间的连接
	public void creatEdge(int data1, int data2){
		int index1 = findIndex(data1);
		int index2 = findIndex(data2);
		if(index1 != -1 && index2 != -1){
			edgeArray[index1][index2] = 1;
			edgeArray[index2][index1] = 1;
		}
	}
	
	//delete an edge
	public boolean deleteEdge(int data1, int data2){
		int index1 = findIndex(data1);
        int index2 = findIndex(data2);
        if(index1 != -1 && index2 != -1 && edgeArray[index1][index2] == 1){
			edgeArray[index1][index2] = 0;
			edgeArray[index2][index1] = 0;
			return true;
        }	
        return false;
	}
	
	//insert a node
	public boolean insertNode(int data1, int data2){
		int index = findIndex(data2);
		if(index == -1){
			return false;
		}
		int[] newArr = new int[num+1];
		for(int i = 0,j = 0; i < nodeArray.length; i++,j++){
			newArr[i] = nodeArray[j];
		}
		newArr[num] = data1;
		nodeArray = newArr;
		int[][] newEge = new int[num+1][num+1];
		for(int i = 0,a = 0; i < edgeArray.length; i++, a++){
			for(int j =0, b = 0; j < edgeArray[i].length; j++, b++){
				newEge[i][j] = edgeArray[a][b];
			}
		}
		edgeArray = newEge;
		this.creatEdge(data1, data2);
		return true;
	}
	
	//delete a node
	public boolean deleteNode(int data){
		if(findIndex(data) == -1){
			return false;
		}
		List<Integer> l = new ArrayList<Integer>();
		for(int a : nodeArray){
			l.add(a);
		}
		int index = this.findIndex(data);
		l.remove(index);
		int[] newArr = new int[num-1];
		for(int i = 0; i < newArr.length; i++){
			newArr[i] = l.get(i);
		}
		nodeArray = newArr;
		int[][] newEge = new int[num-1][num-1];
		for(int i = 0, a = 0; i < index; i++,a++){
			for(int j = 0, b = 0; j < index; j++, b++){
				newEge[i][j] = this.edgeArray[a][b];
			}
		}
		for(int i = index, a = index+1; a < num; i++,a++){
			for(int j = 0, b = 0; j < index; j++, b++){
				newEge[i][j] = this.edgeArray[a][b];
			}
		}
		for(int i = 0, a = 0; a < index; i++,a++){
			for(int j = index, b = index+1; b < num; j++, b++){
				newEge[i][j] = this.edgeArray[a][b];
			}
		}
		for(int i = index, a = index+1; a < num; i++,a++){
			for(int j = index, b = index+1; b < num; j++, b++){
				newEge[i][j] = this.edgeArray[a][b];
			}
		}
		edgeArray = newEge;
		return true;
	}
	
	private int findIndex(int data){
		for(int i=0; i < nodeArray.length; i++){
			if(nodeArray[i] == data){
				return i;
			}
		}
		return -1;
	}
	
	public boolean hasRelatedNode(int data){
		if(findIndex(data) == -1 || findRelatedNode(data).isEmpty()){
			return false;
		}
		return true;
	}
	
	public Stack<Integer> findRelatedNode(int data){
		int dataIndex = findIndex(data);
		Stack<Integer> stack = new Stack<Integer>();
		for(int j = 0; j < edgeArray[dataIndex].length; j++){
			if(edgeArray[dataIndex][j] == 1){
				stack.push(nodeArray[j]);
			}
		}
		return stack;
	}
	
	//打印边数组
	public void printEdgeArray(){
		for(int i = 0; i<edgeArray.length; i++){
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
