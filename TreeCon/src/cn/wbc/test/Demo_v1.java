package cn.wbc.test;

import java.util.ArrayList;
import java.util.List;

import cn.wbc.imp.Node;
import cn.wbc.imp.Tree;

public class Demo_v1 {
	public static void main(String[] args){
		List<Node> treeNodes = new ArrayList<Node>(); 
		treeNodes.add(new Node("father", "root"));
		treeNodes.add(new Node("child1", "father"));
		treeNodes.add(new Node("child2", "father"));
		treeNodes.add(new Node("child3", "father"));
		treeNodes.add(new Node("child4", "father"));
		//treeNodes.add(new Node("grandson1", "child1"));
		//treeNodes.add(new Node("grandson2", "child1"));
		Tree tree = new Tree();
		tree = tree.createTree(treeNodes);
		//original tree
		System.out.print("the original tree " + tree.iteratorTree(tree.getRoot()).toString());
		//add a node 
		Node add1 = new Node("child5","father");
		tree.addChild(add1);
		System.out.print("add one Node to tree " + tree.iteratorTree(tree.getRoot()).toString());  
		//delete a node
		//Node delete1 = new Node("grandson1","child1");
		tree.deleteChild(add1);
		System.out.print("delete one Node " + tree.iteratorTree(tree.getRoot()).toString());
		System.out.println("printf a node ");
		System.out.println(tree.printIndexNode(tree.getRoot(), 2));
		System.out.println(tree.printIndexNode(tree.getRoot(), 0));
		
	}
}
