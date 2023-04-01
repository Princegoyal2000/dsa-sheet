import java.util.HashMap;

public class pair_at_difference_k {
	public static void pair_At_difference(int arr[] , int k)
	{
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int val : arr)
		{
			map.put(val, true);
		}
		for(int val : arr)
		{
			if(map.containsKey(val+k))
			{
				System.out.println(val+" "+(val+k));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,2,4};
		pair_At_difference(arr,3);
		

	}

}
