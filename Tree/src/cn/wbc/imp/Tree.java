package cn.wbc.imp;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private Integer data;
	private List<Tree> childTreeList;
	
	public Tree(){
		data = null;
		childTreeList = null;
	}
	
	//�������
	public Tree(int a){
		data = a;
		childTreeList = null;
	}
	
	public Tree(int a, List<Tree> list){
		data = a;
		childTreeList = list;
	}
	
	public Tree(int a, Tree...args){
		childTreeList = new ArrayList();
		for(Tree x : args){
			childTreeList.add(x);
		}
		data = a;
	}
	
	//�ж�һ�����Ƿ�Ϊ��
	public boolean isEmpty(){
		return data == null;
	}
	//�ж�һ�����Ƿ�Ϊ���ڵ���
	public boolean isLeft(){
		return getChildTreeList() == null;
	}
	
	//ǰ�����
	public void preIteratorTree(){
		if(!isEmpty()){
			System.out.print(data + "->");
			for(Tree t : getChildTreeList()){
				if(t.isLeft()){
					System.out.print(t.getData() + "->");
				}else{
					t.preIteratorTree();
				}
			}
		}
	}

	public Integer getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<Tree> getChildTreeList() {
		return childTreeList;
	}

	public void setChildTreeList(List<Tree> childTreeList) {
		this.childTreeList = childTreeList;
	}
}
