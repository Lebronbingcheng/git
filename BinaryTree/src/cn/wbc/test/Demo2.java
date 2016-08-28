package cn.wbc.test;

import cn.wbc.imp.BinaryTree;

public class Demo2 {
	public static void main(String[] args){
		int[] array = new int[]{123,34,1,121,13,54};		
		BinaryTree t1 = new BinaryTree(66,array);
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
		t1.insert(2);
		System.out.println("after insert: ");
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
		t1.delete(123);
		System.out.println("after delete: ");
		System.out.print("ǰ����� pre-travel tree�� ");
		t1.preIteratorTree();
		System.out.println();
		System.out.print("������� in-travel tree�� ");
		t1.inIteratorTree();
		System.out.println();
		System.out.print("������� post-travel tree�� ");
		t1.postIteratorTree();
		System.out.println();	
	}

}
