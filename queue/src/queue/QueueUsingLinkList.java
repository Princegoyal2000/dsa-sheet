package queue;

public class QueueUsingLinkList<T> {

	Node<T> front;
	Node<T> rear;
	int size;
	public QueueUsingLinkList()
	{
		front=null;
		rear=null;
		size=0;
	}
	int size()
	{
		return size;
	}
	boolean isEmpty() {
		return size()==0;
	}
	T front() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();	
	    }
		return front.data;
	}
	void enque(T element)
	{
		Node<T> newNode= new Node<T>(element);
		if(rear==null)
		{
			front=newNode;
			rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;			
		}

		size++;
		
	}
	T deque() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		T temp=front.data;
		front=front.next;
		if(size==1)
		{
		rear=null;	
		}
		size--;
		return temp;
	}
}
