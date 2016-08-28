package cn.wbc.test;

import cn.wbc.imp.BinaryTree;

public class Demo1 {
	public static void main(String[] args){
		BinaryTree t5 = new BinaryTree(13);
		BinaryTree t4 = new BinaryTree(7);
		BinaryTree t2 = new BinaryTree(12,t4,t5);
		BinaryTree t3 = new BinaryTree(99);
		BinaryTree t1 = new BinaryTree(66,t2,t3);
		System.out.print("前序遍历 pre-travel tree： ");
		t1.preIteratorTree();
		System.out.println();
		System.out.print("中序遍历 in-travel tree： ");
		t1.inIteratorTree();
		System.out.println();
		System.out.print("后序遍历 post-travel tree： ");
		t1.postIteratorTree();
		System.out.println();
		System.out.println("....................................................................");
		System.out.println("查询结果： " + t1.check(7));
		System.out.println("....................................................................");
		System.out.println("树的高度： " + t1.getLevel());
		System.out.println("....................................................................");
		t1.preOrder();
	}
}
