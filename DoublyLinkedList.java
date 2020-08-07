class Node
{
	int data;
	Node prev;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
}


public class DoublyLinkedList {
	
	static Node head;
	
	public static void insert(int data)
	{
		Node newNode = new Node(data);
		
		newNode.next=head;
		newNode.prev=null;
		
		if(head!=null)
		{
			head.prev=newNode;
		}
		
		head= newNode;
	}
 
	public static void delete(Node del)
	{
		if (head == null || del == null) { 
            return; 
        } 
		
		 if (head == del) { 
	            head = del.next; 
	        } 
		 
		 if (del.next != null) { 
	            del.next.prev = del.prev; 
	        } 
		 
		 if (del.prev != null) { 
	            del.prev.next = del.next; 
	        } 
		 
		 return;
	}
	
	
	public static void main(String[] args) {
		
		
		insert(2);
		delete(head.next);
		

	}

}