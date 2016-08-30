package cn.wbc.test;

import cn.wbc.imp.BinaryTree;

public class Demo3 {
	public static void main(String[] args){
		int[] array = new int[]{123,34,1,121,13,54};		
		BinaryTree t1 = new BinaryTree(66,array);
		t1.preOrder();
		System.out.println();
		t1.preIteratorTree();
		System.out.println();
		t1.remove(66);
		t1.preOrder();
	}
}
