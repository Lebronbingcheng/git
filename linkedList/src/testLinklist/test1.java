package testLinklist;

import linked_List.LinkList;
import linked_List.Node;

public class test1 {
	public static void main(String[] args){
		LinkList list = new LinkList();
		//list.deleteAndPosition(1);
		//list.displayAllNodes();	
		//list.displayAnyNode(1);
		//list.getLength();
		list.addHeadNode(1);
		list.addHeadNode(2);
		LinkList l = new LinkList();
		l.addHeadNode(3);
		l.addHeadNode(4);
		/*list.displayAllNodes();
		l.displayAllNodes();*/
		l.conLinkList(l, list);
		//l.displayAllNodes();
		
		LinkList a = new LinkList(l);
		a.displayAllNodes();
		
		
	}
}
