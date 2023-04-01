import java.util.Scanner;

public class ReverseBetter {
	public static void print(Node<Integer> head)

	{
        while(head !=null)
        {
        	System.out.print(head.data+" ");
        	head=head.next;
        }
	}
	public static Node<Integer> takeInput()

	{
		Node<Integer> head=null,tail=null;
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		while(data !=-1)
		{
			Node<Integer> newNode= new Node<Integer>(data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				//for this time complexibility will be O(n2)
//				Node<Integer> temp = head;
//				while(temp.next != null)
//				{
//					temp=temp.next;
//				}
//				temp.next=newNode;
				
				
				
				
				//now for this submission time complexibilty reduces to the order of n
				tail.next=newNode;
				tail=tail.next;
			} 
			data=s.nextInt();
		}
		return head;
	}
	public static doubleNode reverseLinked_list(Node<Integer> head)
	{
		if(head==null || head.next==null )
		{
			doubleNode ans = new doubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		
			doubleNode smallans = reverseLinked_list(head.next);
			smallans.tail.next=head;
			head.next=null;
			
			doubleNode ans1 = new doubleNode();
			ans1.head=smallans.head;
			ans1.tail=head;
			return ans1;
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		//print(head);
		doubleNode ans=reverseLinked_list(head);
		print(ans.head);

	}

}
