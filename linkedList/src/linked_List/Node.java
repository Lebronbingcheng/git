package linked_List;

public class Node {
	private Node next;             //����е�ָ����,ָ����һ�����
	private Object obj;            //����е�������
	
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
