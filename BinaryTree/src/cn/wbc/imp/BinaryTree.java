package cn.wbc.imp;

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
	
	//ǰ�����
	public void preIteratorTree(){
		if(isEmpty()){
			return;
		}
		System.out.print(data + "->");
		if(getLeft() != null){
			if(getLeft().isLeaf() && !getLeft().isEmpty()){
				System.out.print(getLeft().getData() + "->");
			}else{
			    getLeft().preIteratorTree();
			}
		}
		if(getRight() != null){
			if(getRight().isLeaf() && !getRight().isEmpty()){
				System.out.print(getRight().getData() + "->");
			}else{
			    getRight().preIteratorTree();
			}
		}
	}
	
	//�������
	public void inIteratorTree(){
		if(isEmpty()){
			return;
		}
		if(getLeft() != null){
			if(getLeft().isLeaf() && !getLeft().isEmpty()){
				System.out.print(getLeft().getData() + "->");
			}else{
			    getLeft().inIteratorTree();
			}
		}
		System.out.print(data + "->");
		if(getRight() != null){
			if(getRight().isLeaf() && !getRight().isEmpty()){
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
		if(getRight() != null){
			if(getRight().isLeaf() && !getRight().isEmpty()){
				System.out.print(getRight().getData() + "->");
			}else{
			    getRight().postIteratorTree();
			}
		}
		if(getLeft() != null){
			if(getLeft().isLeaf() && !getLeft().isEmpty()){
				System.out.print(getLeft().getData() + "->");
			}else{
			    getLeft().postIteratorTree();
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
	
	//ɾ��һ������
	public void delete(int data){
		if(this.data == data){
			this.data = null;
			return;
		}
		for(BinaryTree t : new BinaryTree[]{left,right}){
			if(t.isLeaf() && t.data != data){
				return;
			}
			t.delete(data);
		}	
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
	public void insert(int data){
		if(this.data > data){
			if(getLeft() == null){
				setLeft(new BinaryTree(data));
				return;
			}else{
				getLeft().insert(data);
			}
		}
		if(this.data < data){
			if(getRight() == null){
				setRight(new BinaryTree(data));
				return;
			}else{
				getRight().insert(data);
			}
		}
		if(this.data == data){
			System.out.println("fail to insert");
		}
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
