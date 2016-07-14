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
	
	/*���ͷ�ڵ�*/
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
	
	/*ɾ��ͷ���*/
	public void deletefirstNode(){
		if(head == null){
			System.out.println("empty linklist");
			return;
		}
		current = head;
		head = current.getNext();
	}
	
	/*������λ����ӽڵ�,��index���������½ڵ�*/
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
		 //�ҵ������½ڵ��λ�ã���previous��current�м�
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
	
	/*������β����ӽ��*/
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
	
	/*ɾ��ͷ���*/
	public void deleteHeadNode(){
		if(head == null){
			System.out.println("empty linklist");
			return;
		}
		current = head;
		head = current.getNext();
	}
	
	/*ɾ������λ�ýڵ�*/
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
	
   /*���������Ҳ����������*/
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
	
   /*��ӡ��n�����*/
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
	
   /*��ӡ���н��*/
   public void displayAllNodes(){
       current = head;  
       while (current != null){
           current.showNode(current);  
           current = current.getNext();  
       }  
   }  
	
   /*�ϲ���������*/
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
