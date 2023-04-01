import java.util.*;
public class Largest {
	public static int largest(int input[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>max)
			{
				max=input[i];
			}
		}
		return max;
	}
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
	public static void print(int input[]) {
		int size=input.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println(" ");
	}
	public static void error()
	{ 
		int i=1;
		if(i<5)
			System.out.println("true");
		else if(i<10)
			System.out.println("false");
	}
public static void main(String args[]) {
//	int arr[]=takeArray();
//	print(arr);
//	int largest=largest(arr);
//	System.out.println("Largest number is "+largest);
	error();
	
	
}
}
