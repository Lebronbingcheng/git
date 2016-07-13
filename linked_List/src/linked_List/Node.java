package linked_List;

public class Node {
	private Node next;             //结点中的指针域,指向下一个结点
	private Object obj;            //结点中的数据域
	
	public Node(){
		this.obj = null;
		this.next = null;
	}
	
	public Node(Object obj){
		this.obj = obj;
		this.next = null;
	}
	
	public Object getObj(){
		return obj;
	}
	
	public void setObj(Object obj){
		this.obj = obj;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public void showNode(Node a){
		Object obj = a.getObj();
		System.out.print(obj+" ");
	}
}
