import java.util.HashMap;

public class Pair_sum_0 {
 
	public static void sum_0_pairs(int arr[], int n) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		{
			for(int i=0;i<arr.length;i++)
			{
				if(!hm.containsKey(arr[i]))
				{
					hm.put(arr[i],0);
				}
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			int twice_count=0;
			for(int i=0;i<arr.length;i++)
			{
				
					if(hm.get(n-arr[i])!=null)
					{    	
						twice_count += hm.get(n-arr[i]);
						System.out.println(arr[i]+" "+(n-arr[i]));
					}
					if(n-arr[i]==arr[i])
					{
						twice_count--; 
					}
				
			}
			System.out.println(twice_count/2);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,-2,3,-1,5,6,7};
		sum_0_pairs(arr,0);

	}

}
