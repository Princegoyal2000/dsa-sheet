import java.util.*;
public class populate {

	public static void populate(int n)
	{
		int arr[]= new int[n];
		int left=0;
		int right=n-1;
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
				arr[left++]=i;
			else
				arr[right--]=i;
		}
		for(int val : arr)
		{
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		populate(n);

	}

}
