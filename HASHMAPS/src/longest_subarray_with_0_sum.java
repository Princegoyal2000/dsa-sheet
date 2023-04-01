''import java.util.HashMap;

public class longest_subarray_with_0_sum {

	public static void long_sub_0(int arr[])
	{
		int max_l = 0;
		int sum=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			if(!map.containsKey(sum))
			{
				
				map.put(sum,i);
			}
			else
			{
				int length = i - map.get(sum);
				if(max_l<length)
				{
					max_l = length;
				}
			}
		}          
		System.out.println(max_l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {95 ,-97, -387, -435, -5, -70, 897, 127, 23 ,284};
		long_sub_0(arr);

	}

}
