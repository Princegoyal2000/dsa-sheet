import java.util.*;
public class interectionArray {
	public static int[] takeArray()
	{
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void intersection(int arr[],int arr1[])
	{
//	  int i=0;
//	  int j=0;
//	  while(i<arr.length && j<arr1.length)
//	  {
//		  if(arr[i]==arr1[j])
//		  {
//			  System.out.println(arr[i]);
//			  i++;
//			  j++;
//		  }
//		  else if(arr[i]>arr[j])
//		  {
//			  j++;
//		  }
//		  else
//		  {
//			  i++;
//		  }
//	
//	  }
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]+" ");
					arr1[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
public static void main(String args[])
{
 int arr[]=takeArray();
 int arr1[]=takeArray();
 intersection(arr,arr1);
	
}
}
