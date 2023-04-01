import java.util.ArrayList;

public class Priority_Queue {
	ArrayList<Integer> heap = new ArrayList<>();
	boolean isEmpty()
	{
		return heap.size()==0;
	}
	int size()
	{
		return heap.size();
	}
	int getMin() throws Priority_Queue_Empty_Exception
	{
		if(isEmpty())
		{
			throw new Priority_Queue_Empty_Exception();
		}
		return heap.get(0);
	}
	void insert(int element)
	{
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while(childIndex >= 0)
		{
			if(heap.get(childIndex) < heap.get(parentIndex))
			{
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}else {
				return ;
			}
		}
	}
	int remove() throws Priority_Queue_Empty_Exception {
		if(isEmpty())
		{
			throw new Priority_Queue_Empty_Exception();
		}
		int temp = heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int index=0;
		int parentIndex= index;
		int leftChild=  1;
		int rightChild = 2;  	

		while(leftChild < heap.size())
		{   
			if(heap.get(leftChild) < heap.get(parentIndex))
			{
				parentIndex = leftChild;
			}
			if(rightChild<heap.size() && heap.get(rightChild) < heap.get(parentIndex))
			{
				parentIndex = rightChild;
			}
			if(parentIndex == index)
				break;
			else
			{
				int temp1 = heap.get(index);
				heap.set(index, heap.get(parentIndex));
				heap.set(parentIndex, temp1);
				index = parentIndex;
				leftChild = 2*index + 1;
				rightChild =  2*index+2;
			}
		}
		return temp;
	}

}
