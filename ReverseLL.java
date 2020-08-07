import java.util.Scanner;

public class ReverseLL {
   
	public static Node takeInput()
	{
		Node head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node(data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
			}
			else
			{	
				tail.next= newNode; 
				tail= newNode;
			} 
			
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node reverseR(Node head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		
		Node finalHead=reverseR(head.next);
		Node temp= finalHead;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=head;
		head.next=null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		
		Node head = takeInput();
		
		reverseR(head);
		
		
	}
}