package cn.wbc.imp;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private Node node;
	private List<TreeNode> childList;
	
	public TreeNode(Node node){
		this.node = node;
		this.childList = new ArrayList<TreeNode>();
	}
	
	public TreeNode(Node node,List<TreeNode> childList){
		this.node = node;
		this.childList = childList;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public List<TreeNode> getChildList() {
		return childList;
	}

	public void setChildList(List<TreeNode> childList) {
		this.childList = childList;
	}
}
