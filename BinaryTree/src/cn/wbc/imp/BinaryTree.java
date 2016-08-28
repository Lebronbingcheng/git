package cn.wbc.imp;

import java.util.Stack;

public class BinaryTree {
	private Integer data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(){
		data = null;
		left = null;
		right = null;
	}
	
	public BinaryTree(Integer data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public BinaryTree(Integer data,BinaryTree left,BinaryTree right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public BinaryTree(Integer data, int...array){
		this.data = data;
		for(int i = 0; i < array.length; i++){
			this.insert(array[i]);
		}
	}
	
	//�ж�һ�����Ƿ�Ϊ��
	public boolean isEmpty(){
	    return data == null;
	}
	
	//�ж�һ������Ƿ�ΪҶ�ӽ��
	public boolean isLeaf(){
		return left == null && right == null;
	}
	
	//�ǵݹ�ǰ�����
	public Stack<BinaryTree> preOrder(){
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		stack.push(this);
		while(!stack.empty()){
			 BinaryTree temp = (BinaryTree)stack.pop();
			 if(temp.data != null){
			     System.out.print(temp.data + "->");
			 }
			 if(temp.right != null){
				 stack.push(temp.right);
			 }
			 if(temp.left != null){
				 stack.push(temp.left);
			 }
		}
		return stack;
		
	}

	//ǰ�����
	public void preIteratorTree(){
		if(isEmpty()){
			return;
		}
		System.out.print(data + "->");
		if(getLeft() != null){
			getLeft().preIteratorTree();
		}
		if(getRight() != null){
			getRight().preIteratorTree();
		}
	}
	
	//�������
	public void inIteratorTree(){
		if(isEmpty()){
			return;
		}
		if(getLeft() != null){
			if(getLeft().isLeaf()){
				System.out.print(getLeft().getData() + "->");
			}else{
			    getLeft().inIteratorTree();
			}
		}
		System.out.print(data + "->");
		if(getRight() != null){
			if(getRight().isLeaf()){
				System.out.print(getRight().getData() + "->");
			}else{
			    getRight().inIteratorTree();
			}
		}
	}
	//�������
	public void postIteratorTree(){
		if(isEmpty()){
			return;
		}
		if(getLeft() != null){
			if(getLeft().isLeaf()){
				System.out.print(getLeft().getData() + "->");
			}else{
			    getLeft().postIteratorTree();
			}
		}
		if(getRight() != null){
			if(getRight().isLeaf()){
				System.out.print(getRight().getData() + "->");
			}else{
			    getRight().postIteratorTree();
			}
		}
		System.out.print(data + "->");
	}
	
	//��ȡһ���������
	public int getLevel(){
		if(isEmpty()){
			return 0;
		}
		int a = 0, b = 0;
		if(left != null){
			a = left.getLevel();
		}
		if(right != null){
			b = right.getLevel();
		}
		return Math.max(a, b) + 1;
	}

	//�Ƴ�һ��Ԫ��
	public void remove(Integer data){
		if(this.data < data){
			this.right.remove(data);
		}else if(this.data > data){
			this.left.remove(data);
		}else{
			if(this.isLeaf()){
				this.delete(data);
			}
			if(right != null ^ left != null){
				BinaryTree tree = this.findChild();
				int temp = tree.data;
				BinaryTree leftOne = tree.left;
				BinaryTree RightOne = tree.right;
				this.delete(tree.data);
				this.setData(temp);
				this.setLeft(leftOne);
				this.setRight(RightOne);
			}
			if(right != null && left != null){
				BinaryTree tree = this.findMinofRight();
				Integer temp = tree.data;
				this.remove(tree.data);
				this.setData(temp);
			}
		}
	}
	
	private BinaryTree findChild(){
		if(left != null && right == null){
			return left;
		}
		if(right != null && left == null){
			return right;
		}
		return null;
	}
	
	private BinaryTree findMinofRight(){
		BinaryTree tree = this.right;
		while(tree.left != null){
			tree = tree.left;
		}
		return tree;
	}
	
	//ɾ��һ������
	public void delete(int data){
		if(this.data == data){
			this.data = null;
			left = null;
			right = null;
			return;
		}
		if(isLeaf() && this.data != data){
			return;
		}
		if(this.data < data){
			right.delete(data);
			return;
		}
		left.delete(data);
	}
	
	//����һ����
	public boolean check(int data){
		if(this.data == data){
			return true;
		}
		if(this.isLeaf() && this.data != data){
			return false;
		}
		if(this.data > data){
			return getLeft().check(data);
		}else{
			return getRight().check(data);
		}
	}
	
	//����һ����
	public boolean insert(int data){
		if(this.data > data){
			if(getLeft() == null){
				setLeft(new BinaryTree(data));
				return true;
			}
		    return getLeft().insert(data);
			
		}
		if(this.data < data){
			if(getRight() == null){
				setRight(new BinaryTree(data));
				return true;
			}
			return getRight().insert(data);
		}
		return false;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
