package graph;

public class Node {
	private int data;
	private boolean status;
	
	public Node(int data){
		this.data = data;
		this.status = false;
	}
	
	public Node(){}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
}
