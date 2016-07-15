package linked_List;

public class LinkList {
	Node head = null;
	int length;
	
	public LinkList(){}
	
	public LinkList(Node a){
		head = a;
	}
	
	public LinkList(Object obj, Node a){
		Node head = new Node(obj);
	    head.setNext(a);
	}
	
	public LinkList(LinkList list){
		this.head = list.head;
	}
	
	/*判断链表是否为空*/
	public boolean isEmpty(){ 
		return this.head == null;
	}
	
	/*清空链表*/
	public void clear(){
		length = this.getLength();
		for(int i = 0; i < length; i++){
			this.deleteHeadNode();
		}
		/*while(head != null){
			this.deleteHeadNode();
		}*/
	}
	
	/*改变一个结点*/
	public void changeNode(int index, Object obj, Node next){
		if(this.isEmpty()){
		    System.out.println("empty linklist");
			return;
		}
		if(index < 0){
			System.out.println("input wrong index");
			return;
		}
		Node current = head;
		for(int pos = 0; pos < index; pos++){
			current = current.getNext();
			if(current == null){
				System.out.println("input wrong index");
				return;
			}
		}	
		current.setObj(obj);
		current.setNext(next);
	}
	
	public void changeNode(int index, Object obj){
		if(this.isEmpty()){
		    System.out.println("empty linklist");
			return;
		}
		if(index < 0){
			System.out.println("input wrong index");
			return;
		}
		Node current = head;
		for(int pos = 0; pos < index; pos++){
			current = current.getNext();
			if(current == null){
				System.out.println("input wrong index");
				return;
			}
		}	
		this.changeNode(index, obj, current.getNext());
	}
	
	public void changeNode(int index, Node next){
		if(this.isEmpty()){
		    System.out.println("empty linklist");
			return;
		}
		if(index < 0){
			System.out.println("input wrong index");
			return;
		}
		Node current = head;
		for(int pos = 0; pos < index; pos++){
			current = current.getNext();
			if(current == null){
				System.out.println("input wrong index");
				return;
			}
		}	
		this.changeNode(index, current.getObj(), next);
	}
	
	/*添加头节点*/
	public void addHeadNode(Object obj){
		Node node = new Node(obj);
		if(this.isEmpty()){
			head = node;
			return;
		}
		node.setNext(head);
		head = node;
	}
	
	public void addHeadNode(Node a){
		if(this.isEmpty()){
			head = a;
			return;
		}
		a.setNext(head);
		head = a;
	}
	
	/*删除头结点*/
	public void deletefirstNode(){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		head = current.getNext();
	}
	
	/*在任意位置添加节点,在index个结点加入新节点*/
	public void addAnyPosition(int index, Object obj){
		 int pos = 0;
		 Node node = new Node(obj);
		 Node current = head;
		 Node previous = head;
		 if(this.isEmpty()){
			 System.out.println("new node has been seen as head");
			 head = node;
		 }
		 if(index < 0){
			 System.out.println("wrong index");
			 return;
		 }
		 if (index == 0){
			 node.setNext(head);
			 head = node;
			 System.out.println("success to add");
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
	}
	
	/*在链表尾部添加结点*/
	public void addLastPosition(Node node){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		length = this.getLength();
		for(int i = 0; i < length - 1; i++){
			current = current.getNext();
		}
		/*while(current.getNext() != null){
			current = current.getNext();
		}*/
		current.setNext(node);
	}
	
	/*删除头结点*/
	public void deleteHeadNode(){
		if(this.isEmpty()){
			System.out.println("empty linklist");
			return;
		}
		Node current = head;
		head = current.getNext();
	}
	
	/*删除任意位置节点*/
	public void deleteAndPosition(int index){		
	    int pos = 0;
		Node current = head;  
        Node previous = head;   
        if(head == null){
        	 System.out.println("empty linklist");
        	 return;
        }
        if(index < 0){
			 System.out.println("wrong index");
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
        if(this.isEmpty()){
        	System.out.println("the link is empty");
        	return;
        }
        if(current == head){          	 
            head = head.getNext();
        } else{     	
            Node tap = current.getNext();
            previous.setNext(tap);
            pos = 0; 
        }  
   }
	
   /*求结点个数，也就是链表长度*/
   public int getLength(){
	   int length = 0;
	   Node current = head;
	   if(this.isEmpty()){
		   return 0;
	   }
	   while(current != null){
		   length++;
		   current = current.getNext();
	   }
	   return length;
   }
	
   /*打印第n个结点*/
   public void displayAnyNode(int index){
	   if(this.isEmpty()){
	       System.out.println("empty linklist");
		   return;
	   }
	   if(index < 0){
		   System.out.println("input wrong index");
		   return;
	   }
	   Node current = head;
	   for(int pos = 0; pos < index; pos++){
		   current = current.getNext();
		   if(current == null){
			   System.out.println("input wrong index");
			   return;
		   }
	   }	
		current.showNode(current);
   }
	
   /*打印所有结点*/
   public void displayAllNodes(){
       Node current = head; 
       length = this.getLength();
       for(int i = 0; i < length; i++){
    	   current.showNode(current);
    	   current = current.getNext();
       }
     /*  while (current != null){
           current.showNode(current);  
           current = current.getNext();  
       }  */
   }  
	
   /*合并两个链表*/
   public LinkList conLinkList(LinkList a, LinkList b){
	   if(a.isEmpty()|| b.isEmpty()){
		   System.out.println("intput wrong linklist");
		   return null;
	   }else{
		   Node current = a.head;
		   length = this.getLength();
		   for(int i = 0; i < length - 1; i++){
			   current = current.getNext();
		   }
		  /* while(current.getNext() != null){
			   current = current.getNext();
		   }*/
		   current.setNext(b.head);
		   return a;
	   }
   }
}
