package linked_List;

public class Node {
	private Node next;             //结点中的指针域,指向下一个结点
	private int data;            //结点中的数据域
	
	public Node(){
		this.data = 0;
		this.next = null;
	}
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public void showNode(Node a){
		int data = a.getData();
		System.out.print(data+" ");
	}
}
