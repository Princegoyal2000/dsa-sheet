import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
 
	public static ArrayList<Integer> removeDuplicates(int arr[])
	{   
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> seen = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(seen.containsKey(arr[i]))
			{
				continue;
			}
			output.add(arr[i]);
			seen.put(arr[i],true);
		}
		return output;
	}
	public static void main(String[] args) {
	
		int a[]= {1,2,1,1,11,1,2,3,2,4,6,5,10000,6};
		ArrayList<Integer> output = removeDuplicates(a);
		for(int i=0;i<output.size();i++)
		{
		  System.out.println(output.get(i));	
		}

	}

}
