package cn.wbc.imp;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private TreeNode root;
	
	public Tree(){
		root = new TreeNode(new Node("root"));  
	}

	public TreeNode getRoot() {
		return root;
	}

    public void setRoot(TreeNode root) {
	    this.root = root;
	}
    
    //�ж�һ�����Ƿ�Ϊ��
    public boolean isEmpty(){
    	return this.getRoot() == null;
    }
    
    //�ж�һ������Ƿ�ΪҶ�ӽ��
    public boolean isLeft(TreeNode treeNode){
    	return treeNode.getChildList() == null;
    }
    
    //����һ����
	public Tree createTree(List<Node> nodeList){
		if(nodeList == null){
			return null;
		}
		Tree newTree = new Tree();
		for(Node node : nodeList){
			if(node.getParentIndex().equals("root")){
				newTree.getRoot().getChildList().add(new TreeNode(node));
			}else{
				addChild(newTree.getRoot(), node);
			}
		}
		return newTree;
	}
	
	//���һ�����
	public void addChild(TreeNode treeNode, Node node){
		for(TreeNode x : treeNode.getChildList()){
			if(x.getNode().getIndex().equals(node.getParentIndex())){
				x.getChildList().add(new TreeNode(node));
				return;
			}
			if(x.getChildList() != null){
				addChild(x,node);
			}
		}
	}
	
	public void addChild(Node node){
		for(TreeNode x : this.getRoot().getChildList()){
			if(x.getNode().getIndex().equals(node.getParentIndex())){
				x.getChildList().add(new TreeNode(node));
				return;
			}
			if(x.getChildList() != null){
				addChild(x,node);
			}
		}
	}
	
	//ɾ��һ�����
	public void deleteChild(TreeNode treeNode, Node node){
		for(TreeNode x : treeNode.getChildList()){
			if(x.getNode().getIndex().equals(node.getParentIndex())){
				for(int i = 0; i < x.getChildList().size(); i++){
					if(x.getChildList().get(i).getNode().equals(node)){
						x.getChildList().remove(i);
						i--;
					}
				}
			}
			if(x.getChildList() != null){
				deleteChild(x,node);
			}
		}
	}
	
	public void deleteChild(Node node){
		for(TreeNode x : this.getRoot().getChildList()){
			if(x.getNode().getIndex().equals(node.getParentIndex())){
				for(int i = 0; i < x.getChildList().size(); i++){
					if(x.getChildList().get(i).getNode().equals(node)){
						x.getChildList().remove(i);
						i--;
					}
				}
			}
			if(x.getChildList() != null){
				deleteChild(x,node);
			}
		}
	}
	
	//��ӡ�ӽڵ�
	public String printIndexNode(TreeNode treeNode, int index){
		if(index >= treeNode.getChildList().size()){
			return "invalued index";
		}
		return treeNode.getChildList().get(index).getNode().getIndex();
	}

	
	//������
	public StringBuilder iteratorTree(TreeNode treeNode){
		StringBuilder buffer = new StringBuilder();  
        buffer.append("\n"); 
        if(treeNode != null){
        	for(TreeNode x : treeNode.getChildList()){
        		buffer.append(x.getNode().getIndex()+ " ");
        		if(x.getChildList() != null){
        			buffer.append(iteratorTree(x));
        		}
        	}
        }
        buffer.append("\n");
        return buffer;
	}
}
