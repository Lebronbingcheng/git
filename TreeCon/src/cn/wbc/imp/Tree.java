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
    
    //判断一个树是否为空
    public boolean isEmpty(){
    	return this.getRoot() == null;
    }
    
    //判断一个结点是否为叶子结点
    public boolean isLeft(TreeNode treeNode){
    	return treeNode.getChildList() == null;
    }
    
    //构造一棵树
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
	
	//添加一个结点
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
	
	//删除一个结点
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
	
	//打印子节点
	public String printIndexNode(TreeNode treeNode, int index){
		if(index >= treeNode.getChildList().size()){
			return "invalued index";
		}
		return treeNode.getChildList().get(index).getNode().getIndex();
	}

	
	//遍历树
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
