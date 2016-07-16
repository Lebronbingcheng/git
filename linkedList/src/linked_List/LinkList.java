package linked_List;

public class LinkList {
	private Node head = null;
	private int length;
	
	public LinkList(){
		length = 0;
	}
	
	public LinkList(Node a){
		head = a;
		length = 1;
	}
	
	public LinkList(int data, Node a){
		Node head = new Node(data);
	    head.setNext(a);
	    length = 2;
	}
	
	public LinkList(LinkList list){
		this.head = list.head;
		length = list.getLength();
	}
	
	/*�ж������Ƿ�Ϊ��*/
	public boolean isEmpty(){ 
		return this.head == null;
	}
	
	/*�������*/
	public void clear(){
		while(head != null){
			this.deleteHeadNode();
		}
		length = 0;
	}
	
	/*�ı�һ�����*/
	public void changeNode(int index, int data, Node next){
		if(! this.isValueIndex(index)){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		current.setData(data);
		current.setNext(next);
		return;
	}
	
	public void changeNode(int index, int data){
		if(!this.isValueIndex(index)){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		this.changeNode(index, data, current.getNext());
	}
	
	public void changeNode(int index, Node next){
		if(!this.isValueIndex(index)){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		this.changeNode(index, current.getData(), next);
	}
	
	/*���ͷ�ڵ�*/
	public void addHeadNode(int data){
		Node node = new Node(data);
		if(this.isEmpty()){
			head = node;
			length++;
			return;
		}
		node.setNext(head);
		head = node;
		length++;
	}
	
	public void addHeadNode(Node a){
		if(this.isEmpty()){
			head = a;
			length++;
			return;
		}
		a.setNext(head);
		head = a;
		length++;
	}
	
	/*ɾ��ͷ���*/
	public void deletefirstNode(){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		head = current.getNext();
		length--;
	}
	
	/*������λ����ӽڵ�,��index���������½ڵ�*/
	public void addAnyPosition(int index, int data){		 
		 Node node = new Node(data);
		 Node current = head;
		 Node previous = head;
		 if(! this.isValueIndex(index)){
			 System.out.println("wrong");
			 return;
		 }
		 if (index == 0){
			 node.setNext(head);
			 head = node;
			 System.out.println("success to add");
			 length++;
			 return;
		 }
		 int pos = 0;
		 while (pos != index) 
		 {
			 previous = current;              
			 current = current.getNext();
			 pos++;
		 }
		 previous.setNext(node);
		 node.setNext(current);
		 System.out.println("success to add");
		 length++;
	}
	
	/*������β����ӽ��*/
	public void addLastPosition(Node node){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		for(int i = 0; i < length - 1; i++){
			current = current.getNext();
		}
		current.setNext(node);
		length++;
	}
	
	/*ɾ��ͷ���*/
	public void deleteHeadNode(){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		head = current.getNext();
		length--;
	}
	
	/*ɾ������λ�ýڵ�*/
	public void deleteAndPosition(int index){		
	    int pos = 0;
		Node current = head;  
        Node previous = head;
        if(!this.isValueIndex(index)){
			System.out.println("wrong");
			return;
		}
        while (pos!= index){  
            pos++;  
            previous = current;  
            current = current.getNext();  
        }
        if(current == head){          	 
            head = head.getNext();
            length--;
        } else{     	
            Node temp = current.getNext();
            previous.setNext(temp);
            pos = 0;
            length--;
        }  
   }
	
   /*���������Ҳ����������*/
   public int getLength(){
	   return length;
   }
	
   /*��ӡ��n�����*/
   public void displayAnyNode(int index){
	   if(!this.isValueIndex(index)){
		   System.out.println("wrong");
		   return;
	   }
	   Node current = this.findNode(index);
	   current.showNode(current);
   }
	
   /*��ӡ���н��*/
   public void displayAllNodes(){
       Node current = head;   
       while (current != null){
           current.showNode(current);  
           current = current.getNext();  
       }  
   }  
	
   /*�ϲ���������*/
   public LinkList conLinkList(LinkList a, LinkList b){
	   if(a.isEmpty() || b.isEmpty()){
		   System.out.println("intput wrong linklist");
		   return null;
	   }else{
		   Node current = a.head;
		   for(int i = 0; i < length - 1; i++){
			   current = current.getNext();
		   }
		   current.setNext(b.head);
		   length = a.getLength() + b.getLength();
		   return a;
	   }
   }
   
   /*�ж������Ƿ���Ч*/
   private boolean isValueIndex(int index){
	   if(this.isEmpty() || index < 0 || index > length - 1){
		   return false;
	   }
	   return true;
   }
   
   /*����index�ҵ������еĽ��*/
   private Node findNode(int index){
	   if (! this.isValueIndex(index)){
		   System.out.println("wrong index");
		   return null;
	   }
	   Node current = head;
	   for(int pos = 0; pos < index; pos++){
			current = current.getNext();
		}
	   return current;
   }
   
   /*���������е�����������㣬������һ��LinkList*/
   public LinkList findAllPrime(){
	   LinkList list = new LinkList();
	   Node current = head;
	   for(int i = 0; i < length; i++){
		   int data = current.getData();
		   if(judgeisPrime(data)){
			   list.addHeadNode(data);
		   }
		   current = current.getNext();
	   }
	   return list;
   }
   
   private static boolean judgeisPrime(int testNum){
		for(int i = 2; i < testNum/2 + 1; i++){
			if(testNum%i == 0){
				return false;
			}
		}
		return true;
	}		
}
