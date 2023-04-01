import java.util.HashMap;

public class Array_Intersection {

	public static void array_intersection(int arr1[],int arr2[])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			if(!hm.containsKey(arr1[i]))
			{
				hm.put(arr1[i], 1);
			}
			else
			hm.put(arr1[i],hm.get(arr1[i])+1);
        }
		for(int i=0;i<arr2.length;i++)
		{
			if(hm.get(arr2[i]) != null)
			{
				System.out.println(arr2[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {5,6,7,8,1};
		array_intersection(arr1,arr2);

	}

}
