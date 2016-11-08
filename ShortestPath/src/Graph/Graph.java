package Graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
	int num;
	Node[] list = new Node[num];
	Queue<Node> queue;
	
	public Graph(int...array) {
		this.num = array.length;
		this.list = new Node[num];
		Comparator<Node> comparator = new WeightCompare();
		this.queue = new PriorityQueue<Node>(num,comparator);
		for(int i = 0; i < num; i++) {
			Node node = new Node(array[i],9999);
			list[i] = node;
			queue.add(node);
		}
	}
	
	public void findShortPath(int startIndex, int startWeight) {
		list[startIndex].weight = startWeight;
		queue.remove(list[startIndex]);
		if(this.queue.isEmpty()) return;
		Node current = list[startIndex];
		while(current.next != null) {
			current = current.next;
			int index = transfer(current);
			if(startWeight + current.weight < list[index].weight) {
				list[index].weight = startWeight + current.weight;
			}
			if(queue.remove(list[index])) queue.add(list[index]);
		}
		findShortPath(transfer(queue.peek()), queue.peek().weight);
	}
	
	private int transfer(Node a){
		for(int i = 0 ; i < num; i++) {
			if(list[i].data == a.data) return i;
		}
		return -1;
	}
	
	public void addEdge(int index1, int index2, int weight) {
		Node current = list[index1];
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(list[index2].data, weight);
	}
	
	public void print() {
		for(int i = 0; i < list.length; i++) {
			Node current = list[i];
			Node current2 = list[i];
			while(current.next != null) {
				System.out.print(current.data + "->");
				current = current.next;
			}
			System.out.print(current.data + "    ");
			System.out.print("[");
			while(current2.next != null) {
				System.out.print(current2.weight + ",");
				current2 = current2.next;
			}
			System.out.print(current.weight);
			System.out.print("]");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(0,1,2,3,4,5,6,7);
		graph.addEdge(0, 1, 1);
		graph.addEdge(1, 2, 2);
		graph.addEdge(1, 3, 15);
		graph.addEdge(2, 3, 3);
		graph.addEdge(2, 4, 4);
		graph.addEdge(3, 0, 5);
		graph.addEdge(4, 5, 6);
		graph.addEdge(4, 7, 7);
		graph.addEdge(5, 0, 8);
		graph.addEdge(5, 6, 9);
		graph.addEdge(6, 0, 10);
		graph.addEdge(6, 2, 11);
		graph.addEdge(6, 4, 14);
		graph.addEdge(7, 6, 12);
		graph.addEdge(7, 2, 13);
		graph.findShortPath(0, 0);
		System.out.println("from 0 to others");
		for(Node a : graph.list) {
			System.out.print(a.data + "->" + a.weight + "    ");
		}
	}
}
