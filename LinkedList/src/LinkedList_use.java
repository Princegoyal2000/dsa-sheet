//    	if(head!=null)
//    	{   head1=head;
//        	Node<Integer> tail1=middle(head1);
//        	 head2=tail1.next;
//        	tail1.next=null;
//        	merge_sort(head1);
//        	merge_sort(head2);
//        	head=mergeLL(head1,head2);
//    	}
import java.util.Scanner;

public class LinkedList_use {
	public static Node<Integer> deletion(Node<Integer> head,int pos)
	{
		Node<Integer> temp=head;
		
		if(pos==0) { 
			head=head.next;
			return head;
		}
		
		else 
		{    
			int i=0;
             while(i<pos-1)
             {
        	   temp=temp.next;
        	   i++;
             }
            if(temp.next.next==null)
            {
        	  temp.next=null;
            }
            else
            {
            	temp.next=temp.next.next;
            }
            return head;
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
	public static Node<Integer> insert(Node<Integer> head,int data ,int pos)
	{
			Node<Integer> newNode= new Node<Integer>(data);
			if(pos==0)
			{
				newNode.next=head;
				return newNode;
			}
			Node<Integer> temp=head;
			int i=0;
			while(i<pos-1)
			{
				temp=temp.next;
				i++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			return head;
	}
	public static Node<Integer> removeDuplicates(Node<Integer> head) {

	    if(head==null || head.next == null)
  	        return head;
	    
	    Node<Integer> temp = head;
	    
	    while(temp.next!=null){
	        
	        if(temp.data.equals(temp.next.data))
	            
	            temp.next = temp.next.next;
	        
	        else
	            temp = temp.next;
	        
	       
	    }
	    return head;
	    
	}
	public static int termNlast(Node<Integer> head,int n)
	{    
		if(head==null)
		{
			return -1;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		for(int i=0;i<n;i++)
		{    if(fast.next!=null)
			fast=fast.next;
		}
		if(fast.next == null)
		{
			return fast.data;
		}
		else
		{		
			while(fast.next!=null)
			{
				fast=fast.next;
				slow=slow.next;
			}
			return slow.data;
		}
	}
	public static Node<Integer> rotate(Node<Integer> head,int k)
	{
		Node<Integer> walk= head;
		Node<Integer> prev = null;
		
		while(k>0 && walk!=null)
		{
			prev=walk;
			walk=walk.next;
		
			k--;
		}
		//System.out.println(walk.data);
		Node<Integer> newNode=walk;
		prev.next=null;
		while(walk.next!=null)
		{
			walk=walk.next;
		}
		walk.next=head;
		return newNode;
	}
	public static void print(Node<Integer> head)
	{
        while(head !=null)
        {
        	System.out.print(head.data+" ");
        	head=head.next;
        }
	}
	public static Node<Integer> reverse(Node<Integer> head)
	{
//		Node<Integer> currNode,nextNode,prev;
//		prev=null;
//		currNode=nextNode=head;
//		while(nextNode!=null)
//		{
//			nextNode=nextNode.next;
//			currNode.next=prev;
//			prev=currNode;
//			currNode=nextNode;
//		}
//		return prev;
		if(head==null || head.next==null)
			return head;
		Node<Integer> reversetail=head.next;
		Node<Integer> smallans=reverse(head.next);
		reversetail.next=head;
		head.next=null;
		return smallans;
	}
	public static Node<Integer> listCut(Node<Integer> head) {
		
		  Node<Integer> slow=head;
		  Node<Integer> fast=head;
		    while(fast.next.next!=null)
		    {
		      slow=slow.next;
		      fast=fast.next.next;
		    }
		    Node<Integer> newNode=slow.next;
		    slow.next=head;
		    if(fast.next.next==null)
		    	fast=fast.next;

		    return newNode;
		  }
    public static Node<Integer> middle(Node<Integer> head)
  {
	  Node<Integer> fast=head;
	  Node<Integer> slow=head;
	  while(fast!=null && fast.next!=null)
	  {
		  slow=slow.next;
		  fast=fast.next.next;
	  }
	  return slow;
	  
  }
    public static Node<Integer> maxtoTail(Node<Integer> head)
    {
    	Node<Integer> maxNode=head; 
    	Node<Integer> curr=head.next; 
    	Node<Integer> prev=head ;
    	Node<Integer> maxprev=null;
    	while(curr!=null)
    	{ 
    		if(curr.data > maxNode.data)
    		{
    			maxNode=curr;
    			maxprev=prev;
    		}
    		prev=curr;
    		curr=curr.next;
    	}
    	if(maxNode!=prev)
    	{
    		maxprev.next=maxNode.next;
    		maxNode.next=null;
    		prev.next=maxNode;
    	}
    	return head;
    	
    }
    public static Node<Integer> mintoHead(Node<Integer> head)
    {
    	Node<Integer> minNode=head; 
    	Node<Integer> curr=head.next; 
    	Node<Integer> prev=head ;
    	Node<Integer> minprev=null;
    	while(curr!=null)
    	{ 
    		if(curr.data < minNode.data)
    		{
    			minNode=curr;
    			minprev=prev;
    		}
    		prev=curr;
    		curr=curr.next;
    	}
    	if(minNode!=head)
    	{
    		minprev.next=minNode.next;
    		minNode.next=head;
    		head=minNode;
    	}
    	return head;
    }
    public static Node<Integer> mintoHead_maxtoTail(Node<Integer> head)
    {
    	if(head == null || head.next==null)
    		return head;
    	head=mintoHead(head);
    	head=maxtoTail(head);
    	return head;
    }
    public static Node<Integer> mergeLL(Node<Integer> head1,Node<Integer> head2)
    {
    	Node<Integer> head3,tail3;
    	if(head1.data<head2.data)
    	{ 
    		head3=head1;
    		tail3=head1;
    		head1=head1.next;
    	}
    	else
    	{
    		head3=head2;
    		tail3=head2;
    		head2=head2.next;
    	}
    
    	
    	while(head1!=null && head2!=null)
    	{   
    		if(head1.data<head2.data)
    		{
    			tail3.next=head1;
    			tail3=head1;
    			head1=head1.next;
    		}
    		else
    		{
    			tail3.next=head2;
    			tail3=head2;
    			head2=head2.next;
    		}
    	}
    	if(head1!=null)
    	{
    		tail3.next=head1;
    	}
    	if(head2!=null)
    	{
    		tail3.next=head2;
    	}
    	return head3;
    }
//    public static Node<Integer> merge_sort(Node<Integer> head)
//    {
//    	if(head!=null)
//    {  
//   
//    	Node<Integer> head1=head;
//    	Node<Integer> head2,tail1;
//    	tail1=middle(head);
//    //	System.out.println(tail1.data);
//    	head2=tail1.next;
//    	System.out.println(head2.data);
//    	tail1.next=null;
//    	merge_sort(head1);
//    	merge_sort(head2);
//    	head=mergeLL(head1,head2);
//    }

    	

    	
    //	return head;

 //   }
    public static Node<Integer> insertR(Node<Integer> head,int pos,int elem)
    {
    	if(head==null || head.next==null)
    	{
    		return head;
    	}
    	if(pos==0)
    	{
    		Node<Integer> newNode=new Node<>(elem);
    		newNode.next=head;
    		return newNode;
    	}
    	head.next=insertR(head.next,pos-1,elem);
    	return head;
    }
    public static Node<Integer> deleteR(Node<Integer> head,int pos)
    {
    	if(pos==0)
    	{
    		return head.next;
    	}
    	if(head==null || head.next==null)
    	{
    	 return head;
    	}
    	head.next=deleteR( head.next,pos-1);
    	return head;
    }
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
        if(n==0 ||head==null)
            return head;
        
        Node<Integer> slow=head;
        Node<Integer> fast=head;
		// LinkeListNode<Integer> initial=head;
        for(int i=0;i<n;i++)
        {
         fast=fast.next;   
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        
        return head;
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Node<Integer> node1= new Node<Integer>(10);
//        Node<Integer> node2= new Node<Integer>(20);
//        Node<Integer> node3= new Node<Integer>(30);
//        node1.next=node2;
//        node2.next=node3;
//        Node<Integer> head=node1;
//        print(head);
//       // print(head);
//       
		Node<Integer> head= takeInput();
		Node head2= takeInput();
		//int mid = middle(head);
		///print(rotate(head,2));
		//System.out.println(termNlast(head,1));
		//head = insert(head,40,1);
		
//		head = deletion(head,5);
//		head=appendLastNToFirst(head,3);
//		print(insertR(head1,2,10));
//		System.out.print(!head1.data);
//		head = removeDuplicates(head);
		head = reverse(head);
		print(head);
//		print(mintoHead_maxtoTail(head));
		//print(mergeLL(head1,head2));
		//print(merge_sort(head1));
//		print(head1);
	}

}
