import java.util.Scanner;

class Node1 {
	int data;
	Node1 next;
	
	Node1(int data){
		this.data=data;
		next = null;
		
	}
}
	

public class Plindrome {
	  public static Node1 reverse(Node1 head)
	  {
	    if(head==null || head.next==null)
	    {
	      return head;
	    }
	    Node1 temp=head;
	    Node1 tail=head.next;
	    Node1 small=reverse(head.next);
	    tail.next=temp;
	    temp.next=null;
	    return small;
	    
	    
	  }
	  static int checkPalindrome(Node1 head) {
	   Node1 slow=head;
	    Node1 fast=head;
	    while(fast!=null && fast.next!=null)
	    {
	      slow=slow.next;
	      fast=fast.next.next;
	    }
	  //  System.out.println(slow.data);
	    Node1 slow1=reverse(slow);
	    
	    slow=slow1;
	    
	    while(head!=slow && slow1!=null)
	    {   
//	    	System.out.println(head.data+" "+slow1.data);
	      if(head.data!=slow1.data)
	      {
	        return 0;
	      }
	      head=head.next;
	      slow1=slow1.next;
	    }
	    return 1;
	    
	  }
		public static void print(Node1 head)

		{
	        while(head !=null)
	        {
	        	System.out.print(head.data+" ");
	        	head=head.next;
	        }
		}
		public static Node1 takeInput()

		{
			Node1 head=null,tail=null;
			Scanner s = new Scanner(System.in);
			int data=s.nextInt();
			while(data !=-1)
			{
				Node1 newNode= new Node1(data);
				if(head==null)
				{
					head=newNode;
					tail=newNode;
				}
				else
				{
					//for this time complexibility will be O(n2)
//					Node<Integer> temp = head;
//					while(temp.next != null)
//					{
//						temp=temp.next;
//					}
//					temp.next=newNode;
					
					
					
					
					//now for this submission time complexibilty reduces to the order of n
					tail.next=newNode;
					tail=tail.next;
				} 
				data=s.nextInt();
			}
			return head;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Node1 head=takeInput();
       //print(head);
       System.out.println(checkPalindrome(head));
	}

}
