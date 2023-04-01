import java.util.HashMap;
import java.util.Map.Entry;

public class MaximumFrequency {

	public static int MaximumFrequency(int arr[])
	{
		HashMap<Integer,Integer> MaxFreq = new HashMap<Integer,Integer>();
		
		for(int i =0;i<arr.length;i++)
		{    
			if(MaxFreq.containsKey(arr[i]))
			{
				int freq=MaxFreq.get(arr[i]);
//				System.out.println(freq+ " HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"  + arr[i]);
				freq++;
				MaxFreq.put(arr[i], freq);
            }
			else
			MaxFreq.put(arr[i],1);
		}
		int max_count=0;
		int res=-1;
		for(Integer key: MaxFreq.keySet() )
		{
			if(max_count < MaxFreq.get(key))
			{
				res = key;
				max_count = MaxFreq.get(key);
				
			}
			
		}
		return max_count;

        		
	}
	public static void main(String[] args) {
		
	int arr[]= {1,3,55,6,7,8,4,5,2,3,5,2,4,9,7,3};
	System.out.println(MaximumFrequency(arr));

	}

}
