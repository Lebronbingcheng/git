package cn.wbc.test;

import cn.wbc.imp.Tree;

public class Demo {
	public static void main(String[] args){
		Tree t4 = new Tree(23);
		Tree t2 = new Tree(1,t4);
		Tree t3 = new Tree(2);
		Tree t1 = new Tree(212,t2,t3);
		Tree t = new Tree();
		
		System.out.println("judge the empty Tree: " + t.isEmpty());
		System.out.println("judge the full Tree: " + t1.isEmpty());
		System.out.println(".........................................................");
		System.out.println("preoder");
		t1.preIteratorTree();
		
	}
}
