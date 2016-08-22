package cn.wbc.imp;

public class Node {
	private String index;
	private String parentIndex;
	
	public Node(String index){
		this.index = index;
	}
	
	public Node(String index, String parentIndex){
		this.index = index;
		this.parentIndex = parentIndex;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

    public String getParentIndex() {
		return parentIndex;
	}

	public void setParentIndex(String parentIndex) {
		this.parentIndex = parentIndex;
	}
}
