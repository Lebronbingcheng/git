package testLinklist;

import linked_List.LinkList;
import linked_List.Node;

public class test2 {
	public static void main(String[] args){
		LinkList list = new LinkList();
		list.addHeadNode(1);
		list.addHeadNode(2);
		list.addHeadNode(3);
		list.addHeadNode(4);
		Node a = new Node(12);
		//list.clear();
		//System.out.println(list.getLength());
		//list.changeNode(9, 23);
		//list.addAnyPosition(-1, 17);
		//list.deletefirstNode();
		//list.addLastPosition(a);
		//list.deleteAndPosition(4);
		//LinkList list2 = new LinkList();
		//list.addHeadNode(23);
		list.addHeadNode(77);
		/*list.displayAllNodes();
		list2.displayAllNodes();*/
		//list.conLinkList(list, list2);
		LinkList l = list.findAllPrime();
		//list.displayAllNodes();
		l.displayAllNodes();
	}
}
