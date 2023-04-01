import java.util.Arrays;

public class target_pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,1,0,2,-2,4,2};
		int target=6;
		int left=0;
		int right=arr.length-1;
		Arrays.sort(arr);
		while(left<right)
		{
		 if(arr[left]+arr[right]>target)
			 right--;
		 else if(arr[left]+arr[right]<target)
			 left++;
		 else
		 {
			 System.out.println(arr[left]+" "+arr[right]);
			 left++;
			 right--;
		 }
		}

	}

}
