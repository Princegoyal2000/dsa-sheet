import java.util.*;

 class MinPQ_comparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return -1;
		else if(o1>o2)
			return 1;
		return 0;
	}
	
}
 class MaxPQ_comparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		return 0;
	}
	
}
 class StrPQ_comparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length() < o2.length())
			return -1;
		else
			if(o1.length() > o2.length())
			return 1;
		return 0;
	}
	 
 }
public class Priority_Queue_Use {

	private static void MininsertIntoVirtualHeap(int[] arr, int i) {
	
		int childIndex=i;
		int parentIndex = (childIndex-1)/2;
		while(childIndex > 0)
		{
			if(arr[childIndex] < arr[parentIndex])	
			{
			
				int temp = arr[childIndex];
				arr[childIndex]=arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;		
			}
			else
			{
				return;
			}
		}
		
	}
	private static int removeMinVirtualHeap(int[] arr, int heapSize) {
     
		int temp =arr[0];
		arr[0]=arr[heapSize-1];
		heapSize--;
		int index=0;
		int leftChild = 2*index+1;
		int rightChild = 2*index+2;
		while(leftChild > heapSize)
		{
			int minIndex = index;
			if(arr[leftChild] > arr [minIndex])
			{
				minIndex=leftChild;
			}
			if( rightChild < heapSize && arr[rightChild] > arr[minIndex])
			{
				minIndex=rightChild;
			}
			if(minIndex != index)
			{
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]=temp1;
				index = minIndex;
				leftChild = 2*index+1;
				rightChild = 2*index+2;
			}
				
			else {
				break;		
			}
		}
		return temp;
	}
	public static void kLargetElements(int arr[] , int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
		{
		  pq.add(arr[i]);	
		}
		for(;i<arr.length;i++)
		{
			int min = pq.element();
			if(min < arr[i])
			{
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
	public static void sortKsorted(int arr[], int k)
	{

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i =0;
		for(;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++)
		{
			arr[i-k]=pq.remove();
			pq.add(arr[i]);
		}
		for(int j = arr.length-k; j <arr.length;j++)
		{
			arr[j]=pq.remove();
		}
		
	}
	public static void Max_Insert_Priority_Queue(int arr[],int i)
	{
		int childIndex = i;
		int parentIndex = (childIndex-1)/2;
		while(childIndex > 0)
		{
			if(arr[childIndex] > arr[parentIndex])
			{
				int temp = arr[parentIndex];
				arr[parentIndex]= arr[childIndex];
				arr[childIndex]=temp;
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
				
			}
			else
				return ;
		}
	}
    public static int Max_remove_PQ(int arr[],int heapSize)
    {
    	int temp = arr[0];
    	arr[0]= arr[heapSize-1];
    	heapSize--;
    	int index =0;
    	int leftChild= 2* index +1;
    	int rightChild = 2* index +2;
    	while(leftChild < heapSize)
    	{
    		int minIndex=index;
    		if( arr[leftChild] > arr[minIndex])
    			minIndex = leftChild;
    		
    		if( rightChild < heapSize && arr[rightChild] > arr[minIndex] )
    			minIndex = rightChild;
    		
    		if(minIndex== index)
    			break;
    		else {
    			int temp1 = arr[index];
    			arr[index] = arr[minIndex];
    			arr[minIndex] = temp1;
    			index = minIndex;
    			leftChild= 2* index +1;
    	    	rightChild = 2* index +2;
    		}
    	}
    	return temp;
    }
    public static int find_kth_larger_element(int[] arr,int k)
    {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	int i=0;
    	for(;i<k;i++) {
    		pq.add(arr[i]);
    	}
    	for(;i<arr.length;i++)
    	{
    		int min = pq.element();
    		if(min<arr[i])
    		{
    			pq.remove();
    			pq.add(arr[i]);
    		}
    	}
    	return pq.element();
    	
    }
	public static void main(String[] args)  {
		
		
//		String arr[]= {"a","ab","abc"};
//		MinPQ_comparator min_com = new MinPQ_comparator();
//		MaxPQ_comparator max_com = new MaxPQ_comparator();
//		StrPQ_comparator str_com = new StrPQ_comparator();
//		PriorityQueue<String> pq = new PriorityQueue<>(str_com);
		int arr[]= {2,4,1,9,6,8};
//		for(int i=0;i<arr.length;i++)
//		Max_Insert_Priority_Queue(arr,i);
	
//		for(int i =0;i<arr.length;i++)
//		{
//		insertIntoVirtualHeap(arr,i);	
//		}
//		sortKsorted(arr,3);
//		for(int i =0;i<arr.length;i++)
//		{
//			pq.add(arr[i]);
//		}
//		while(!pq.isEmpty())
//		{
//			System.out.print(pq.remove()+" ");
//		}
//		
//		System.out.println();
//		for(int i =0;i<arr.length;i++)
//		{
//		arr[arr.length-1-i]=removeMinVirtualHeap(arr,arr.length-i);	
//		}
//		for(int i =0;i<arr.length;i++)
//		{
//		arr[arr.length-1-i]=Max_remove_PQ(arr,arr.length-i);	
//		}
//		for(int i =0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		System.out.print(find_kth_larger_element(arr,5));

	      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		Priority_Queue pq = new Priority_Queue();
//		int arr[]= {5,1,9,2,0};
//		for(int i =0;i<arr.length;i++)
//		{
//		pq.insert(arr[i]);	
//		}
////		while(!pq.isEmpty())
////		{
////			System.out.print(pq.remove()+" ");
////		}
//		System.out.print(pq.remove()+" ");
	}



}
