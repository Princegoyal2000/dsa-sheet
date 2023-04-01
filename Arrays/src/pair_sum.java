                  import java.util.Arrays;

public class pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,3 ,6, 2, 5, 4, 3, 2, 4};
		Arrays.sort(arr);
		
		int target=7;
		int l=0;
		int r=arr.length-1;
		int count=0;
		while(l<r)
		{
			if(arr[l]+arr[r]==target)
			{
				count++;
				l++;
				r--;
			}
			else if(arr[l]<arr[r])
				r--;
			else
				l++;
			
		}
		System.out.println(count);

	}

}
