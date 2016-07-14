package linked_List;

public class LinkList {
	Node head = null;
	Node current = null;
	
	public LinkList(){}
	
	public LinkList(Node a){
		head = a;
	}
	
	public LinkList(Object obj, Node a){
		Node head = new Node(obj);
	    head.setNext(a);
	}
	
	/*添加头节点*/
	public void addHeadNode(Object obj){
		Node node = new Node(obj);
		if(head == null){
			head = node;
			return;
		}
		node.setNext(head);
		head = node;
	}
	
	public void addHeadNode(Node a){
		if(head == null){
			head = a;
			return;
		}
		a.setNext(head);
		head = a;
	}
	
	/*删除头结点*/
	public void deletefirstNode(){
		if(head == null){
			System.out.println("empty linklist");
			return;
		}
		current = head;
		head = current.getNext();
	}
	
	/*在任意位置添加节点,在index个结点加入新节点*/
	public void addAnyPosition(int index, Object obj){
		 int pos = 0;
		 Node node = new Node(obj);
		 Node current = head;
		 Node previous = head;
		 if(head == null){
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
		 //找到插入新节点的位置，是previous和current中间
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
		if(head == null){
			System.out.println("empty linklist");
			return;
		}
		current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(node);
	}
	
	/*删除头结点*/
	public void deleteHeadNode(){
		if(head == null){
			System.out.println("empty linklist");
			return;
		}
		current = head;
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
        if(head == null){
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
	   current = head;
	   if(head == null){
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
	   if(head == null){
	       System.out.println("empty linklist");
		   return;
	   }
	   if(index < 0){
		   System.out.println("input wrong index");
		   return;
	   }
	   current = head;
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
       current = head;  
       while (current != null){
           current.showNode(current);  
           current = current.getNext();  
       }  
   }  
	
   /*合并两个链表*/
   public LinkList conLinkList(LinkList a, LinkList b){
	   if(a.head == null || b.head == null){
		   System.out.println("intput wrong linklist");
		   return null;
	   }else{
		   
		   current = a.head;
		   while(current.getNext() != null){
			   current = current.getNext();
		   }
		   current.setNext(b.head);
		   return a;
	   }
   }
}
