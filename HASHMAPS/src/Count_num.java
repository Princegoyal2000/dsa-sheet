import java.util.*;
public class Count_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,2,1,4,2,4,5,3};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		for(Integer i : map.keySet())
		{
			System.out.println(i+" "+map.get(i));
		}
		

	}

}
