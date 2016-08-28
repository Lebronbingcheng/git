package cn.wbc.test;

import cn.wbc.imp.BinaryTree;

public class Demo1 {
	public static void main(String[] args){
		BinaryTree t5 = new BinaryTree(13);
		BinaryTree t4 = new BinaryTree(7);
		BinaryTree t2 = new BinaryTree(12,t4,t5);
		BinaryTree t3 = new BinaryTree(99);
		BinaryTree t1 = new BinaryTree(66,t2,t3);
		System.out.print("ǰ����� pre-travel tree�� ");
		t1.preIteratorTree();
		System.out.println();
		System.out.print("������� in-travel tree�� ");
		t1.inIteratorTree();
		System.out.println();
		System.out.print("������� post-travel tree�� ");
		t1.postIteratorTree();
		System.out.println();
		System.out.println("....................................................................");
		System.out.println("��ѯ����� " + t1.check(7));
		System.out.println("....................................................................");
		System.out.println("���ĸ߶ȣ� " + t1.getLevel());
		System.out.println("....................................................................");
		t1.preOrder();
	}
}
