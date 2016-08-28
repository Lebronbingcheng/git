package cn.wbc.test;

import cn.wbc.imp.BinaryTree;

public class Demo2 {
	public static void main(String[] args){
		int[] array = new int[]{123,34,1,121,13,54};		
		BinaryTree t1 = new BinaryTree(66,array);
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
		t1.insert(2);
		System.out.println("after insert: ");
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
		t1.delete(123);
		System.out.println("after delete: ");
		System.out.print("前序遍历 pre-travel tree： ");
		t1.preIteratorTree();
		System.out.println();
		System.out.print("中序遍历 in-travel tree： ");
		t1.inIteratorTree();
		System.out.println();
		System.out.print("后序遍历 post-travel tree： ");
		t1.postIteratorTree();
		System.out.println();	
	}

}
