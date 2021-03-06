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
	
	//判断一个树是否为空
	public boolean isEmpty(){
	    return data == null;
	}
	
	//判断一个结点是否为叶子结点
	public boolean isLeaf(){
		return left == null && right == null;
	}
	
	//非递归前序遍历
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

	//前序遍历
	public void preIteratorTree(){
		if(isEmpty()){
			return;
		}
		System.out.print(data + "->");
		if(left != null){
			left.preIteratorTree();
		}
		if(right != null){
			right.preIteratorTree();
		}
	}
	
	//中序遍历
	public void inIteratorTree(){
		if(isEmpty()){
			return;
		}
		if(left != null){
			left.inIteratorTree();
		}
		System.out.print(data + "->");
		if(right != null){
			right.inIteratorTree();
		}
	}
	
	//后序遍历
	public void postIteratorTree(){
		if(isEmpty()){
			return;
		}
		if(left != null){
			left.postIteratorTree();
		}
		if(right != null){
			right.postIteratorTree();
		}
		System.out.print(data + "->");
	}
	
	//获取一棵树的深度
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

	//移除一个元素
	public void remove(Integer data){
		if(this.isLeaf() && this.data != data){
			return;
		}
		if(this.data < data){
			this.right.remove(data);
		}else if(this.data > data){
			this.left.remove(data);
		}else if(this.data == data){
			//假如需要删除的结点是叶子节点，则直接调用delete()删除即可
			if(this.isLeaf()){
				this.delete(data);
			}
			/*假如需要删除的结点有左子树或右子树中的一个，先用findChild()返回这个结点的左（右）子树，把找出的子树的信息存在temp，leftOne
			RightOne三个引用中，随后删除子树，再把之前存储的信息赋给需要删除的结点*/
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
			/*假如需要删除的结点有两个子树，那么就找出他右结点中最小的数的结点（因为这个结点一定至多有右子树），把这个节点的
			 * 数值寄存下来，然后remove（）这个结点，然后再把刚才寄存的数值赋给要删除的结点数值*/
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
	
	//删除一个子树
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
	
	//查找一个数
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
	
	//插入一个数
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
