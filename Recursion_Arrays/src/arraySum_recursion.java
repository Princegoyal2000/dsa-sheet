
public class arraySum_recursion {
	public static int sum1(int[] input,int n)
	{
		if(n<=0)
		{
			return 0;
		
		}
//		int smallArray[]=new int[input.length-1];
//		for(int i=0;i<input.length-1;i++)
//		{
//			smallArray[i]=input[i];
//		}
			return input[n-1]+sum1(input,n-1);
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5};
       System.out.println(sum1(arr,arr.length));
	}

}
