package queue;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray()
	{
		data = new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public QueueUsingArray(int capacity)
	{
		data = new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {

		return size;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public int front() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		return data[front];
	}
	void enque(int element) throws QueueFullException
	{
		if(size==data.length)
	    {
		doubleCapacity();
     	}
		if(size==0)
	    front=front+1;
		rear=(rear+1)%data.length;
		size++;
		data[rear]=element;
	}
	public void doubleCapacity() {
		int temp[]=data;
		int index=0;
		data=new int[2* temp.length];
		for(int i=front;i<temp.length;i++)
		{
			data[index]=temp[i];
			index++;
		}
		for(int i=0;i<front;i++)
		{
			data[index]=temp[i];
			index++;
		}
		front=0;
		rear=temp.length-1;
	}
	public int deque() throws QueueEmptyException
	{
		if(size==0)
		{
			throw new QueueEmptyException();
		}
		int temp = data[front];
		front=(front+1)%data.length;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return temp;
	}

}
