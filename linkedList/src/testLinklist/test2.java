package testLinklist;

import linked_List.LinkList;
import linked_List.Node;

public class test2 {
	public static void main(String[] args){
		Node head = new Node("Kobe");
		Node ad = new Node("James");
		LinkList l = new LinkList(head);
		l.addHeadNode("Yao");
		l.addHeadNode("tracy");
		l.addHeadNode("Curry");
		l.addHeadNode("Green");
		l.clear();
		//System.out.println(l.isEmpty());
		//l.addAnyPosition(5, "James");
		//l.addLastPosition(ad);
		//l.displayAllNodes();
		//l.deleteAndPosition(5);
		//l.changeNode(2, "dfa");
		l.displayAllNodes();
		//l.displayAnyNode(0);
		//System.out.println(l.getLength());
		
		LinkList a = new LinkList(l);
		a.displayAllNodes();
	}

}
