package Graph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		Comparator<Node> comparator = new WeightCompare();
		Queue<Node> p =  new PriorityQueue<Node>(4,comparator);
		Node node = new Node(1,1);
		p.add(node);
		p.add(new Node(2,13));
		p.add(new Node(12,34));
		p.add(new Node(11,33));
		p.remove(node);
		System.out.print(p.remove().weight);
	}
	

}
