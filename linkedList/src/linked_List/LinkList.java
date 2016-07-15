package linked_List;

public class LinkList {
	Node head = null;
	int length;
	
	public LinkList(){
		length = 0;
	}
	
	public LinkList(Node a){
		head = a;
		length = 1;
	}
	
	public LinkList(Object obj, Node a){
		Node head = new Node(obj);
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
		for(int i = 0; i < length; i++){
			this.deleteHeadNode();
		}
		/*while(head != null){
			this.deleteHeadNode();
		}*/
		length = 0;
	}
	
	/*�ı�һ�����*/
	public void changeNode(int index, Object obj, Node next){
		if(this.isValue(index) == false){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		if(current != null){
		    current.setObj(obj);
		    current.setNext(next);
		    return;
		}
		System.out.println("failed to change");
	}
	
	public void changeNode(int index, Object obj){
		if(this.isValue(index) == false){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		this.changeNode(index, obj, current.getNext());
	}
	
	public void changeNode(int index, Node next){
		if(this.isValue(index) == false){
			System.out.println("wrong");
			return;
		}
		Node current = this.findNode(index);
		this.changeNode(index, current.getObj(), next);
	}
	
	/*���ͷ�ڵ�*/
	public void addHeadNode(Object obj){
		Node node = new Node(obj);
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
	public void addAnyPosition(int index, Object obj){
		 int pos = 0;
		 Node node = new Node(obj);
		 Node current = head;
		 Node previous = head;
		 if(this.isEmpty()){
			 System.out.println("new node has been seen as head");
			 head = node;
		 }
		 if(index < 0 || index > length - 1){
			 System.out.println("wrong index");
			 return;
		 }
		 if (index == 0){
			 node.setNext(head);
			 head = node;
			 System.out.println("success to add");
			 length++;
			 return;
		 }
		 while (pos != index) 
		 {
			 previous = current;              
			 current = current.getNext();
			 pos++;
		 }
		 if(current == null)
		 {
			 System.out.println("failed to add");
			 return;
		 }
		 previous.setNext(node);
		 node.setNext(current);
		 System.out.println("success to add");
		 pos = 0;
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
		/*while(current.getNext() != null){
			current = current.getNext();
		}*/
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
        if(this.isValue(index) == false){
			System.out.println("wrong");
			return;
		}
        while (pos!= index){  
            pos++;  
            previous = current;  
            current = current.getNext();  
        }
        if(current == null){
        	System.out.println("failed to delete");
        	return;
        }
        if(current == head){          	 
            head = head.getNext();
            length--;
        } else{     	
            Node tap = current.getNext();
            previous.setNext(tap);
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
	   if(this.isEmpty()){
	       System.out.println("empty linklist");
		   return;
	   }
	   if(index < 0 || index > length - 1){
		   System.out.println("input wrong index");
		   return;
	   }
	   Node current = this.findNode(index);
	   current.showNode(current);
   }
	
   /*��ӡ���н��*/
   public void displayAllNodes(){
       Node current = head;      
      /* for(int i = 0; i < length - 1; i++){
    	   current.showNode(current);
    	   current = current.getNext();
       }*/
      while (current != null){
           current.showNode(current);  
           current = current.getNext();  
       }  
   }  
	
   /*�ϲ���������*/
   public LinkList conLinkList(LinkList a, LinkList b){
	   if(a.isEmpty()|| b.isEmpty()){
		   System.out.println("intput wrong linklist");
		   return null;
	   }else{
		   Node current = a.head;
		   for(int i = 0; i < length - 1; i++){
			   current = current.getNext();
		   }
		  /* while(current.getNext() != null){
			   current = current.getNext();
		   }*/
		   current.setNext(b.head);
		   length = a.getLength() + b.getLength();
		   return a;
	   }
   }
   
   /*�ж������Ƿ���Ч*/
   public boolean isValue(int index){
	   if(this.isEmpty() || index < 0 || index > length - 1){
		   return false;
	   }
	   return true;
   }
   
   /*����index�ҵ������еĽ��*/
   public Node findNode(int index){
	   Node current = head;
	   for(int pos = 0; pos < index; pos++){
			current = current.getNext();
			if(current == null){
				System.out.println("input wrong index");
				return null;
			}
		}
	   return current;
   }
}
