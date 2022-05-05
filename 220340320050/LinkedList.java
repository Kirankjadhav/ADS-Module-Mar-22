class LinkedList{
	static Node head;
	static class Node{
	int data;
	Node next;
	Node(int d)
	{
	data = d;
	next = null;
	}
	}
	
	Node Rev(Node head,int k){
		if(head == null)
			return null;
		Node curr=head;
		Node next=null;
		Node prev=null;
		int count=0;
		while(count<k && curr != null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next != null)
			head.next=Rev(next,k);
		return prev;
		
	}
	
	void print2(){
		Node temp =head;
		while(temp != null){
			System.out.println(temp.data +" ");
			temp=temp.next;
			
		}
		System.out.println();
		
	}
	void removedup(){
	Node ptr1=null;
	Node ptr2=null;
	Node dup=null;
	ptr1=head;
	while(ptr1 != null && ptr1.next != null){
	ptr2 = ptr1;
	while(ptr2.next != null){
		if(ptr1.data == ptr2.next.data){
		ptr2.next = ptr2.next.next;
		System.gc();
		}	
		else{
		ptr2 = ptr2.next;
		}
	}
	ptr1 = ptr1.next;
	}
	}
	void print(Node node){
	while(node != null){
	System.out.println(node.data + " " );
	node = node.next;
	}
	}
	public static void main(String []args){
	LinkedList l = new LinkedList();
	l.head=new Node(1);
	l.head.next = new Node(5);
		l.head.next.next = new Node(1);
		l.head.next.next.next = new Node(2);
		l.head.next.next.next.next = new Node(3);
		l.head.next.next.next.next.next = new Node(4);
		l.head.next.next.next.next.next.next = new Node(5);
		System.out.println("Given list");
		l.print(head);
		System.out.println("List after removing duplicates :");
		l.removedup();
		l.print(head);
		l.Rev(l.head,3);
		l.print2();
	}
	}
